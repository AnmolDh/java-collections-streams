package com.annotate;

import com.annotate.custom.bugreport.Report;
import com.annotate.custom.importantmethod.Methods;
import com.annotate.custom.logexecutiontime.Logger;
import com.annotate.custom.taskinfo.TaskManager;
import com.annotate.custom.todo.Task;
import com.annotate.deprecated.LegacyAPI;
import com.annotate.override.Dog;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();

//        LegacyAPI api = new LegacyAPI();
//        api.oldFeature();
//        api.newMethod();

//        TaskManager taskManager = new TaskManager();
//        taskManager.getAnnotationDetails();
//
//        Report report = new Report();
//        report.printBugReport();

//        Methods.getAnnotatedMethod();

//        Task.getTodoTasks();

        Logger.processLoggingTime();
    }
}