package com.java.collections;

import javafx.scene.effect.SepiaTone;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetPractice {

    @Test
    public void create() {
        Set<String> set = new LinkedHashSet<>();
        System.out.println(set);
    }

    @Test
    public void add() {
        Set<String> set = new LinkedHashSet<>();
        set.add("anu");
        set.add("reddy");
        set.add("anu");
        set.add("sunketa");
        set.add("java");
        set.add("welcome");
        System.out.println(set);
    }

    @Test
    public void iterate(){
        Set<String> set = new LinkedHashSet<>();
        set.add("anu");
        set.add("reddy");
        set.add("welcome");
        System.out.println(set);
        for(String str:set) {
            System.out.println(str);
        }
        set.stream().forEach(set1 -> System.out.println(set1));
    }

}
