package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
/* 13. Конфигурация с помощью аннотаций */
/* 14. Аннотация @Autowired для конструктора */
/* 15. Аннотация @Autowired для сеттера */
/* 16. Аннотация @Autowired для поля */
/* 17. Аннотация @Qualifier */
/* 18. Аннотация @Value */
public class ConfigWithAnnotations {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        /* ----- 13. Конфигурация с помощью аннотаций ----- */
//        // 1
////        Cat myCat = context.getBean("catBean", Cat.class);
//        // 2 - default
//        Cat myCat = context.getBean("cat", Cat.class);
//
//        myCat.say();
        /* ------------------------------------------------ */

        /* ----- 14. Аннотация @Autowired для конструктора ----- */
        /* ----- 15. Аннотация @Autowired для сеттера ----- */
        /* ----- 16. Аннотация @Autowired для поля ----- */
        /* ----- 17. Аннотация @Qualifier ----- */
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        /* ------------------------------------ */

        /* ----- 18. Аннотация @Value ----- */
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        /* -------------------------------- */

        context.close();
    }
}
