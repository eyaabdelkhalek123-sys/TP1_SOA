#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="eya.com"

# Add the application's jar to the image
COPY target/film-0.0.1-SNAPSHOT.jar film-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "film-0.0.1-SNAPSHOT.jar"]