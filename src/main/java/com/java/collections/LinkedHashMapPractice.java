package com.java.collections;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapPractice {

    @Test
    public void add() {
        Map<String, Integer> set = new LinkedHashMap<>();
        set.put("anu", 1);
        set.put("reddy", 4);
        set.put("welcome",2);
        System.out.println(set);
    }

}
