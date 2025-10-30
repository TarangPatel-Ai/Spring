package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentDAO;
import com.spring.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Scanner sc = new Scanner(System.in);
        Student student = ac.getBean(Student.class);
        System.out.println("Enter the Id:");
        student.setSid(sc.nextInt());
        System.out.println("Enter the Name:");
        student.setSname(sc.next());
        System.out.println("Enter the Email:");
        student.setSemail(sc.next());
        
        StudentDAO sdao = ac.getBean(StudentDAO.class);
        
        int row = sdao.insert(student);
        if(row>0) {
        	System.out.println("Record of student is inserted...");
        }else {
        	System.out.println("Inseration is Failed...");
        }
        
        
     // Fetch and display all students
        System.out.println("\nFetching all student records:");
        List<Student> students = sdao.retreiveStudentData();
        if (students.isEmpty()) {
            System.out.println("No students found in the database.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
        
    }
}
