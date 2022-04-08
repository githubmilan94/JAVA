package com.company;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"One");
        hashmap.put(2,"Two");
        hashmap.put(3,"Three");
        hashmap.put(4,"Four");
        hashmap.put(5,"Five");
        System.out.println(hashmap.size());
        System.out.println(hashmap);
    }
}
