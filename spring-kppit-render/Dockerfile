# Importing JDK and copying required files
FROM eclipse-temurin:21-jdk AS build
EXPOSE 8080
ADD spring-kppit-render/target/spring-kppit-test.jar spring-kppit-test.jar
ENTRYPOINT ["java","-jar","/spring-kppit-test.jar"]