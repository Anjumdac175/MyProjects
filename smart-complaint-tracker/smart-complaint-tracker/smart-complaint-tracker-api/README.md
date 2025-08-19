# Smart Complaint Tracker API

Java 17 + Spring Boot 3 REST API to manage and analyze complaints.

## Run
```bash
mvn spring-boot:run
```

- Swagger UI: http://localhost:8080/swagger-ui/index.html
- H2 Console: http://localhost:8080/h2-console (JDBC URL: `jdbc:h2:mem:sctdb`)

## Features
- CRUD on complaints (title, description, category, area, status, urgency 1..5)
- Filters: area, status, and search (`q` on title/description)
- Top-k urgent complaints
- Category frequency
- Pagination & sorting
- DTO validation & global exception handling

## Example
```bash
curl "http://localhost:8080/api/complaints/urgent?limit=5"
```
