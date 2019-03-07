# PostgressJavaApp
Spring mvc web application connecting to postgress DB


Interactive mode
Local DB
docker run --rm -it -p 8080:8080/tcp -e username=postgres -e password=postgres -e url=jdbc:postgresql://host.docker.internal:5432/postgres mvcwithdb:latest
docker run --rm -it  -e JAVA_OPTS='-Dusername=xxxxx -Dpassword=xxxxxx -Durl=jdbc:postgresql://host.docker.internal:5432/postgres' -p 8080:8080/tcp mvcwithdb:latest
AWS cloud DB 
docker run --rm -it -p 8080:8080/tcp -e username=xxxxx -e password=xxxxx -e url=jdbc:postgresql://host:5432/amfam mvcwithdb:latest
Detached mode 
Local DB
docker run --rm -d -p 8080:8080/tcp -e username=xxxxx -e password=xxxxxx -e url=jdbc:postgresql://host.docker.internal:5432/postgres mvcwithdb:latest
AWS cloud DB 
docker run --rm -d -p 8080:8080/tcp -e username=xxxxx -e password=xxxxxx -e url=jdbc:postgresql://host:5432/amfam mvcwithdb:latest

