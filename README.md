# PostgressJavaApp
Spring mvc web application connecting to postgress DB.

This is a spring based java app which uses postgres.

This app uses multi stage docker image build. The Dockerfile has two FROM instructions. The first stage build the spring web application.
The second stage creates the image and copies the war file built in the first stage.

Prerequisites to run the application locally. 
1. Install Postgres db on host machine.
2. Create a postgres database and under public schema create a table namely student.

CREATE TABLE public.student (
 	id int4 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
 	age int4 NOT NULL,
 	"name" varchar(20) NULL,
 	CONSTRAINT student_pk PRIMARY KEY (id)
);

INSERT INTO public.student(
	id, age, name)
	VALUES (10, 10, 'mohan');

To run it locally follow these steps.

Step 1: Clone the repo.

Step 2: Build the image.

docker image build -t spjapp:latest .

Step 3: Run the container.

Docker command for dataSourceWithSecretsManager <br/>
docker run --rm -it -p 8080:8080/tcp spjapp:latest

Docker command for dataSourceWithEnvironmentVariables <br/>
docker run --rm -it -p 8080:8080/tcp -e username=postgres -e password=postgres -e url=jdbc:postgresql://host.docker.internal:5432/postgres spjapp:latest

Docker command for dataSourceWith db.properties File <br/>
docker run --rm -it -p 8080:8080 spjapp:latest

Step 4: To test the app visit:

http://localhost:8080/simple/


Addded docker-compose.yml file to start multi container app. 
This removes the need to install postgres locally. Second step is still required.
Go to Project Root and run
docker compose up