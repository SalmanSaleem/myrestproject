FROM openjdk:8-jre-alpine
COPY ./target/myrestproject-0.0.1-SNAPSHOT.jar /usr/src/hola/
WORKDIR /usr/src/hola
EXPOSE 8080
CMD ["java", "-jar", "myrestproject-0.0.1-SNAPSHOT.jar"]