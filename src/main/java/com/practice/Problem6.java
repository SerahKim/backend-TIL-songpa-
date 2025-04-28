package com.practice;

public class Problem6 {
    public static void main(String[] args) {
        int num = 5;

        String isOddEven = (num % 2 == 0) ? num + "은 짝수입니다." : num + "은 홀수입니다.";

        System.out.println(isOddEven);
    }
}
