FROM maven:3.8.4-openjdk-17-slim AS tests

WORKDIR /app

COPY testino/pom.xml ./app

WORKDIR /app/testino

RUN mvn clean install

WORKDIR /app

COPY . /app/

CMD ["mvn", "clean", "install"]