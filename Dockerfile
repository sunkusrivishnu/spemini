FROM openjdk
COPY ./target/spemini-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "spemini-1.0-SNAPSHOT-jar-with-dependencies.jar"]