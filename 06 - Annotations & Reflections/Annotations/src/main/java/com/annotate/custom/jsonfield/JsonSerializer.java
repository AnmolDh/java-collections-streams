package com.annotate.custom.jsonfield;

import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                String fieldName = jsonField.name();
                try{
                    Object value = field.get(obj);
                    sb.append("\"").append(fieldName).append("\":");
                    if (value instanceof String) {
                        sb.append("\"").append(value).append("\"");
                    } else {
                        sb.append(value);
                    }
                    sb.append(",");
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}");
        return sb.toString();
    }
}
