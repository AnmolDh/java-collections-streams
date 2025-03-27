package com.annotate.custom.taskinfo;

@TaskInfo(priority = 1, assignedTo = "Task Manager Class")
public class TaskManager {
    public void getAnnotationDetails() {
        Class<?> clazz = this.getClass();

        if (clazz.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = clazz.getAnnotation(TaskInfo.class);
            System.out.println("Task Priority: " + taskInfo.priority());
            System.out.println("Task Assigned To: " + taskInfo.assignedTo());
        }
    }
}
