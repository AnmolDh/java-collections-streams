package com.reflections.modifystaticfields;

import java.lang.reflect.Field;

public class ModifyStaticFields {
    public static void modifyAPIKEY(){
        try{
            Class<?> clazz = Configuration.class;

            Field field = clazz.getDeclaredField("API_KEY");
            field.setAccessible(true);

            field.set(clazz, "MODIFIED_API_KEY");

            System.out.println("Modified API Key: " + field.get(Configuration.class));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
