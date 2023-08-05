package ioc_di;

import org.springframework.context.annotation.*;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
@Configuration
//@ComponentScan("ioc_di")
//@PropertySource("myApp.properties")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
//    @Scope("prototype")
    @Scope("singleton")
    public Pet catBean() {
//        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    @Scope("prototype")
//    @Scope("singleton")
    public Person personBean() {
        return new Person(catBean());
    }
}
