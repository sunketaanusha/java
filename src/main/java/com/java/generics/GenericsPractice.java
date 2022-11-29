package com.java.generics;

public class GenericsPractice {

    public static void main(String[] args) {
        Person<Employee> employee = new Person<Employee>();
        employee.setT(new Employee());
        System.out.println(employee.getT());
        Person<Student5> student5 = new Person<Student5>();
        student5.setT(new Student5());
        System.out.println(student5.getT());
    }

}
