package spring.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbctractLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
