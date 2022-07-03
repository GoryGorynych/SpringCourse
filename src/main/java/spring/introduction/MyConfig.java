package spring.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("edu.gor.spring")
public class MyConfig {

    @Bean
    public Pet catBean() {
        return  new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
