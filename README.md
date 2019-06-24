## Dockerize a Spring Boot App with JIB

To run the Spring Boot app locally: `gradle bootRun`

**NOTE**: the following steps require a docker daemon to be running, such as with Docker Desktop

To dockerize the Spring Boot app: `gradle build jibDockerBuild`

To run the dockerized image: `docker run --publish=8080:8080 demo:0.0.1-SNAPSHOT`

