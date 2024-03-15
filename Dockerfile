# Use the official OpenJDK image for Java 21
FROM openjdk:21-jdk-slim

# Optional: Set the timezone in the container
#ENV TZ=America/New_York
#RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# Create a directory in the container where the app will be placed
RUN mkdir -p /app

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the /app directory in the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
