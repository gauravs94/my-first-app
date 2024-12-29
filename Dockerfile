FROM eclipse-temurin:17 AS usejdk
RUN java -version

FROM maven:3.9.9-eclipse-temurin-17 AS build
RUN mvn -v
RUN mvn clean install

FROM usejdk
EXPOSE 8123
WORKDIR /my-first-app
COPY --from=build /target/my-first-app.jar my-first-app/
ENTRYPOINT ["java","-jar","/my-first-app.jar"]