package com.reflections.dynamicmethodinvocation;

import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void invoke() {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();

            Class<?> clazz = MathOperations.class;

            switch (input) {
                case "add":
                    clazz.getDeclaredMethod("add", int.class, int.class).invoke(clazz, a, b);
                case "sub":
                    clazz.getDeclaredMethod("sub", int.class, int.class).invoke(clazz, a, b);
                case "mul":
                    clazz.getDeclaredMethod("mul", int.class, int.class).invoke(clazz, a, b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
