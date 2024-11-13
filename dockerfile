# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your build directory into the container
COPY target/jenkins-demo.jar /app/jenkins-demo.jar

# Expose the port on which the Spring Boot app will run
EXPOSE 9090

# Define the entry point for the container
ENTRYPOINT ["java", "-jar", "jenkins-demo.jar"]
