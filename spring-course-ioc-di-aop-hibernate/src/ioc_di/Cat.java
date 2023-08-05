package ioc_di;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
//@Component
//@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow!");
    }
}
