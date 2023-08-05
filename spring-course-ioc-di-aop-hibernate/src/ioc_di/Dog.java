package ioc_di;

/* ------------------------- 1. Рассмотрение IoC и DI ---------------------------- */
//@Component // default bean "dog"
//@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet {

    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow!");
    }

    // 1.1
    public void init() {
        System.out.println("Class Dog: init method");
    }
    // 1.2
//    protected void init() {
//        System.out.println("Class Dog: init method");
//    }
    // 1.3
//    public int init() {
//        System.out.println("Class Dog: init method");
//        return 5;
//    }
    // 1.4
//    public void abc() {
//        System.out.println("Class Dog: init method");
//    }
    // 1.5
//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: init method");
//    }

    // 2.1
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
    // 2.2
//    private void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }
    // 2.3
//    public void doSomething() {
//        System.out.println("Class Dog: destroy method");
//    }
    // 2.4
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
