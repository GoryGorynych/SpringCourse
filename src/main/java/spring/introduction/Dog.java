package spring.introduction;

//@Component
//@Scope("prototype")
public class Dog implements Pet{

    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("init");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
