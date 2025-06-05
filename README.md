# 🏗️ Grid Layout App

This is an **Android application** built using **Jetpack Compose**, developed as part of the [Android Basics with Compose course](https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-2). The app showcases a **dynamic grid layout** that efficiently organizes items into a visually appealing and scrollable structure.

---

## 📜 Overview
The **Grid Layout App** implements **Jetpack Compose's LazyVerticalGrid**, allowing for a **modern UI approach** with optimized performance. Each grid item is wrapped in a **Card**, ensuring structured design and adaptability to different screen sizes.

---

## 🚀 Features
✅ **Jetpack Compose-powered dynamic grid** layout  
✅ **LazyVerticalGrid** for smooth scrolling  
✅ **Card-based structure** for polished visuals  
✅ **Adaptive column count (`GridCells.Fixed`, `GridCells.Adaptive`)**  
✅ **Material 3 styling for enhanced aesthetics**  
✅ **Insets handling to align content properly**

---

## 🛠️ Tech Stack
- **Kotlin** 🧑‍💻
- **Jetpack Compose** 💡
- **LazyVerticalGrid for efficient scrolling** 📜
- **Material 3 Components (`Card`, `Scaffold`)** 🎨
- **State Management (`remember`, `mutableStateOf`)** ⚡
- **Android Studio** 🏗️

---

## 📷 App Screenshots

<table>
  <tr>
    <td><img src=".README_images/courses screen.png" alt="Grid Layout Screen 1" width="300"></td>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
    <td><img src=".README_images/courses screen scrolll.png" alt="Grid Layout Screen 2" width="300"></td>
  </tr>
</table>

---

## ✨ Code Highlights
1️⃣ **Grid Layout Implementation (LazyVerticalGrid)**
```kotlin
fun CourseGrid(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(DataSource.topics) {topic ->
            CourseDetails(topic)
        }
    }
}           

