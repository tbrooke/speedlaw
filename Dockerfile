FROM java:8
ADD target/myproj.0.1.0-SNAPSHOT-standalone.jar /srv/myproj-app.jar
EXPOSE 8080
CMD ["java", "-jar", "/srv/myproj-app.jar"]

