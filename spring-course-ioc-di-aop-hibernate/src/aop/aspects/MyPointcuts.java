package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
public class MyPointcuts {

    // 1.1
//    @Pointcut("execution(* get*())")
//    public void getAllMethods() {
//    }
    // 1.2
    @Pointcut("execution(* getXxx*())")
    public void getAllMethods() {
    }

    @Pointcut("execution(String getAuthor())")
    public void getStringAuthor() {
    }

    @Pointcut("execution(String getTitle())")
    public void getStringTitle() {
    }

    @Pointcut("execution(String getPublicationYear())")
    public void getStringPublicationYear() {
    }

    // 2.1
//    @Pointcut("execution(* add*(..))")
//    public void allAddMethods() {
//    }
    // 2.2
    @Pointcut("execution(* addXxx*(..))")
    public void allAddMethods() {
    }
}
