package com.literal_variable.section01.literal;

public class Application3 {
    public static void main(String[] args) {
        // 문자열 합치기 결과를 예측하고 사용할 수 있다.
        // 1. 두 개의 문자열 합치기
        System.out.println("========= 정수와 정수의 연산 =========");
        System.out.println(9 + 9);
        System.out.println("9" + 9); // 문자열 9로 인식되어서 문자열 합치기로 연산이 된다.
        System.out.println(9 + "9"); // 문자열 9로 인식되어서 문자열 합치기로 연산이 된다.
        System.out.println("9" + "9"); // 문자열 9로 인식되어서 문자열 합치기로 연산이 된다.

        // 2. 세 개의 문자열 합치기
        System.out.println("========= 세 개의 문자열 합치기 =========");
        System.out.println(9 + 9 + "9"); // 189, '+' 연산 방향은 왼쪽에서 오른쪽이이다.
        System.out.println(9  + "9" + 9); // 999
        System.out.println("9" + 9  +  9); // 999
        System.out.println("9" + (9  +  9)); // 918

        // 3. 문자열 합치기 응용
        System.out.println("========= 문자열 응용 =========");
        System.out.println(10 + 26);
        System.out.println(10 - 26);
        System.out.println(10 * 26);
        System.out.println(10 / 26);
        System.out.println(10 % 26);

        System.out.println("========= 문자열 응용 결과 보기 좋게 출력 =========");
        System.out.println("10과 20의 합 : " + 10 + 26); // 10과 20의 합 : 1026, 소괄호를 쓰지 않으면 문자열로 인식돼서 원하지 않는 값이 나올 수 있다.
        System.out.println("10과 20의 합 : " + (10 + 26)); // 10과 20의 합 : 36
        System.out.println("10과 20의 차 : " + (10 - 26));
        System.out.println("10과 20의 곱 : " + (10 * 26));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 26));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 26));


    }
}
