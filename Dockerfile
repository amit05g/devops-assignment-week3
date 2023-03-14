FROM openjdk:11
EXPOSE 8087
ADD target/devops-assignment-week3.jar devops-assignment-week3.jar
ENTRYPOINT ["java","-jar","/devops-assignment-week3.jar"]