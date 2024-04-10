FROM maven:3.8.4-openjdk-17-slim AS tests

WORKDIR /app

COPY testino/pom.xml ./app

CMD ["cd", " /testino"]
RUN mvn clean install

COPY . .

CMD ["mvn", "clean", "install"]