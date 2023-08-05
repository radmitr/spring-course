package ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
/* 19. Аннотации @Scope, @PostConstruct и @PreDestroy */
public class ScopeTest {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        // 1
        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Do the variables refer to the same object? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        // 2
//        Dog myDog = context.getBean("dog", Dog.class);
//        myDog.say();

        context.close();
    }
}
