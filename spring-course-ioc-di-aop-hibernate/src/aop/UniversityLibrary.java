package aop;

import org.springframework.stereotype.Component;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
public class UniversityLibrary extends AbstractLibrary{

    ///////////////////////////////////// Book ///////////////////////////////////////

    // getBook() ---------------------------------------------------------------------

    @Override
    public void getBook() {
        System.out.println("We take the book from the UniversityLibrary");
        System.out.println("---------------------------------------------------------");
    }

    @Override
    public void getBook(String title) {
        System.out.printf("We take the book \"%s\" from the UniversityLibrary\n", title);
        System.out.println("---------------------------------------------------------");
    }

    @Override
    public void getBook(Book book) {
        System.out.printf("We take the book by %s \"%s\" " +
                "from the UniversityLibrary\n", book.getAuthor(), book.getTitle());
        System.out.println("---------------------------------------------------------");
    }

    // returnBook() ---------------------------------------------------------------------

    // 1.1
//    public void returnBook() {
//        System.out.println("We are returning the book to the UniversityLibrary");
//        System.out.println("---------------------------------------------------------");
//    }
    // 1.2 - return String
//    public String returnBook() {
//        System.out.println("We are returning the book to the UniversityLibrary");
//        return "OK";
//    }
    // 1.3 - access modifier protected
//    protected String returnBook() {
//        System.out.println("We are returning the book to the UniversityLibrary");
//        return "OK";
//    }
    // 1.4 - default access modifier
//    String returnBook() {
//        System.out.println("We are returning the book to the UniversityLibrary");
//        return "OK";
//    }
    // 1.5
//    public String returnBook() {
//        System.out.println("We are returning the book to the UniversityLibrary");
//        return "War and Peace";
//    }
    // 1.6 - division by zero
    public String returnBook() {
        int a = 10 / 0; // java.lang.ArithmeticException
        System.out.println("We are returning the book to the UniversityLibrary");
        return "War and Peace";
    }

    // addBook() ---------------------------------------------------------------------

    // 2.1
    public void addBook() {
        System.out.println("We are adding a book to the UniversityLibrary");
        System.out.println("---------------------------------------------------------");
    }
    // 2.2
    public void addBook(String personName, Book book) {
        System.out.printf("%s is adding the book by %s \"%s\" to the UniversityLibrary\n",
                personName, book.getAuthor(), book.getTitle());
        System.out.println("---------------------------------------------------------");
    }

    ///////////////////////////////////// Magazine ///////////////////////////////////////

    // getMagazine() ---------------------------------------------------------------------

    public void getMagazine() {
        System.out.println("We take the magazine from the UniversityLibrary");
        System.out.println("---------------------------------------------------------");
    }

    public void getMagazine(String title) {
        System.out.printf("We take the magazine \"%s\" from the UniversityLibrary\n", title);
        System.out.println("---------------------------------------------------------");
    }

    // returnMagazine() ---------------------------------------------------------------------

    public void returnMagazine() {
        System.out.println("We are returning the magazine to the UniversityLibrary");
        System.out.println("---------------------------------------------------------");
    }

    // addMagazine() ---------------------------------------------------------------------

    public void addMagazine() {
        System.out.println("We are adding a magazine to the UniversityLibrary");
        System.out.println("---------------------------------------------------------");
    }
}
