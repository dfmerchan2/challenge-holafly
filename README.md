# CHALLENGE AUTOMATIZACIÓN HOLAFLY

---

## Herramientas implementadas:
* Serenity BDD
* Appium
* Selenium
* Cucumber
* JUnit
* Lombok

### Patron de diseño:
* Screenplay

### Lenguaje de programación:
* Java 21

### Gestor de dependencias:
* Gradle

---

## Pre-Condiciones:
* Tener instalado el [JDK](https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html) de Java con una versión igual o superior a 21
* Tener instalado y configurado [GRADLE](https://gradle.org/releases/).
* Tener instalado [Appium](https://github.com/appium/appium-desktop/releases) en el sistema. 
* Clona el proyecto desde la rama principal **`main`** utilizando el siguiente comando:
    * `git clone https://github.com/dfmerchan2/challenge-holaflyt`
---
## Compilar y ejecutar
* ### Ejecución Mobile
  * Asegúrate de tener el Appium Server en ejecución.
  * Conecte un dispositivo mobile o un emulador (Android studio)
* ### Comandos Gradle
```
gradle build -x test                                                        (Compila el proyecto, excluyendo la ejecución de pruebas.)
gradle test --tests *LoginRunner* =>                                        (Ejecuta un Runner específico llamado)
gradle test aggregate                                                       (Ejecuta toda la suite de pruebas en el proyecto y genera un informe de Serenity.)
gradle clean test --tests "co.com.holafly.runners.*" aggregate -i           (Ejecutar un paquete de Runners, limpia el proyecto, y genera un informe de Serenity, mostrando información detallada)
```

---
## Reporte Serenity
* Una vez completada la ejecución de las pruebas, dirígete a la ruta **"target/site/serenity"** y abre el archivo **index.html** en tu navegador para visualizar el informe generado por Serenity.


---



## Autor 🤖

* Diego Fernando Merchan Jimenez
    