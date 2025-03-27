package com.annotate.custom.taskinfo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TaskInfo {
    int priority() default 0;
    String assignedTo() default "";
}
