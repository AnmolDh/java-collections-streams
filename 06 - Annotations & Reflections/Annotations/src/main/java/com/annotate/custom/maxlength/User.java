package com.annotate.custom.maxlength;

import java.lang.reflect.Field;

public class User {
    @MaxLength(5)
    String username;

    public User(String username) throws IllegalArgumentException {
        try {
            Class<?> clazz = this.getClass();
            Field usernameField = clazz.getDeclaredField("username");
            MaxLength maxLength = usernameField.getAnnotation(MaxLength.class);

            if (maxLength != null && username.length() > maxLength.value()) {
                throw new IllegalArgumentException("Username length exceeds maximum allowed (" + maxLength.value() + ")");
            }
            this.username = username;
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
