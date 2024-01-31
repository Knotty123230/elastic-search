FROM openjdk:17
WORKDIR /elastic-search
COPY ./build/libs/*.jar app.jar
EXPOSE 0
ENTRYPOINT ["java", "-jar", "app.jar"]
