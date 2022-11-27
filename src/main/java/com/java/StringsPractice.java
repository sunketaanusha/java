package com.java;

import org.junit.Test;

public class StringsPractice {

    @Test
    public void createString() {
        String s1 = "Hi";
        String s2 = new String("welcome");
        System.out.println(s1);
        System.out.println(s2);

    }
    @Test
    public void charAt() {
        String s1 = "Hello world";
        char ch = s1.charAt(2);
        System.out.println(ch);
    }
    @Test
    public void subString() {
        String s1 = "welcome anusha";
        String s2 = s1.substring(8);
        System.out.println(s2);
        String s3 = s1.substring(0,7);
        System.out.println(s3);
    }
    @Test
    public void concat() {
        String s1 = "new";
        String s2 = "work";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);
    }
}
