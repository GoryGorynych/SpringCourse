package edu.gor.spring.aop.acpects;

import edu.gor.spring.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {

        Student firstSt = students.get(0);

        String nameSurname = firstSt.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstSt.setNameSurname(nameSurname);

        double avgGrade = firstSt.getAvgGrade();
        avgGrade = avgGrade+1;
        firstSt.setAvgGrade(avgGrade);

        System.out.println("afterGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents");
    }
}
