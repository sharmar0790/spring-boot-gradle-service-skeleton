# Spring-Boot Gradle Service Skeleton

This is a sample spring boot service skeleton project using gradle.

## How to start the service locally.
  * From root directory of the project execute below commands
  ```
  $ ./gradlew clean build && ./gradlew bootRun
  ```

  * Or
  ```
  $ ./gradlew build
  $ java -jar application/build/libs/application-1.0.0-SNAPSHOT.jar
  ```

## Endpoints to verify it.
  * http://{host}:8080/api/health
  * http://{host}:8080/api/book/save
  * http://{host}:8080/api/book/all
  * http://{host}:8080/api/book/delete/{id}
