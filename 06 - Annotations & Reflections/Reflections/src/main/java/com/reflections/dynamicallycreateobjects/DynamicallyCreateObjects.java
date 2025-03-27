package com.reflections.dynamicallycreateobjects;

public class DynamicallyCreateObjects {
    public static Object create(Class<?> clazz) {
        Object object = null;
        try{
            object = clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return object;
    }
}
