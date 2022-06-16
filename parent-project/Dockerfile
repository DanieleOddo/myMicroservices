FROM maven:3.8.5-jdk-11-slim

WORKDIR /home/compiler

ADD entrypoint.sh entrypoint.sh
CMD [ "entrypoint.sh" ]
ENTRYPOINT ["sh"]