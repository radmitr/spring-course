package ru.radmitr.spring.mvc_hibernate_aop.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    private static final Logger log = LogManager.getLogger(MyLoggingAspect.class);

    @Around("execution(* ru.radmitr.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();

        log.info("Begin of " + methodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        log.info("End of " + methodName);

        return targetMethodResult;
    }
}
