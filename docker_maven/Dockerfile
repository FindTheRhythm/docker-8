# Используем официальный образ Maven с JDK 17
FROM maven:3.9.4-eclipse-temurin-17

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем всё содержимое текущей папки в контейнер
COPY . /app

# Выполняем команду Maven по умолчанию
CMD ["mvn", "clean", "install"]
