package com.practice;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        /*
        5. 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.

        -- 입력 예시 --
        문자열을 입력하세요 : apple

        -- 출력 예시 --
        0 : a
        1 : p
        2 : p
        3 : l
        4 : e
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        Problem16 problem16 = new Problem16();
        problem16.strToChar(str);


    }
    public void strToChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(i + " : " + ch);
        }
    }
}
