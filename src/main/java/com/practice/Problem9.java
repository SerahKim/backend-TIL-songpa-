package com.practice;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요? : ");
        int num = sc.nextInt();

        if(num >= 1 && num <= 10) {
            if(num % 2 != 0) {
                System.out.print("홀수네요, 인형 선물입니다!");
            } else if(num % 2 == 0) {
                System.out.print("짝수네요, 모자 선물입니다.");
            }
        } else {
            System.out.print("당첨 번호는 1~10 사이에만 있어요.");
        }

    }
}
