package ioc_di;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
/* 3. Inversion of Control. Часть 1 */
public class Test1 {

    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.say();
    }
}
