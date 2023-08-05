package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.getAllMethods()" +
            "&& !aop.aspects.MyPointcuts.getStringAuthor()" +
            "&& !aop.aspects.MyPointcuts.getStringTitle()" +
            "&& !aop.aspects.MyPointcuts.getStringPublicationYear()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: checking the rights to get the book/magazine");
        System.out.println("---------------------------------------------------------");
    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: checking the rights to add the book/magazine");
        System.out.println("---------------------------------------------------------");
    }
}
