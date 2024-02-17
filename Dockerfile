FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/*.jar /app/spring.jar

EXPOSE 9090

CMD [ "java", "-jar", "spring.jar" ]
