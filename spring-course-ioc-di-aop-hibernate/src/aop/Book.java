package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
public class Book {

    @Value("${book.author}")
    private String author;

    @Value("${book.title}")
    private String title;

    @Value("${book.publicationYear}")
    private String publicationYear;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }
}
