# PostgressJavaApp
Spring mvc web application connecting to postgress DB


Interactive mode

Docker command for dataSourceWithSecretsManager <br/>
docker run --rm -it -p 8080:8080/tcp mvcwithdb:latest

Docker command for dataSourceWithEnvironmentVariables <br/>
docker run --rm -it -p 8080:8080/tcp -e username=xxxx -e password=xxxx -e url=jdbc:postgresql://host.docker.internal:5432/postgres mvcwithdb:latest
