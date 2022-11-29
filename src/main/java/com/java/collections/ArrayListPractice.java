package com.java.collections;

import com.java.generics.Student5;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    @Test
    public void createArrayList() {
        List list1 = new ArrayList();
        System.out.println(list1);
    }

    @Test
    public void add() {
        List list1 = new ArrayList();
        list1.add("jack");
        list1.add(10);
        list1.add(1.23);
        System.out.println(list1);
    }

    @Test
    public void add2() {
        List<String> list1 = new ArrayList<String>();
        list1.add("hi");
        list1.add("10");
        System.out.println(list1);
        List<Student5> studentList = new ArrayList<Student5>();
        Student5 student5 = new Student5();
        studentList.add(student5);
        System.out.println(studentList);

    }

    @Test
    public void addAll() {
        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        list1.add("world");
        list1.add("welcome");
        List<String> list2 = new ArrayList<String>();
        list2.add("anusha");
        list2.add("sunketa");
        System.out.println(list1);
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list2);

    }
}
