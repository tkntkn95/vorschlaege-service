FROM openjdk:11
EXPOSE 8082
ADD target/vorschlaege-service.jar vorschlaege-service.jar
ENTRYPOINT ["java","-jar","vorschlaege-service.jar"]