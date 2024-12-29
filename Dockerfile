FROM eclipse-temurin:17 AS usejdk
EXPOSE 4213
ADD /target/my-first-app.jar my-first-app.jar
ENTRYPOINT ["java","-jar","/my-first-app.jar"]