package ioc_di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
@Component("personBean")
public class Person {

//    @Autowired
////    @Qualifier("dog")
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("Radionov")
    @Value("${person.surname}")
    private String surname;
//    @Value("38")
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    // pet -> setPet
//    @Autowired
//    @Qualifier("dog")
////    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

//    @Autowired
//    public void anyMethodName(Pet pet) {
//        System.out.println("Class person: anyMethodName");
//        this.pet = pet;
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
