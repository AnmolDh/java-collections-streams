package com.annotate.custom.logexecutiontime;

import java.lang.reflect.Method;

public class Logger {
    @LogExecutionTime
    public static void startLogging() {
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void processLoggingTime() {
        Class<?> clazz = Logger.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
                long startTime = System.currentTimeMillis();
                Logger.startLogging();
                long timeElapsed = System.currentTimeMillis() - startTime;
                System.out.println(annotation.message() + timeElapsed);
            }
        }
    }
}
