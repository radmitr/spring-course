package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
/* 5. Dependency Injection. Знакомство */
/* 6. Dependency Injection с помощью конструктора */
/* 7. Dependency Injection с помощью сеттера */
/* 8. Внедрение строк и других значений */
/* 9. Внедрение строк и других значений из properties файла */
public class Test3 {

    public static void main(String[] args) {
        /* ----- 5. Dependency Injection. Знакомство ----- */
        // 1
//        Pet pet = new Cat();
//        Person person = new Person(pet);
//        person.callYourPet();

        // 2
//        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();
//
//        context.close();
        /* ----------------------------------------------- */

        /* ----- 6. Dependency Injection с помощью конструктора ----- */
        /* ----- 7. Dependency Injection с помощью сеттера ----- */
        // 3
//        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Person person = context.getBean("myPerson", Person.class);
//        person.callYourPet();
//
//        context.close();
        /* ----------------------------------------------------- */

        /* ----- 8. Внедрение строк и других значений ----- */
        /* ----- 9. Внедрение строк и других значений из properties файла ----- */
        // 4
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
        /* -------------------------------------------------------------------- */
    }
}
