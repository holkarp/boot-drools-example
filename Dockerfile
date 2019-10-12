FROM java:8
LABEL maintainer="prashantaholkar@gmail.com"
VOLUME /tmp
EXPOSE 9191
ARG JAR_FILE=target/MarginEngine.jar
ADD ${JAR_FILE} margin-engine.jar
ENTRYPOINT ["java","-jar","/margin-engine.jar"]