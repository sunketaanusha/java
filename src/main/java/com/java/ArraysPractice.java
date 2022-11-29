package com.java;

import org.junit.Test;

import java.util.Arrays;

public class ArraysPractice {

    @Test
    public void declareArray() {
       int i = 10;
       int[] array1 = new int[10];
       char[] array2 = new char[20];
       float[] array3 = new float[30];
       double[] array4 = new double[40];
       String[] array5 = new String[50];
       Student[] array6 = new Student[10];
    }

    @Test
    public void initializeArray() {
        int[] arrayOne = new int[10];
        arrayOne[0] = 10;
        arrayOne[1] = 20;
        arrayOne[2] = 30;
        int[] arrayTwo = {1,2,3,4,5};

    }

    @Test
    public void printArray() {
        int[] arr = {1,2,3,4};
        System.out.println(arr);

        for(int i:arr ) {
            System.out.println(i);
        }
        String str = Arrays.toString(arr);
        System.out.println(str);

        String[] strArray = {"1","2","5"};
    }
}
