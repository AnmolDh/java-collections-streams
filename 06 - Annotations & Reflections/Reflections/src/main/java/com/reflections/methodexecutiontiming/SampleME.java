package com.reflections.methodexecutiontiming;

public class SampleME {
    public void quickMethod() {
        System.out.println("Quick method executed.");
    }

    public void slowMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Slow method executed.");
    }
}
