package com.chapter04_control_flow.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNine() {
        for (int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println(); // 한 단씩 개행
        }
    }

    public void printStarInputRowTimes() {
        /*
        키보드로 정수를 하나 입력 받아
        해당 정수만큼 한 행에 "*" 5개씩 출력하세요.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {

            // 별을 5개 출력하는 것을 반복
            for(int j = 1; j < 6; j++) {
            System.out.print("*");
            }

            // 별을 출력하고 난 뒤 줄 바꿈
            System.out.println();
        }



    }
}
