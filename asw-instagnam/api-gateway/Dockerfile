FROM openjdk:8-jdk 

ADD build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "-Xms32m", "-Xmx128m", "app.jar"]
