#!/bin/sh
mvn clean package && docker build -t afterrain/hello-javaeerest .
docker rm -f hello-javaeerest || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-javaeerest afterrain/hello-javaeerest 
