# Устанавливаем базовый образ, содержащий JDK
FROM openjdk:latest
# Место рабочей директории внутри контейнера
WORKDIR /usr/src/app
# Копируем исходный код приложения внутрь контейнера
COPY ./src/main/java .
# Компилируем Java исходный код
RUN javac -sourcepath . -d out ./org/example/Main.java
# Теперь рабочая директория - директория с файлами .class
WORKDIR /usr/src/app/out
#CMD java -classpath . org.example.Main
ENTRYPOINT ["java","org.example.Main"]