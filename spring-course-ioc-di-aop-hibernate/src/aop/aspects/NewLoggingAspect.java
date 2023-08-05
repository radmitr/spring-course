package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
@Aspect
public class NewLoggingAspect {

    // 1 - target not work
//    @Around("execution(public String returnBook())")
//    public void aroundReturnBookLoggingAdvice() {
//        System.out.println("aroundReturnBookLoggingAdvice: the book is being returned to the library");
//    }

    // 2.1 - proceed()
//    @Around("execution(public String returnBook())")
//    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
//            throws Throwable {
//        System.out.println("aroundReturnBookLoggingAdvice: trying to return the book to the library");
//        Object targetMethodResult = proceedingJoinPoint.proceed();
//        System.out.println("aroundReturnBookLoggingAdvice: the book was successfully returned to the library");
//
//        return targetMethodResult;
//    }
    // 2.2 - proceed(), duration, output substitution
//    @Around("execution(public String returnBook())")
//    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
//            throws Throwable {
//        System.out.println("aroundReturnBookLoggingAdvice: trying to return the book to the library");
//
//        long begin = System.currentTimeMillis();
//        Object targetMethodResult = proceedingJoinPoint.proceed();
////        targetMethodResult = "Crime and Punishment"; // we could substitute the output
//        long end = System.currentTimeMillis();
//
//        System.out.println("aroundReturnBookLoggingAdvice: the book was successfully returned to the library");
//        System.out.println("aroundReturnBookLoggingAdvice: the method worked during " + (end - begin) + " ms");
//        return targetMethodResult;
//    }
    // 2.3 - catch exception, output substitution
//    @Around("execution(public String returnBook())")
//    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
//            throws Throwable {
//        System.out.println("aroundReturnBookLoggingAdvice: trying to return the book to the library");
//
//        Object targetMethodResult = null;
//        try {
//            targetMethodResult = proceedingJoinPoint.proceed();
//        } catch (Exception e) {
//            System.out.println("aroundReturnBookLoggingAdvice: was caught " + e);
//            targetMethodResult = "Unknown title of the book";
//        }
//
//        System.out.println("aroundReturnBookLoggingAdvice: the book was successfully returned to the library");
//
//        return targetMethodResult;
//    }
    // 2.4 - exception rethrowing
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: trying to return the book to the library");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: was logged " + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: the book was successfully returned to the library");

        return targetMethodResult;
    }
}
