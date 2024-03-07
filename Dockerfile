FROM maven:latest
WORKDIR app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
#CMD ["java", "-jar", "target/dockerdemo.jar"]
ENTRYPOINT ["java", "-jar", "target/InClassExercise7_3.jar"]