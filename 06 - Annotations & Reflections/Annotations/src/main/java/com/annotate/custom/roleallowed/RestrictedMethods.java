package com.annotate.custom.roleallowed;

import java.lang.reflect.Method;

public class RestrictedMethods {
    @RoleAllowed(role=Role.ADMIN)
    public static void adminAccessRequired(){
        System.out.println("Admin accessed!");
    }

    @RoleAllowed(role=Role.USER)
    public static void userAccessRequired(){
        System.out.println("User accessed!");
    }

    public static void invokeAdminMethod(UserForRole userForRole){
        Class<?> clazz = RestrictedMethods.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.role() == Role.ADMIN && userForRole.role == Role.ADMIN) {
                    adminAccessRequired();
                }
            }
        }
    }
}
