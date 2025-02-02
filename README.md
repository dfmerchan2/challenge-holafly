# AUTOMATION CHALLENGE HOLAFLY

## Technologies and Frameworks:
* **Test Automation Framework:** Serenity BDD - Selenium
* **Mobile Automation:** Appium
* **Behavior-Driven Development (BDD):** Cucumber
* **Unit Testing:** JUnit
* **Code Enhancement:** Lombok
* **Architectural Pattern:** Screenplay
* **Programming Language:** Java 21
* **Dependency Management:** Gradle

## Pre-Conditions:
* **[Java Development Kit (JDK)](https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html):** Java JDK version 21 or higher must be installed and configured on your system. 
* **[Gradle](https://gradle.org/releases/):** Gradle must be installed and configured for project management and dependency resolution.
* **[Appium](https://github.com/appium/appium-desktop/releases)**: Appium must be installed and configured on your system to interact with mobile devices.
* **Device Setup:**  Choose one of the following device options:
  * [Emulator](https://anivaz.medium.com/how-to-set-up-appium-with-android-studio-for-mobile-app-testing-a300b7910364): Android Studio must be installed and configured to launch an Android emulator. 
  * [Real Device](https://docs.katalon.com/katalon-studio/manage-projects/set-up-projects/mobile-testing/android/mobile-set-up-android-real-devices): Your Android device must be configured for testing and connected to your development machine.
* **Project Setup:** Clone the project from the **`main`** branch using the following command:
    * `git clone https://github.com/dfmerchan2/challenge-holaflyt`

## Compilation and execution

### Local execution 
* **Appium Server:** Ensure the Appium server is running.
* **Device Connection:** Connect your physical Android device or launch an Android emulator.
* **Application Installation:** The test framework will automatically download and install the application under test (AUT) on the connected device or emulator.
* **Test Execution:** Execute the test runner.
* **Test execution report:** Once the tests have finished running, open the **`index.html`** file located in the **`target/site/serenity`** folder of your project to view the results report generated by Serenity.

* ### Comandos Gradle
```
gradle build -x test                                                        (Compila el proyecto, excluyendo la ejecución de pruebas.)
gradle test --tests *LoginRunner* =>                                        (Ejecuta un Runner específico llamado)
gradle test aggregate                                                       (Ejecuta toda la suite de pruebas en el proyecto y genera un informe de Serenity.)
gradle clean test --tests "co.com.holafly.runners.*" aggregate -i           (Ejecutar un paquete de Runners, limpia el proyecto, y genera un informe de Serenity, mostrando información detallada)
```

## Video showing the script in execution:
* Click the image or the [link](https://www.youtube.com/watch?v=zsdYoTZebjw) to view the execution video.
[![Watch the video](https://img.youtube.com/vi/zsdYoTZebjw/maxresdefault.jpg)](https://www.youtube.com/watch?v=zsdYoTZebjw)

## Author 🤖

* Diego Fernando Merchan Jimenez
    
