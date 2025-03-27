package com.reflections;

import com.reflections.accessprivate.AccessPrivateField;
import com.reflections.accessprivate.Person;
import com.reflections.classinfo.ClassInformation;
import com.reflections.classinfo.SampleClass;
import com.reflections.invokeprivate.Calculator;
import com.reflections.invokeprivate.InvokePrivateMethods;

public class Main {
    public static void main(String[] args) {
//        ClassInformation.get(SampleClass.class);

//        Person person = new Person("Anmol", 20);
//        AccessPrivateField.modifyAge(person, 21);

        InvokePrivateMethods.invoke(new Calculator(), 10, 5);
    }
}