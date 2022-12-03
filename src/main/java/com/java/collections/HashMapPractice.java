package com.java.collections;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    @Test
    public void create() {
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map);
    }

    @Test
    public void put() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(3,5);
        System.out.println(map);
    }

    @Test
    public void get() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        System.out.println(map);
        String value = map.get(1);
        System.out.println(value);


    }

    @Test
    public void getOrDefault() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"anu");
        map.put(2,"reddy");
        System.out.println(map);
        String value = map.get(3);
        System.out.println(value);
        String value1 = map.getOrDefault(3,"unknown");
        System.out.println(value1);
    }
    @Test
    public void putAll() {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map1.put(1,4);
        map1.put(3,7);
        System.out.println(map);
        System.out.println(map1);
        map1.putAll(map);
        System.out.println(map);
        System.out.println(map1);

    }
    @Test
    public void iterate() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(12,23);
        map.put(10,23);
        map.put(07,05);
        System.out.println(map);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        map.forEach((key,value) -> System.out.println(key +":"+ value));
    }

    @Test
    public void remove() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(5,6);
        map.put(7,8);
        System.out.println(map);
        map.remove(1);
        System.out.println(map);
    }
}
