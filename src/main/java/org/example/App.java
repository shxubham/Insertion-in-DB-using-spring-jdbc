package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is my first jdbc application");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentdao = context.getBean(StudentDao.class);
        Student student = new Student();
        int id = sc.nextInt();
        System.out.println();
        String name = sc.next();
        String city = sc.next();
        student.setId(id);
        student.setName(name);
        student.setCity(city);

        int result = studentdao.insert(student);
        System.out.println("student added: " + result);
    }
}
