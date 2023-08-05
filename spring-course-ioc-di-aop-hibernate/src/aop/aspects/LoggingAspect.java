package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import aop.Book;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.getAllMethods()" +
            "&& !aop.aspects.MyPointcuts.getStringAuthor()" +
            "&& !aop.aspects.MyPointcuts.getStringTitle()" +
            "&& !aop.aspects.MyPointcuts.getStringPublicationYear()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: logging when trying to get a book/magazine");
        System.out.println("---------------------------------------------------------");
    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        // getSignature()
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        // getArgs()
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.printf("Information about book: title - \"%s\", author - %s, publication year - %s\n",
                            myBook.getTitle(), myBook.getAuthor(), myBook.getPublicationYear());
                } else if (obj instanceof String) {
                    System.out.println(obj + " is adding the book");
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: logging when trying to add a book/magazine");
        System.out.println("---------------------------------------------------------");
    }
}
