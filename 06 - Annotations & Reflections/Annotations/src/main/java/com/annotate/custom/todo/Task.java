package com.annotate.custom.todo;

import java.lang.reflect.Method;

public class Task {
    @Todo(task="add implementation", assignedTo="none", priority = Priority.HIGH)
    public static void startGame(){

    }

    @Todo(task="add implementation", assignedTo="none", priority = Priority.MEDIUM)
    public static void endGame(){

    }

    public static void getTodoTasks(){
        Class<?> clazz = Task.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)){
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println(todo.task());
            }
        }
    }
}
