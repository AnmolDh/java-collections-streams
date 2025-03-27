package com.annotate;

import com.annotate.custom.taskinfo.TaskManager;
import com.annotate.deprecated.LegacyAPI;
import com.annotate.override.Dog;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();

//        LegacyAPI api = new LegacyAPI();
//        api.oldFeature();
//        api.newMethod();

        TaskManager taskManager = new TaskManager();
        taskManager.getAnnotationDetails();
    }
}