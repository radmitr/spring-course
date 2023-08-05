package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
/* 4. Inversion of Control. Часть 2 */
public class Test2 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
