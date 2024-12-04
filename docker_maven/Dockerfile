# Используем официальный образ Maven с Java 17
FROM maven:3.9.1-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY . .
RUN mvn clean package

# Запускаем Maven для сборки проекта
CMD ["mvn", "clean", "compile", "exec:java", "-Dexec.mainClass=App"]
CMD ["sh", "-c", "mvn clean compile exec:java -Dexec.mainClass=App && tail -f /dev/null"]
