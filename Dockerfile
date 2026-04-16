FROM eclipse-temurin:17
WORKDIR /app
COPY target/simple-java-app-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]