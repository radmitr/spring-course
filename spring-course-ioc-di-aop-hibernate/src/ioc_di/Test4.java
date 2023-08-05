package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
/* 11. Bean scope */
public class Test4 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        var context999 = new ClassPathXmlApplicationContext("applicationContext2.xml",
//                "applicationContext.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        System.out.println("Do the variables refer to the same object? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        myDog.setName("Belka");
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        context.close();
    }
}
