package com.reflections.customobjectmapper;

public class SampleClassOM {
    private String name;
    private int age;

    public SampleClassOM() {

    }

    public SampleClassOM(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age;
    }
}
