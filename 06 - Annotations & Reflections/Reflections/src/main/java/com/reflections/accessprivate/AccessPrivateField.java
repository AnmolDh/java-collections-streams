package com.reflections.accessprivate;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void modifyAge(Person person, int age){
        try{
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.setInt(person, age);

            int updatedAge = (int) ageField.get(person);
            System.out.println("Updated age: " + updatedAge);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
