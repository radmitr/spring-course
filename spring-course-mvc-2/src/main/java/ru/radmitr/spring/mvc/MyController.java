package ru.radmitr.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/* ------------------------------- 4. Spring MVC --------------------------------- */
/* 8. Spring MVC форма input */
/* 9. Spring MVC форма select */
/* 10. Spring MVC форма radiobutton */
/* 11. Spring MVC форма checkbox */
/* 12. Валидация данных @Size, @NotEmpty, @NotBlank */
/* 13. Валидация данных @Min, @Max, @Pattern */
/* 14. Валидация данных создание собственной аннотации */
/* ------------------------------ 6. Spring REST --------------------------------- */
/* 3. HTTP методы GET и POST */
@Controller
@RequestMapping("/employee") // controller mapping
public class MyController {

    // http://localhost:8080/spring_course_mvc_2/employee/

    @RequestMapping("/") // method mapping
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        // 1 - default: null, null, 0
        model.addAttribute("employee", new Employee());

        // 2 - default: Ivan, Petrov, 100000
//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(100000);
//        model.addAttribute("employee", emp);

        return "ask-emp-details-view";
    }

    // 1 - showEmployeeDetails(@ModelAttribute("...") Employee)
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
//        String name = employee.getName();
//        employee.setName("Mr. " + name);
//
//        String surname = employee.getSurname();
//        employee.setSurname(surname + "!");
//
//        int salary = employee.getSalary();
//        employee.setSalary(10 * salary);
//
//        return "show-emp-details-view";
//    }

    // 2.1 - showEmployeeDetails(@Valid @ModelAttribute("...") Employee, BindingResult)
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
//                                      BindingResult bindingResult) {
////        System.out.println("surname length = " + employee.getSurname().length());
//
//        if (bindingResult.hasErrors()) {
//            return "ask-emp-details-view";
//        } else {
//            return "show-emp-details-view";
//        }
//    }

    /* ------------------------------ 6. Spring REST --------------------------------- */
    /* ----- 3. HTTP методы GET и POST ----- */
    // 2.2 - showEmployeeDetails(@Valid @ModelAttribute("...") Employee, BindingResult)
//    @RequestMapping("/showDetails")
//    @RequestMapping(path = "/showDetails", method = RequestMethod.GET)
//    @GetMapping("/showDetails")
    @PostMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {
//        System.out.println("surname length = " + employee.getSurname().length());

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }
    /* ------------------------------------- */
}
