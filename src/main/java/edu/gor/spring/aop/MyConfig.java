package edu.gor.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("edu.gor.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
