package com.java;

import org.junit.Test;

import java.sql.SQLOutput;

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
        String s3 = s1.substring(0, 7);
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

    @Test
    public void divideString() {
        String s1 = "hello-world";
        String[] strArray = s1.split("o");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        for (String s : strArray) {
            System.out.println(s);
        }
    }

    @Test
    public void toLowerCase() {
        String s2 = "HELLO";
        String s3 = s2.toLowerCase();
        System.out.println(s3);
    }

    @Test
    public void toUpperCase() {
        String s4 = "hello";
        String s5 = s4.toUpperCase();
        System.out.println(s5);
    }

    // hello-world -> HelloWorld
    @Test
    public void capitalize() {
        String s1 = "hello-world-welcome-to-java";
    /*
    divide by -
    iterate array
    take each word
    take first letter  into string -> s1
    take 2nd letter to rest of the word into stirng -> s2
    convert case of s1
    concat s1 & s2
    print concat string
     */
        String[] strArray = s1.split("-");
        String result = "";
        for (String s : strArray) {
            System.out.println(s);
            String firstLetter = s.substring(0, 1);
            System.out.println(firstLetter);
            String remaingString = s.substring(1);
            System.out.println(remaingString);
            String s3 = firstLetter.toUpperCase();
            System.out.println(s3);
            String s4 = s3 + remaingString;
            System.out.println(s4);
            result = result + s4;

        }
        System.out.println(result);
    }



    @Test
    public void method1(){
        String s1 = "hello";
        // h
        // ello
        String s2 = s1.substring(1);
        System.out.println(s2);
        String s3 = s1.substring(0,1);
        System.out.println(s3);
    }
}
