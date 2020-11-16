# ReactiveDemo
Two applications + configuration for containerized wiremock app to compare performance of Spring MVC app and Spring WebFlux (reactive approach app)

## Wiremock setup
Execute under `${project.dir}/wiremock`
```
docker-compose up -d
```
Wiremock application runs on 8080 port

## Applications
Run `mvn clean build` and launch jar files or run from your favorite IDE.

Spring MVC appication runs on 8081 port, WebFlux application runs on 8082.

## Some results
Tests were run with Jmeter. Number of concurrent users used: 50-1200, rampup: 10sec.

Spring MVC app couldn't handle load of 900 users (20% error), while WebFlux app started responsing with errors only after 2000 concurrent users (1% errors).

Average time and RPS were much better for WebFlux app when testing with multiple users (the difference started to become obvious at 800+ users).
