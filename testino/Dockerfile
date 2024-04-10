FROM maven:3.8.4-openjdk-17-slim AS tests

WORKDIR /app

COPY pom.xml .


RUN mvn -X clean install

WORKDIR /app

COPY . .

CMD ["mvn", "clean", "install"]