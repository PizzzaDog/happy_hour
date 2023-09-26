FROM openjdk:11-jdk-slim as builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY ./src ./src
RUN ./mvnw clean install

FROM openjdk:11-jdk-slim
WORKDIR /opt/app
COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar"]