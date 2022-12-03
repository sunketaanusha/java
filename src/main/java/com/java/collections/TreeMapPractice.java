package com.java.collections;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {

    @Test
    public void add() {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(1,23);
        map.put(2,43);
        map.put(8,7);
        map.put(4,78);
        System.out.println(map);
    }
}
