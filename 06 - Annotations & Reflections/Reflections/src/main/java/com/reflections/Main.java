package com.reflections;

import com.reflections.accessprivate.AccessPrivateField;
import com.reflections.accessprivate.Person;
import com.reflections.classinfo.ClassInformation;
import com.reflections.classinfo.SampleClass;
import com.reflections.customloggingproxy.DynamicProxy;
import com.reflections.customloggingproxy.Greeting;
import com.reflections.customloggingproxy.GreetingCls;
import com.reflections.customobjectmapper.ObjectMapper;
import com.reflections.customobjectmapper.SampleClassOM;
import com.reflections.dependencyinjection.DIContainer;
import com.reflections.dependencyinjection.SampleInject;
import com.reflections.dynamicallycreateobjects.DynamicallyCreateObjects;
import com.reflections.dynamicallycreateobjects.Student;
import com.reflections.dynamicmethodinvocation.DynamicMethodInvocation;
import com.reflections.invokeprivate.Calculator;
import com.reflections.invokeprivate.InvokePrivateMethods;
import com.reflections.methodexecutiontiming.MethodExecutionTiming;
import com.reflections.methodexecutiontiming.SampleME;
import com.reflections.modifystaticfields.ModifyStaticFields;
import com.reflections.retrieveannotations.RetrieveAnnotations;
import com.reflections.retrieveannotations.SomeonesBook;

import java.util.HashMap;
import java.util.Map;

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

//        ModifyStaticFields.modifyAPIKEY();

//        Map<String, Object> properties = new HashMap<String, Object>();
//        properties.put("name", "John");
//        properties.put("age", 22);
//        SampleClassOM scom = (SampleClassOM) ObjectMapper.toObject(SampleClassOM.class, properties);
//        System.out.println(scom);

//        Greeting greeting = new GreetingCls();
//        Greeting proxyGreeting = DynamicProxy.createProxy(greeting, Greeting.class);
//        proxyGreeting.sayHello();

//        SampleInject sampleInject = DIContainer.createInstanceDI(SampleInject.class);
//        sampleInject.getAPIDep();

        MethodExecutionTiming.execute(SampleME.class);
    }
}