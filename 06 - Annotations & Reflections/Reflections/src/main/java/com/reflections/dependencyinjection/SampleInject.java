package com.reflections.dependencyinjection;

public class SampleInject {
    @Inject
    private CustomDependency dependency;

    public void getAPIDep(){
        System.out.println(dependency.API_KEY);
    }
}
