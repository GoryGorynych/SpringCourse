package edu.gor.spring.aop.acpects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("edu.gor.spring.aop.acpects.MyPointCuts.allAddMethods()")
    public void beforeAddLSecurityAdvice() {
        System.out.println("beforeGetLSecurityAdvice: проверка прав на получение книгу/журнал" );
        System.out.println("---------------------------------");
    }
}
