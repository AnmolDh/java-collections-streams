package com.reflections;

import com.reflections.classinfo.ClassInformation;
import com.reflections.classinfo.SampleClass;

public class Main {
    public static void main(String[] args) {
        ClassInformation.get(SampleClass.class);
    }
}