# ⏱ Stopwatch App

A simple **Android Stopwatch application** that allows users to **start, pause, and reset** a timer. The app is designed with a clean and intuitive UI and includes a footer credit.  

[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Android SDK](https://img.shields.io/badge/Android%20SDK-yes-brightgreen)](https://developer.android.com/studio)
[![License](https://img.shields.io/badge/License-MIT-blue)](LICENSE)

---

## ✨ Features

- **Start Timer:** Begin counting time from 00:00:00.  
- **Pause Timer:** Pause the stopwatch and retain the elapsed time.  
- **Stop/Reset Timer:** Reset the timer to 00:00:00.  
- **Clean UI:** Large timer display with color-coded buttons for Start (green), Pause (yellow), and Stop (red).  
- **Footer Credit:** Displays developer info with a clickable LinkedIn link.  
- **Edge-to-Edge Friendly:** Compatible with modern Android devices and layouts.

---

## 🖼 Screenshots

*(Add your screenshots below for visualization)*

<table>
<tr>
<td>

**Stopwatch Main Screen**<br>
<img src="https://via.placeholder.com/300x600.png?text=Stopwatch+Screen" width="300"/>

</td>
</tr>
</table>

---

## ⚙ How It Works

### 1. MainActivity
- Timer is implemented using a `Handler` and `Runnable` to update the `TextView` every second.  
- **Start Button:** Starts counting from the current time.  
- **Pause Button:** Stops counting while saving the elapsed time.  
- **Stop Button:** Resets the timer and clears all time variables.  

### 2. Time Calculation
- Time is tracked using `System.currentTimeMillis()` for accurate measurement.  
- Elapsed time is calculated using `timeSwapBuff` and `updatedTime` to maintain pause/resume functionality.  
- Timer displays in **HH:MM:SS** format.

### 3. UI Elements
- `TextView` for timer display.  
- Three buttons: Start, Pause, Stop.  
- Footer `TextView` with developer credit and clickable LinkedIn link.

---
## 🛠 Usage

1. Open the project in **Android Studio**.  
2. Build and run the app on an emulator or physical device.  
3. Use the **Start**, **Pause**, and **Stop** buttons to control the stopwatch.  

---

## 💻 Technologies Used

- Java  
- Android SDK  
- Android Studio  
- Handler and Runnable for timing  
- RelativeLayout and LinearLayout for UI design  

---

## 📌 Notes

- Timer runs accurately even when paused and resumed.  
- Color-coded buttons provide clear user interaction.  
- Footer includes clickable developer information.  

---

## 👩‍💻 Author

**Sara Arif** – Developed as part of an Android learning project.  
[LinkedIn](https://www.linkedin.com/in/sara-arif-792p/) | [GitHub](https://github.com/)

