# Юзать это для билда, потом пушить на докер хаб и оттуда юзать
#FROM eclipse-temurin:17
#
#WORKDIR /app
#
#LABEL maintainer="Smuraha Aleksei"
#LABEL version="1.0"
#LABEL description="Chat Massager"
#
## Copy the packaged jar file into the container
#COPY target/chat_massager.jar /app
## Set timizone
#ENV TZ=Europe/Minsk
#EXPOSE 8088
#RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#
## Run the command to start the application
#CMD ["java", "-jar", "chat_massager.jar"]

FROM alexiandr99/chat_image
ENV TZ=Europe/Minsk
EXPOSE 8088
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone