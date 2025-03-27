package com.annotate.custom.cacheresult;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveMethods {
    private static Map<Integer, Long> cache = new HashMap<>();

    @CacheResult
    public static long fibonacci(int n) {
        if (cache.containsKey(n)) {
            System.out.println("Returning cached result for n = " + n);
            return cache.get(n);
        }

        long result;
        if (n <= 1) {
            result = n;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }

        cache.put(n, result);
        return result;
    }
}
