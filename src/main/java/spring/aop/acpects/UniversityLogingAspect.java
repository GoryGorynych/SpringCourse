package spring.aop.acpects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLogingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstSt = students.get(0);
//
//        String nameSurname = firstSt.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstSt.setNameSurname(nameSurname);
//
//        double avgGrade = firstSt.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstSt.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution (* getStudents())", throwing = "exception")
//    public void afterThrowGetStudentsLoggingAdvice(Throwable exception) {
//
//        System.out.println("afterThrowGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы метода или выброс исключения");
    }
}
