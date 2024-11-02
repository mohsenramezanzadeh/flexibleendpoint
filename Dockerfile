FROM openjdk:22

COPY target/flexibleendpoint.war app.war

CMD java -jar app.war