package ru.radmitr.spring.springboot.springcoursespringbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* ------------------------------ 8. Spring Boot --------------------------------- */
/* 1. Знакомство со Spring Boot */
/* 2. Создание Spring Boot приложения */
/* 3. Создание REST API. Часть 1 */
/* 4. Создание REST API. Часть 2 */
/* 5. Использование JPA в REST API проекте */
/* 6. Интерфейс JpaRepository */
@SpringBootApplication
//@SpringBootApplication(scanBasePackageClasses = "")
public class SpringCourseSpringbootRestApplication {

    // http://localhost:3333/spring-course-springboot-rest/api/employees
    // http://localhost:3333/spring-course-springboot-rest/api/employees/1

    // http://localhost:3333/spring-course-springboot-rest/actuator
    // http://localhost:3333/spring-course-springboot-rest/actuator/health
    // http://localhost:3333/spring-course-springboot-rest/actuator/info
    // http://localhost:3333/spring-course-springboot-rest/actuator/beans
    // http://localhost:3333/spring-course-springboot-rest/actuator/mappings
    
    public static void main(String[] args) {
        SpringApplication.run(SpringCourseSpringbootRestApplication.class, args);
    }

}
