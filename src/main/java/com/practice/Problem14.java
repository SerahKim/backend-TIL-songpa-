package com.practice;

public class Problem14 {
    public static void main(String[] args) {
        /*
        3. 반복문을 사용하여 7단 구구단을 출력하세요.
        */

        Problem14 problem14 = new Problem14();
        problem14.gugudanSeven();

    }

    public void gugudanSeven() {
        int dan = 7;
        int multi = 0;

        for (int su = 1; su <= 9; su++) {
            multi = dan * su;
            System.out.println(dan + " * " + su + " = " + multi);
        }
    }
}
