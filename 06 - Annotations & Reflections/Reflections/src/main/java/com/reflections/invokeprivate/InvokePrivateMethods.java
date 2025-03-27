package com.reflections.invokeprivate;

import java.lang.reflect.Method;

public class InvokePrivateMethods {
    public static void invoke(Calculator calculator, int a, int b) {
        try{
            Method[] methods = Calculator.class.getDeclaredMethods();
            for (Method method : methods) {
                method.setAccessible(true);
                method.invoke(calculator, a, b);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
