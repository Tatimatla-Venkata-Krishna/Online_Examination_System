# Build the Spring Boot application with Maven and Java 25
FROM maven:3.9-eclipse-temurin-25 AS build

WORKDIR /app

# Copy Maven configuration and source code
COPY pom.xml .
COPY src ./src

# Build the executable Spring Boot JAR
RUN mvn -B clean package -DskipTests

# Run the application
FROM eclipse-temurin:25-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

# Render provides PORT; Spring Boot uses 8080 locally by default
EXPOSE 8080

ENV SERVER_PORT=8080

ENTRYPOINT ["java", "-jar", "app.jar"]
