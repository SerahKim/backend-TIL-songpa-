package com.chapter03_method_API.method;

public class Calculator {
    public int minNumberOf (int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxNumberOf (int first, int second) {
        return (first > second) ? first : second;
    }
}
