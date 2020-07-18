FROM openjdk:11
ADD target/ecs-fargate-demo.jar ecs-fargate-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ecs-fargate-demo.jar"]