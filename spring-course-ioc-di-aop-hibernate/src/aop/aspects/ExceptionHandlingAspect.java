package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointcuts.getAllMethods()" +
            "&& !aop.aspects.MyPointcuts.getStringAuthor()" +
            "&& !aop.aspects.MyPointcuts.getStringTitle()" +
            "&& !aop.aspects.MyPointcuts.getStringPublicationYear()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: catching/handling " +
                "exception when trying to get a book/magazine");
        System.out.println("---------------------------------------------------------");
    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: catching/handling " +
                "exception when trying to add a book/magazine");
        System.out.println("---------------------------------------------------------");
    }
}
