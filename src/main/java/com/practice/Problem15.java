package com.practice;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        /*
        4. 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.

        -- 입력 예시 --
        정수를 입력하세요 : 10

        -- 출력 예시 --
        1부터 10까지 짝수의 합 : 30
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int n = sc.nextInt();

        Problem15 problem15 = new Problem15();
        problem15.sumEven(n);
    }

    public void sumEven(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sum += i;
            } else {
                continue;
            }
        }

        System.out.println("1부터 " + n + "까지의 합 : " + sum);
    }
}
