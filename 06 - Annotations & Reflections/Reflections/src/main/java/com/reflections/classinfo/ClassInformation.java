package com.reflections.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInformation {
    public static void get(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        Method[] methods = clazz.getDeclaredMethods();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for(Field field : fields){
            System.out.println("Field: " + field.getName());
        }
        for(Method method : methods){
            System.out.println("Method: " + method.getName());
        }
        for(Constructor<?> constructor : constructors){
            System.out.println("Constructor: " + constructor.getName());
        }
    }
}
