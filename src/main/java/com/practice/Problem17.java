package com.practice;

public class Problem17 {
    public static void main(String[] args) {
        /*
        6. 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.

        -- 출력 예시 --
        abcdefghijklmnopqrstuvwxyz
        */

        Problem17 problem17 = new Problem17();
        problem17.alphabet();
    }

    public void alphabet() {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }
    }
}
