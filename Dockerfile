FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/transactions-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "app.jar"]