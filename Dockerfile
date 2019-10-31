FROM maven:latest AS SPJAppBuild
WORKDIR /usr/src/adiva
COPY pom.xml .
RUN mvn -B -f pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
COPY . .
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package -DskipTests

FROM tomcat:9.0.16-jre8
WORKDIR /usr/local/tomcat/webapps
COPY --from=SPJAppBuild /usr/src/adiva/target/AdivaSpringMVCSimpleApp-0.0.1-SNAPSHOT.war ./simple.war
EXPOSE 8080