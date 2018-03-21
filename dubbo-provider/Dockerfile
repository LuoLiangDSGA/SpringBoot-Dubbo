#基础镜像
FROM java:8
MAINTAINER liang.luo ll9420416@icloud.com
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
#RUN bash -c 'touch /app.jar'
EXPOSE 12345 9091 9090
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
