# Sarhan_Java

Чтобы скомпилировать и выполнить код, проделайте следующие шаги (MacOS, Linux)

1. Склонируйте репозиторий

2. Находясь в папке с .git репозиторием, перейдите в папку с кодом

```
cd sarhan_java
```

3.  Создайте .jar пакет через инструмент автоматизации проектов [Maven](https://maven.apache.org/download.cgi)

```
mvn package
```

4. Выполните следующую команду

```
java -cp target/sarhan_java-1.0-SNAPSHOT.jar sarhan_java.App
```

