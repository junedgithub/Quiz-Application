FROM openjdk:17

VOLUME /temp

COPY target/quizapp_docker.jar  /usr/app

WORKDIR /usr/app

ENTRYPOINT["java","-jar","quizapp_docker.jar"]