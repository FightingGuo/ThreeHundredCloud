FROM myjava8:1.0
MAINTAINER guohc
COPY ./ThreeHundredCloud.jar /tmp/ThreeHundredCloud.jar
EXPOSE 8888
EXPOSE 5555
ENTRYPOINT ["java", "-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5555","/tmp/ThreeHundredCloud.jar"]
