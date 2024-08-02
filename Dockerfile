FROM openjdk:17.0.2-jdk as build
COPY src /app/src
COPY build.gradle/app// /

WORKDIR /app
