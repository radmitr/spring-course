package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
/* 12. Advice тип @Around. Знакомство */
/* 13. Advice тип @Around. Работа с исключениями */
public class Test3 {

    public static void main(String[] args) {
        System.out.println("Method main starts");
        var context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        String bookName = universityLibrary.returnBook();
        System.out.printf("The book \"%s\" was returned to the library\n", bookName);

        context.close();
        System.out.println("Method main ends");
    }
}
