package ru.radmitr.spring.springboot.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* ------------------------------ 8. Spring Boot --------------------------------- */
/* 6. Интерфейс JpaRepository */
@SpringBootApplication
public class SpringDataJpaApplication {

    // http://localhost:8080/api/employees
    // http://localhost:8080/api/employees/1

    // http://localhost:8080/actuator
    // http://localhost:8080/actuator/health
    // http://localhost:8080/actuator/info
    // http://localhost:8080/actuator/beans
    // http://localhost:8080/actuator/mappings

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

}
