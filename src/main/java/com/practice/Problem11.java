package com.practice;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("월 급여액을 입력해주세요 : ");
        int monthSalary = sc.nextInt();
        System.out.println("월 매출액을 입력해주세요 : ");
        int monthTake = sc.nextInt();

        int bonusRate = 0;


        if (monthTake >= 50000000) {
             bonusRate = 5;
        } else if(monthTake >= 30000000) {
             bonusRate = 3;
        } else if (monthTake >= 10000000) {
             bonusRate = 1;
        } else {
             bonusRate = 0;
        }

        int bonusAmount = (int)(monthTake * (bonusRate/100.0));
        int totalSalary = monthSalary + bonusAmount;

        System.out.println("매출액 : " + monthTake);
        System.out.println("보너스율 : " + bonusRate + "%");
        System.out.println("월 급여 : " + monthSalary);
        System.out.println("보너스 금액 : " + bonusAmount);
        System.out.println("===============================");
        System.out.println("총급여 : " + totalSalary);
    }
}
