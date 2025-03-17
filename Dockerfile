FROM eclipse-temurin:17-jdk-alpine
COPY ./target/order-collect-0.0.1-SNAPSHOT.jar /opt/app/
WORKDIR /opt/app/
ENTRYPOINT ["java","-jar","order-collect-0.0.1-SNAPSHOT.jar"]