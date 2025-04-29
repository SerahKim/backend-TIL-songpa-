package com.chapter04_control_flow.looping;

public class B_nestedWhile {
    public void testWhileExample3() {
        // 중첩된 while문을 이용한 구구단 출력하기
        int dan = 2;
        while (dan < 10) {

            int su = 1;
            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan + su));
                su++;
            }

            System.out.println();
            dan++;
        }
    }
}
