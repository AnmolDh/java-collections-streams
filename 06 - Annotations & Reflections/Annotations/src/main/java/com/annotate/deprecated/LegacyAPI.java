package com.annotate.deprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("Old Feature Used");
    }

    public void newMethod() {
        System.out.println("New Feature Used");
    }
}
