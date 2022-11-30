package com.java.collections;

import com.java.generics.Student5;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    public void iterate() {
        List<String> list1 = new ArrayList<>();
        list1.add("anu");
        list1.add("reddy");
        list1.add("sunketa");
        //using iterator
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        //using for loop
        for(int i = 0; i< list1.size();i++) {
            System.out.println(list1.get(i));

        }
        //using for each loop
        for(String str : list1) {
            System.out.println(str);
        }

        //using streams
        list1.stream().forEach(str -> System.out.println(str));
    }

    @Test

    public void filter() {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("welcome");
        list1.add("world");
//        list1.stream().forEach(str -> System.out.println(str));
//        list1.stream().filter(flt -> {
//            return !flt.startsWith("w");
//        }).forEach(a -> System.out.println(a));
        list1.stream().filter(flt -> {
            int length = flt.length();
            return length>5;
        }).forEach(str -> System.out.println(str));

        list1.stream().map(str1 -> {
            return str1.toUpperCase();
        }).forEach(str -> System.out.println(str));

        list1.stream().map(str2 -> {
            return str2.toLowerCase();
        }).forEach(str3 -> System.out.println(str3));

        List<String> collectStrings = list1.stream().filter(flt -> {
            return flt.length()>5;
        }).collect(Collectors.toList());
        collectStrings.stream().forEach(str1 -> System.out.println(str1));
    }


}
