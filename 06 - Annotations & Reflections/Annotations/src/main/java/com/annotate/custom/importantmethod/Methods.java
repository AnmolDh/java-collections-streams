package com.annotate.custom.importantmethod;

import java.lang.reflect.Method;

public class Methods {
    @ImportantMethod
    public static void method1() {
        System.out.println("method1 called");
    }

    @ImportantMethod(priority = Priority.LOW)
    public static void method2() {
        System.out.println("method2 called");
    }

    public static void getAnnotatedMethod() {
        Class<?> clazz = Methods.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                System.out.println(method);
            }
        }
    }
}
