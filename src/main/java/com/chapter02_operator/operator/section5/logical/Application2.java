package com.chapter02_operator.operator.section5.logical;

public class Application2 {
    public static void main(String[] args) {
        /*
        논리 연산자의 우선순위에 대해 이해하고 활용할 수 있다.
        논리 연산자의 우선순위와 활용
        - && : 11순위
        - || : 12순위
        */

        // 1. 1부터 100 사이의 값인지 확인
        // 주의 사항 : 1 <= 변수 <= 100 이렇게는 사용 못함
        // 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다.

        int num1 = 55;
        System.out.println(num1 >= 1 && num1 <= 100);

        int num2 = 166;
        System.out.println(num2 >= 1 && num2 <= 100);

        // 2. 영어 대문자인지 확인
        char ch1 = 'G';
        System.out.println(ch1 >= 'A' && ch1 <= 'Z'); // true

        char ch2 = 'g';
        System.out.println(ch2 >= 'A' && ch2 <= 'Z'); // false

        // 3. 대소문자 상관없이 영문자 y인지 확인
        char ch3 = 'Y';
        System.out.println(ch3 == 'y' || ch3 == 'Y'); // true

        // 4. 영문자인지 확인
        // A : 65, Z : 90, a : 97, z : 122
        char ch4 = 'f';
        System.out.println( (ch4 >= 65 && ch4 <= 90) || (ch4 >= 97 && ch4 <= 122) );

        char ch5 = 'F';
        System.out.println((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z'));



    }
}
