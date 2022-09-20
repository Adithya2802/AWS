FROM openjdk:8
ADD /target/aws-0.0.1-SNAPSHOT.jar aws-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "aws-0.0.1-SNAPSHOT.jar"]
