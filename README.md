## What is it?

Spring Boot app on Kotlin / Gradle to showcase Beautrace library. It traces execution of methods per each [Spring](https://spring.io/) Servlet's HTTP request.

Check the library docs here: https://github.com/beautrace/beautrace-spring-servlet

## Quickstart

### Windows

Run
```cmd
gradlew.bat bootRun
```

### Linux, MacOS

Run
```cmd
./gradlew bootRun
```

### Make the app handle some HTTP requests:

- http://localhost:8080/api/mock?argOne=1234&argTwo=wow%20string
- http://localhost:8080/api/exception?argOne=1234&argTwo=wow%20string

### Take a look at method traces

The output file is stored in your home directory.

On Linux, MacOS the path to file is `~/beautrace.json`.

File contents look like the following:
```json
...
{"request":"GET /api/exception?argOne=1234&argTwo=wow%20string,"methodCalls":[...]}
{"request":"GET /api/exception?argOne=1234&argTwo=wow%20string","methodCalls":[...]}
...
```

Each line represents tracing for a different request. Each line is a json object. You can now pick your favorite json parser
and explore tracing for a request of your interest.