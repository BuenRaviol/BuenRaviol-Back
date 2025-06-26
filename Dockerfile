FROM openjdk:17-jdk-slim
ARG JAR_FILE=build/libs/buenSabor-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} buenSabor.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "buenSabor.jar"]