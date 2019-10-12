FROM java:8
LABEL maintainer="prashantaholkar@gmail.com"
VOLUME /tmp
EXPOSE 9191
ADD target/MarginEngine.jar margin-engine.jar
ENTRYPOINT ["java","-jar","/margin-engine.jar"]