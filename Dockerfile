FROM eclipse-temurin:17 AS usejdk
EXPOSE 8123
ADD /target/my-first-app.jar /my-first-app
ENTRYPOINT ["java","-jar","/my-first-app.jar"]