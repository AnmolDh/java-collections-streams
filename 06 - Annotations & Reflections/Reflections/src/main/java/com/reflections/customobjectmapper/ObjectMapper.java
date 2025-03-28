package com.reflections.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static Object toObject(Class<?> clazz, Map<String, Object> properties) {
        Object obj = null;
        try{
            obj = clazz.getDeclaredConstructor().newInstance();
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                field.set(obj, properties.get(field.getName()));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return obj;
    }
}
