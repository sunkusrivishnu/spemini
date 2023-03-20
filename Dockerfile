FROM openjdk
COPY ./target/spemini-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "spemini-1.0-SNAPSHOT.jar"]