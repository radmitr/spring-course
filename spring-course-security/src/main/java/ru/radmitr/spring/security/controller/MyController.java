package ru.radmitr.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/* ---------------------------- 7. Spring Security ------------------------------- */
/* 1. Знакомство со Spring Security */
/* 2. Конфигурация приложения */
/* 3. Процедура аутентификации */
/* 4. Процедура авторизации */
/* 5. Хранение пароля в БД в не шифрованном формате */
/* 6. Хранение пароля в БД в зашифрованном формате */
@Controller
public class MyController {

    // http://localhost:8080/spring_course_security
    // http://localhost:8080/spring_course_security/login
    // http://localhost:8080/spring_course_security/hr_info
    // http://localhost:8080/spring_course_security/manager_info

    @GetMapping("/")
    public String getInfoForAllEmployees() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR() {
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers() {
        return "view_for_managers";
    }
}
