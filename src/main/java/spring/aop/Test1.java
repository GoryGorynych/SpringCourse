package spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        library.getBook();
        library.addBook("Zaur", book);
        library.addMagazine();

//        library.getMagazine();
//        library.returnMagazine();
//        library.returnMagazine();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
        context.close();
    }
}
