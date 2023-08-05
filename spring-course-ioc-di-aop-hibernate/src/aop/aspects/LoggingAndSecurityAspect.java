package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
@Aspect
public class LoggingAndSecurityAspect {

    // 1 - getBook()
    // 1.1
//    @Before("execution(public void getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: trying to get a book");
//    }
    // 1.2 - declaring-type-pattern
//    @Before("execution(public void aop.UniversityLibrary.getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: trying to get a book");
//    }

    // 2 - get*()
//    @Before("execution(public void get*())")
//    public void beforeGetSomethingAdvice() {
//        System.out.println("beforeGetSomethingAdvice: trying to get something");
//    }

    // 3 - returnBook()
    // 3.1
//    @Before("execution(public void returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying to return a book");
//    }
    // 3.2 - return-type-pattern = *
//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying to return a book");
//    }
    // 3.3 - without modifiers-pattern, return-type-pattern = *
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying to return a book");
//    }

    // 4 - * *(), without modifiers-pattern, return-type-pattern = *, method-name-pattern = *
//    @Before("execution(* *())")
//    public void beforeAnyFunctionAdvice() {
//        System.out.println("beforeAnyFunctionAdvice: trying to do something");
//    }

    // 5 - getBook(String)
//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookWithTitleAdvice() {
//        System.out.println("beforeGetBookWithTitleAdvice: trying to get a book with title");
//    }

    // 6 - *(*)
//    @Before("execution(public void *(*))")
//    public void beforeAnyFunctionWithAnyParameterAdvice() {
//        System.out.println("beforeAnyFunctionWithAnyParameterAdvice: trying to do something with any parameter");
//    }

    // 7 - *(..)
//    @Before("execution(public void *(..))")
//    public void beforeAnyFunctionWithMultipleParametersAdvice() {
//        System.out.println("beforeAnyFunctionWithMultipleParametersAdvice: trying to do something" +
//                "with multiple parameters");
//    }

    // 8 - getBook(aop.Book)
//    @Before("execution(public void getBook(aop.Book))")
//    public void beforeGetBookWithParameterBookAdvice() {
//        System.out.println("beforeGetBookWithParameterBookAdvice: trying to get a Book");
//    }

    // 9 - getBook(aop.Book, ..)
//    @Before("execution(public void getBook(aop.Book, ..))")
//    public void beforeGetBookWithParameterBookAndOtherParametersAdvice() {
//        System.out.println("beforeGetBookWithParameterBookAndOtherParametersAdvice:" +
//                "trying to get a Book with any parameters");
//    }

    // 10 - * get*()
    // 10.1
//    @Before("execution(* get*())")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: trying to get a book/magazine");
//    }
//
//    @Before("execution(* get*())")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: checking the rights to get the book/magazine");
//    }
    // 10.2 - @Pointcut
//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: logging the attempt to get a book/magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: checking the rights to get the book/magazine");
//    }

    // 11.1
//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniversityLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniversityLibrary(){
//    }
//
//    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary())")
//    private void allGetAndReturnMethodsFromUniversityLibrary(){
//    }
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
    // 11.2
//    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
//    private void allMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniversityLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniversityLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniversityLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }
}
