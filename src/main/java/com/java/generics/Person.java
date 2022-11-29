package com.java.generics;

public class Person<T> {
    private String firstName;
    private String lastName;
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}