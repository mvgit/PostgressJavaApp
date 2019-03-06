FROM tomcat:9.0.16-jre8
ADD /target/AdivaSpringMVCSimpleApp-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/simple.war
EXPOSE 8080