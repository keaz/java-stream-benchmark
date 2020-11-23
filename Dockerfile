FROM adoptopenjdk/openjdk11:jre-11.0.9_11.1-alpine

WORKDIR /app
COPY target/demo.stream-1.0-SNAPSHOT-jar-with-dependencies.jar .

ENTRYPOINT java -jar demo.stream-1.0-SNAPSHOT-jar-with-dependencies.jar