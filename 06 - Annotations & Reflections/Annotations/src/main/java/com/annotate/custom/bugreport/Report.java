package com.annotate.custom.bugreport;

import java.lang.reflect.Method;

public class Report {
    @BugReport(description = "This is a sample bug report")
    @BugReport(description = "This is also a sample bug report")
    public void printBugReport(){
        try{
            Class<?> clazz = Report.class;
            Method method = clazz.getMethod("printBugReport");
            BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

            for (BugReport br : bugReports){
                System.out.println("Bug: " + br.description());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
