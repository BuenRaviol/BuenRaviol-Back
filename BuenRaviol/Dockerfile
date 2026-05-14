FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=build/libs/buenSabor-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} buenSabor-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "buenSabor-0.0.1-SNAPSHOT.jar"]
