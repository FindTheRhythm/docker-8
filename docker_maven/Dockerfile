# Используем официальный образ Maven с Java 17
FROM maven:3.9.4-eclipse-temurin-17

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем весь проект в контейнер
COPY . .

# Запускаем Maven для сборки проекта
CMD ["mvn", "clean", "compile", "exec:java", "-Dexec.mainClass=App"]
CMD ["sh", "-c", "mvn clean compile exec:java -Dexec.mainClass=App && tail -f /dev/null"]
