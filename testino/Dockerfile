FROM maven:3.8.4-openjdk-17-slim AS tests

WORKDIR /app

COPY /testino/pom.xml .


RUN mvn clean install

WORKDIR /app

COPY . .

CMD ["mvn", "clean", "install"]