# kotlin-cli

## Technologies used
* Kotlin
* Gradle
* JDK 21
* Clikt

## Local development started

### Prerequisites
Make sure you have the Java JDK 21 installed
You can check which version you have installed using this command:
``` bash
java -version
 ```

### Running the application locally

#### Build
To build locally
``` bash
./gradlew clean build
 ```
or on windows
`gradlew.bat clean build`

#### Running
``` bash
./gradlew run --args="--name=Joakim"
 ```

### Upgrading the gradle wrapper
Find the newest version of gradle here: https://gradle.org/releases/ Then run this command:

``` bash
./gradlew wrapper --gradle-version $gradleVersjon
```

## 👥 Contact

This project is maintained by [CODEOWNERS](CODEOWNERS)

Questions and/or feature requests?
Please create an [issue](https://github.com/MikAoJk/kotlin-cli/issues)
