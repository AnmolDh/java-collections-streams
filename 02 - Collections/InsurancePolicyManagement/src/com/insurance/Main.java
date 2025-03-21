package com.insurance;

import com.insurance.performance.PerformanceTest;
import com.insurance.policy.Policy;
import com.insurance.policy.PolicyStore;

public class Main {
    public static void main(String[] args) {
        PolicyStore policyStore = new PolicyStore();

        Policy p1 = new Policy("Jack", "Home", 1920);
        Policy p2 = new Policy("Harry", "Home", 2120);
        Policy p3 = new Policy("Jack", "Car", 830);
        Policy p4 = new Policy("Harry", "Car", 1200);

        policyStore.addPolicy(p1);
        policyStore.addPolicy(p2);
        policyStore.addPolicy(p3);
        policyStore.addPolicy(p4);

        policyStore.displayPolicies();

        PerformanceTest.start();
    }
}