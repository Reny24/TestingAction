FROM maven:4.0.0-openjdk-17-slim AS tests

WORKDIR /app

COPY testino/pom.xml /app

RUN mvn clean install

COPY . /app/

CMD ["mvn", "clean", "install"]