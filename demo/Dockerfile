FROM openjdk:8-alpine3.9

COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar /data/
WORKDIR /data

EXPOSE 8080
ENTRYPOINT java -Xmx1024m -XX:MaxMetaspaceSize=256m -jar demo-0.0.1-SNAPSHOT.jar
