package com.java.access.specifiers;

import com.java.Student;

public class Student2 extends Student {

    public int id = 20;

    public static void main(String[] args) {
        Student2 student2 = new Student2();
        student2.method2();
    }
    public void method1() {
        Student student = new Student();
        int id = student.id;
//        String name = student.name;
//        String grade =  student.grade;
        String studentGrade = grade;
//        String course = student.course;
   }


   public void method2() {
       System.out.println(id);
       System.out.println(super.id);

   }
}
