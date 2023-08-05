package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
/* 2. Advice тип @Before */
/* 3. Выражение Pointcut. Часть 1 */
/* 4. Выражение Pointcut. Часть 2 */
/* 5. Объявление Pointcut */
/* 6. Комбинирование Pointcut */
/* 7. Порядок выполнения Aspect-ов */
/* 8. Join Point */
public class Test1 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);

        /* ----- 2. Advice тип @Before ----- */
//        Library library = context.getBean("libraryBean", Library.class);
//        library.getBook();
        /* --------------------------------- */

        /* ----- 3. Выражение Pointcut. Часть 1 ----- */
//        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
//        universityLibrary.getBook();
//        universityLibrary.returnBook();
//        universityLibrary.getMagazine();
//
//        System.out.println();
//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
        /* ------------------------------------------ */

        /* ----- 4. Выражение Pointcut. Часть 2 ----- */
        // 1
////        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
////        universityLibrary.getBook("Crime and Punishment");
////        System.out.println();
////        universityLibrary.getMagazine("Murzilka");
////        System.out.println();
////        universityLibrary.getMagazine();
//
//        // 2
//        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
//        Book book = context.getBean("book", Book.class);
//        universityLibrary.getBook(book);
        /* ------------------------------------------ */

        /* ----- 5. Объявление Pointcut ----- */
        /* ----- 6. Комбинирование Pointcut ----- */
        /* ----- 7. Порядок выполнения Aspect-ов ----- */
//        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
//        universityLibrary.getBook();
//        universityLibrary.getMagazine();
        /* ------------------------------------------- */

        /* ----- 8. Join Point ----- */
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);
        universityLibrary.getBook();
        universityLibrary.addBook("Dmitriy", book);
        universityLibrary.addMagazine();
        /* ------------------------- */

        context.close();
    }
}
