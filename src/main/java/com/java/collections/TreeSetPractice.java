package com.java.collections;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    @Test
    public void create() {
        Set<String> set = new TreeSet<>();
        System.out.println(set);
    }

    @Test
    public void add() {
        Set<String> set = new TreeSet<>();
        set.add("java");
        set.add("anu");
        set.add("welcome");
        set.add("reddy");
        System.out.println(set);
    }
}
