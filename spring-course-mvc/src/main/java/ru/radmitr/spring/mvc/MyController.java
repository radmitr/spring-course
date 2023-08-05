package ru.radmitr.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/* ------------------------------- 4. Spring MVC --------------------------------- */
/* 1. Знакомство со Spring MVC */
/* 2. Конфигурация приложения Spring MVC (IntelliJ IDEA + NetBeans) */
/* 3. Первое Spring MVC приложение */
/* 4. Использование данных во View */
/* 5. Компонент Model */
/* 6. Аннотация @RequestParam */
/* 7. Аннотация @RequestMapping для Controller класса */
@Controller
//@RequestMapping("/employee") // controller mapping
public class MyController {

    // http://localhost:8080/spring_course_mvc/

    @RequestMapping("/") // method mapping
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    // 1 - showEmployeeDetails()
    // for view: "Your name: ${param.employeeName}"
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show-emp-details-view";
//    }

    // -------------------- Model ----------------------

    // --- HttpServletRequest ---

    // 2.1 - showEmployeeDetails(HttpServletRequest, Model)
    // for view: "Your name: ${nameAttribute}"
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

    // 2.2 - showEmployeeDetails(HttpServletRequest, Model)
    // for view: "Your name: ${nameAttribute} ${description}"
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " - tourism instructor");
//
//        return "show-emp-details-view";
//    }

    // --- @RequestParam ---

    // 3 - showEmployeeDetails(@RequestParam("...") String, Model)
    // for view: "Your name: ${nameAttribute} ${description}"
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);

        model.addAttribute("description", " - tourism instructor!");

        return "show-emp-details-view";
    }
}
