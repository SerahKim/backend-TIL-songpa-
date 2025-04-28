package com.chapter03_method_API.method;

public class Application7 {
    public static void main(String[] args) {
        int first = 20;
        int second = 10;

        Application7 app7 = new Application7();
        System.out.println(app7.plusTwoNumbers(first, second));
        System.out.println(app7.minusTwoNumbers(first, second));
        System.out.println(app7.multipleTwoNumbers(first, second));
        System.out.println(app7.divideTwoNumbers(first, second));
    }

    public int plusTwoNumbers (int first, int second) {
        return first + second;
    }

    public int minusTwoNumbers (int first, int second) {
        return first - second;
    }

    public int multipleTwoNumbers (int first, int second) {
        return first * second;
    }

    public int divideTwoNumbers (int first, int second) {
        return first / second;
    }
}
