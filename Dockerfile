FROM eclipse-temurin:17 AS usejdk
RUN java -version

FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /var/lib/docker/volumes/install-jenkins-docker_jenkins-data/_data/workspace/my-first-app/
RUN pwd
RUN mvn -v
RUN mvn clean install

FROM usejdk
EXPOSE 8123
COPY --from=build /target/my-first-app.jar my-first-app/
ENTRYPOINT ["java","-jar","/my-first-app.jar"]