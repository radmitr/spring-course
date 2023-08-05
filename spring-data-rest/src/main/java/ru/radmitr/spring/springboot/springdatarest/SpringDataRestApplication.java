package ru.radmitr.spring.springboot.springdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* ------------------------------ 8. Spring Boot --------------------------------- */
/* 7. Spring Data REST */
/* 8. Знакомство со Spring Boot Actuator */
@SpringBootApplication
public class SpringDataRestApplication {

    // http://localhost:8080/employees
    // http://localhost:8080/employees/1

    // http://localhost:8080/actuator
    // http://localhost:8080/actuator/health
    // http://localhost:8080/actuator/info
    // http://localhost:8080/actuator/beans
    // http://localhost:8080/actuator/mappings

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

}
