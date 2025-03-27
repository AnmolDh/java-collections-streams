package com.annotate.custom.jsonfield;

public class JsonUser {
    @JsonField(name="name")
    private String name;
    @JsonField(name="age")
    private int age;

    public JsonUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
