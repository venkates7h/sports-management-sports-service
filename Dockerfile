FROM openjdk:8

EXPOSE 9001

ADD target/sports-management-sports-service.jar sports-management-sports-service.jar

ENTRYPOINT ["java","-jar","/sports-management-sports-service.jar"]
