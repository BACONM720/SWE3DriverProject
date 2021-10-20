/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DriverProject;
import Assignment1.Student;
import Assignment1.Course;
import Assignment1.Module;
import org.joda.time.DateTime;


/**
 *
 * @author Ryan9
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        DateTime start = new DateTime(2019, 1, 1, 1, 1);
        DateTime end = new DateTime(2020, 1, 1, 1, 1);
        

        Student s1 = new Student("jet", 21, "12/03/00");
        Student s2 = new Student("jared", 13, "19/08/01");

        Module m1 = new Module("CT415");
        Module m2 = new Module("SD678");

        Course c1 = new Course("Placebo MF", start, end);
        Course c2 = new Course("Computer Science", start, end);
        
        
        c1.addModule(m2);
        c1.addModule(m1);
        c2.addModule(m1);
        
        m1.addCourse(c2);
        m1.addCourse(c1);
        m2.addCourse(c1);

        s1.addCourse(c1);
        s2.addCourse(c2);
        
        c1.addStudent(s1);
        c2.addStudent(s2);
        
        s1.addModule(m1);
        s1.addModule(m2);
        s2.addModule(m2);
        
        m1.addStudent(s1);
        m2.addStudent(s2);
        m2.addStudent(s1);
        
        System.out.println("C1's list of students: ");
        c1.listStudents();
         System.out.println("C2's list of students: ");
        c2.listStudents();
          System.out.println("S1's list of courses: ");
        s1.listCourses();
          System.out.println("S1's list of modules: ");
        s1.listModules();
          System.out.println("S2's list of courses: ");
        s2.listCourses();
          System.out.println("S2's list of modules: ");
        s2.listModules();
          System.out.println("M1's list of courses: ");
        m1.listCourses();
          System.out.println("M1's list of students: ");
        m1.listStudents();
          System.out.println("M2's list of courses: ");
        m2.listCourses();
          System.out.println("M2's list of students: ");
        m2.listStudents();
      
    }
    
}

