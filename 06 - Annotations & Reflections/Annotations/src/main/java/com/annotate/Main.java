package com.annotate;

import com.annotate.custom.bugreport.Report;
import com.annotate.custom.cacheresult.ExpensiveMethods;
import com.annotate.custom.importantmethod.Methods;
import com.annotate.custom.jsonfield.JsonSerializer;
import com.annotate.custom.jsonfield.JsonUser;
import com.annotate.custom.logexecutiontime.Logger;
import com.annotate.custom.maxlength.User;
import com.annotate.custom.roleallowed.RestrictedMethods;
import com.annotate.custom.roleallowed.Role;
import com.annotate.custom.roleallowed.UserForRole;
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

//        Logger.processLoggingTime();

//        User user = new User("Daneweweww");

//        UserForRole user = new UserForRole("idk", Role.ADMIN);
//        RestrictedMethods.invokeAdminMethod(user);

//        JsonUser user = new JsonUser("Anmol", 21);
//        String jsonUser = JsonSerializer.toJson(user);
//        System.out.println(jsonUser);

        ExpensiveMethods.fibonacci(10);
        ExpensiveMethods.fibonacci(10);
    }
}