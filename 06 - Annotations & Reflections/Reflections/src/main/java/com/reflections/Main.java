package com.reflections;

import com.reflections.accessprivate.AccessPrivateField;
import com.reflections.accessprivate.Person;
import com.reflections.classinfo.ClassInformation;
import com.reflections.classinfo.SampleClass;
import com.reflections.dynamicallycreateobjects.DynamicallyCreateObjects;
import com.reflections.dynamicallycreateobjects.Student;
import com.reflections.dynamicmethodinvocation.DynamicMethodInvocation;
import com.reflections.invokeprivate.Calculator;
import com.reflections.invokeprivate.InvokePrivateMethods;
import com.reflections.modifystaticfields.ModifyStaticFields;
import com.reflections.retrieveannotations.RetrieveAnnotations;
import com.reflections.retrieveannotations.SomeonesBook;

public class Main {
    public static void main(String[] args) {
//        ClassInformation.get(SampleClass.class);

//        Person person = new Person("Anmol", 20);
//        AccessPrivateField.modifyAge(person, 21);

//        InvokePrivateMethods.invoke(new Calculator(), 10, 5);

//        Student student = (Student) DynamicallyCreateObjects.create(Student.class);
//        System.out.println(student.getName());

//        DynamicMethodInvocation.invoke();

//        RetrieveAnnotations.retrieveAuthor(SomeonesBook.class);

        ModifyStaticFields.modifyAPIKEY();
    }
}