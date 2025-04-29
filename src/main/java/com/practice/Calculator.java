package com.practice;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        int max = Math.max(a,b);

        System.out.println("두 수 중 큰 수는 " + max + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int minusTwoNumber(int a, int b) {
        int sub = a - b;
        return sub;
    }
}
