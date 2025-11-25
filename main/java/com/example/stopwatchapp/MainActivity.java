package com.example.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // UI Elements
    TextView textViewTimer;
    Button btnStart, btnPause, btnStop;

    // Time tracking variables
    Handler handler = new Handler();
    long startTime = 0L;
    long timeInMillis = 0L;
    long updatedTime = 0L;
    long timeSwapBuff = 0L;
    boolean isRunning = false;

    // Runnable to update timer every second
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            timeInMillis = System.currentTimeMillis() - startTime;
            updatedTime = timeSwapBuff + timeInMillis;

            int secs = (int) (updatedTime / 1000);
            int mins = secs / 60;
            int hrs = mins / 60;

            secs = secs % 60;
            mins = mins % 60;

            textViewTimer.setText(String.format(Locale.getDefault(),
                    "%02d:%02d:%02d", hrs, mins, secs));

            handler.postDelayed(this, 1000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link XML elements
        textViewTimer = findViewById(R.id.textViewTimer);
        btnStart = findViewById(R.id.btnStart);
        btnPause = findViewById(R.id.btnPause);
        btnStop = findViewById(R.id.btnStop);

        // START button
        btnStart.setOnClickListener(v -> {
            if (!isRunning) {
                startTime = System.currentTimeMillis();
                handler.postDelayed(runnable, 0);
                isRunning = true;
            }
        });

        // PAUSE button
        btnPause.setOnClickListener(v -> {
            if (isRunning) {
                timeSwapBuff += System.currentTimeMillis() - startTime;
                handler.removeCallbacks(runnable);
                isRunning = false;
            }
        });

        // STOP/RESET button
        btnStop.setOnClickListener(v -> {
            handler.removeCallbacks(runnable);
            startTime = 0L;
            timeInMillis = 0L;
            updatedTime = 0L;
            timeSwapBuff = 0L;
            isRunning = false;
            textViewTimer.setText(getString(R.string.default_time));
        });
    }
}
