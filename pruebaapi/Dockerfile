FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY ./target/pruebaapi.jar /usr/app
WORKDIR /usr/app
RUN sh -c 'touch pruebaapi.jar'
ENTRYPOINT ["java","-jar","pruebaapi.jar"]