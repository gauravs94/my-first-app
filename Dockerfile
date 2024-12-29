FROM eclipse-temurin:17 AS usejdk
WORKDIR /var/jenkins_home/workspace/my-first-app
EXPOSE 8123
ADD /target/my-first-app.jar /var/jenkins_home/workspace/my-first-app
ENTRYPOINT ["java","-jar","/my-first-app.jar"]