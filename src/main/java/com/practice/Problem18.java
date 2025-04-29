package com.practice;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        /*
        7.
        정수를 입력받아 1부터 입력받은 정수까지
        홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.

        -- 입력 예시 --
        정수를 입력하세요 : 5

        -- 출력 예시 --
        토마토마토
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        Problem18 problem18 = new Problem18();
        problem18.tomato(n);
    }

    public void tomato(int n) {
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                System.out.print("토");
            } else if (i % 2 == 0) {
                System.out.print("마");
            }
        }
    }
}
