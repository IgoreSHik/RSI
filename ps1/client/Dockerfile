FROM openjdk:16-alpine3.13
COPY . /usr/src/myapp
COPY java.policy /~
WORKDIR /usr/src/myapp
RUN javac Main.java MyServerInt.java
CMD ["java", "-Djava.security.manager", "-Djava.security.policy=java.policy", "Main"]