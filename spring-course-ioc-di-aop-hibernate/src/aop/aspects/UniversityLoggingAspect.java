package aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import aop.Student;

import java.util.List;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging the getting a list of students " +
                "before method getStudents()");
    }

    // 1 - @AfterReturning
    // 1.1
//    @AfterReturning("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging the getting a list of students " +
//                "after method getStudents()");
//    }
    // 1.2 - pointcut, returning
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: logging the getting a list of students " +
                "after method getStudents()");
    }
    // 1.3 - pointcut, returning, JoinPoint
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging the getting a list of students " +
//                "after method getStudents()");
//    }

    // 2 - @AfterThrowing
    // 2.1
//    @AfterThrowing("execution(* getStudents())")
//    public void afterThrowingGetStudentsLoggingAdvice() {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
//                "logging the throw of an exception");
//    }
    // 2.2 - pointcut, throwing
    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
                "logging the throw of an exception " + exception);
    }
    // 2.3 - pointcut, throwing, JoinPoint
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(JoinPoint joinPoint, Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
//                "logging the throw of an exception " + exception);
//    }

    // 3 - @After
    // 3.1
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: " +
                "logging the normal end of a method or throwing a exception");
    }
    // 3.2 - JoinPoint
//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice(JoinPoint joinPoint) {
//        System.out.println("afterGetStudentsLoggingAdvice: " +
//                "logging the normal end of a method or throwing a exception");
//    }

    /* At first beforeGetStudentsLoggingAdvice(),
       then afterGetStudentsLoggingAdvice(),
       then afterThrowingGetStudentsLoggingAdvice(),
       then afterReturningGetStudentsLoggingAdvice(). */
}
