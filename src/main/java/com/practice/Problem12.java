package com.practice;

public class Problem12 {
    public static void main(String[] args) {
        /*
        1. 반복문을 사용하여 1부터 100까지 더한 합계를 출력하세요.
        */

        Problem12 problem12 = new Problem12();
        System.out.println(problem12.sumFunc());
    }

    public int sumFunc() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
