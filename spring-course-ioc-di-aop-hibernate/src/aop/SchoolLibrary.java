package aop;

import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We take the book from the SchoolLibrary");
    }

    @Override
    public void getBook(String title) {
        System.out.printf("We take the book \"%s\" from the SchoolLibrary", title);
    }

    @Override
    public void getBook(Book book) {
        System.out.printf("We take the book \"%s\" from the SchoolLibrary\n", book.getTitle());
    }
}
