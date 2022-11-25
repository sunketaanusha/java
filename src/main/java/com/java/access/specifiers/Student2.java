package com.java.access.specifiers;

import com.java.Student;

public class Student2 extends Student {

    public void method1() {
        Student student = new Student();
        int id = student.id;
//        String name = student.name;
//        String grade =  student.grade;
        String studentGrade = grade;
//        String course = student.course;
   }
}
