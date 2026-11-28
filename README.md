# Habit Tracker API

A personal habit tracking REST API built with Spring Boot.

## Project Structure

```
src/main/java/Ahmed/com/Habit_Tracker/
│
├── controller/
│   ├── UserController.java
│   ├── HabitController.java
│   └── HabitLogController.java
│
├── service/
│   ├── UserService.java
│   ├── HabitService.java
│   └── HabitLogService.java
│
├── repository/
│   ├── UserRepository.java
│   ├── HabitRepository.java
│   └── HabitLogRepository.java
│
├── model/
│   ├── entity/
│   │   ├── BaseEntity.java
│   │   ├── User.java
│   │   ├── Habit.java
│   │   └── HabitLog.java
│   └── enums/
│       └── HabitFrequency.java
│
├── dto/
│   ├── request/
│   │   ├── CreateUserRequest.java
│   │   ├── CreateHabitRequest.java
│   │   └── LogHabitRequest.java
│   └── response/
│       ├── UserResponse.java
│       ├── HabitResponse.java
│       └── HabitLogResponse.java
│
└── mapper/
    ├── UserMapper.java
    ├── HabitMapper.java
    └── HabitLogMapper.java
```

## Tech Stack

- Java 21
- Spring Boot 4.2.0
- PostgreSQL 15
- Docker & Docker Compose
- MapStruct
- Lombok

## Features

- [ ] User Management (Register / Login)
- [ ] Habit CRUD (Create, Read, Update, Delete)
- [ ] Daily Habit Logging
- [ ] Streak Tracking
- [ ] Statistics

## Database

**Entities:** User → Habit → HabitLog

## How to Run

```bash
docker-compose up -d
./mvnw spring-boot:run
```
