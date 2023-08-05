package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
/* 9. Advice тип @AfterReturning */
/* 10. Advice тип @AfterThrowing */
/* 11. Advice тип @After */
public class Test2 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);

        /* ----- 9. Advice тип @AfterReturning ----- */
//        University university = context.getBean("university", University.class);
//        university.addStudents();
//        List<Student> students = university.getStudents();
//        System.out.println(students);
        /* ----------------------------------------- */

        /* ----- 10. Advice тип @AfterThrowing ----- */
        /* ----- 11. Advice тип @After ----- */
        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Was caught an exception " + e);
        }
        /* --------------------------------- */

        context.close();
    }
}
