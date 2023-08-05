package aop;

import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("We take the book");
    }
}
