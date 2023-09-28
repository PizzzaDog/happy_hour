#FROM openjdk:11-jdk-slim as builder
FROM maven:3.8.1-adoptopenjdk-11 as builder
WORKDIR /opt/app
COPY pom.xml .
RUN mvn -B -f pom.xml dependency:go-offline
COPY ./src ./src
RUN mvn -B install


#FROM openjdk:11-jdk-slim
#WORKDIR /opt/app
#COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar"]