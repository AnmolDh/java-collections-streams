package com.reflections.retrieveannotations;

public class RetrieveAnnotations {
    public static void retrieveAuthor(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println(author.name());
        }
    }
}
