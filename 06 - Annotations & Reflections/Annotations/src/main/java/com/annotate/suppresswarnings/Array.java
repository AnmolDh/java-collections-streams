package com.annotate.suppresswarnings;

import java.util.ArrayList;

public class Array {
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void createArray() {
        ArrayList rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add("World");

        for (String s : (ArrayList<String>) rawList) {
            System.out.println(s);
        }
    }
}
