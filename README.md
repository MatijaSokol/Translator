# Translator
**Kotlin Multiplatform Mobile (KMM)** is a SDK designed to simplify creating cross-platform mobile applications. With the help of KMM, you can share common code between iOS and Android apps and write platform-specific code only where it’s necessary. For example, to implement a native UI or when working with platform-specific APIs.

Translator is a sample KMM project which include a module with shared code on iOS and Android. Since this project is built on a Windows machine, only Android part is fully made. iOS part can access shared code, but UI is missing (only available on Mac).

This project is made using tutorial provided [here](https://www.youtube.com/watch?v=BLeNI0__gDs).

# Tech stack & Open-source libraries
 - Minimum SDK level 24
 - Coroutines + Flow for asynchronous
 - Ktor: Construct the REST APIs + Serialization
 - SQLDelight: Typesafe Kotlin APIs for SQL database
 - Coil: An image loading library backed by Kotlin Coroutines
 - Tests: Unit (JUnit) + UI (Compose)
- Jetpack
  - Lifecycle: Observe Android lifecycles and handle UI states upon the lifecycle changes
  - ViewModel: Manages UI-related stuff, data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations
  - Compose: Toolkit for building native UI
  - Hilt for dependency injection
 
Translate #1|Translate #2|Voice to text #1|Voice to text #2
:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:
![](https://github.com/MatijaSokol/Translator/blob/master/previews/screenshot_translate_1.jpg)  |  ![](https://github.com/MatijaSokol/Translator/blob/master/previews/screenshot_translate_2.jpg)  |  ![](https://github.com/MatijaSokol/Translator/blob/master/previews/screenshot_voice_to_text_1.jpg)  |  ![](https://github.com/MatijaSokol/Translator/blob/master/previews/screenshot_voice_to_text_2.jpg)