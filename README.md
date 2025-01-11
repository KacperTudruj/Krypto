# Krypto

## General info
the project will be a modular monolith and will serve to experiment and learn how to run a project in sprint. W will have a lot of domains that are not related to each other. This will help me to teach someone who has not programmed commercially. In the future, I might be able to separate the monoliths into separate small services.


## Required
- openjdk 21.0.5 2024-10-15 LTS
- Gradle 8.11.1
- git

## Setup
To run this project (The build name may change): 
```
$ ./gradlew build
$ java -jar .\build\libs\krypto-procject-0.0.1-SNAPSHOT.jar
replace the final version in
copy build/libs/*.jar to target/
```
## Setup docker (draft)
```
$ docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/"replace-name" .
# docker run -p 8080:8080 'replace-name'
```

# Creators
- tudi - I have nearly 4 years of experience working on Symfony projects in PHP. While I’m not saying I’m bored with it, I’d like to explore new technologies and broaden my skill set. Specifically, I’m interested in mastering event-driven systems and microservices in the future.
I also recognize that PHP is often seen in the market as a full-stack technology, frequently associated with tasks like tweaking tables on the frontend. My goal is to expand my skills, become more competitive in the job market, and, hopefully, increase my earning potential.