package com.practice;

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        /*
        8. 정수형 변수 두 개를 선언하고, 사용자로부터 각각 값을 입력받은 후,
        다음 연산을 순서대로 출력하세요.

        첫 번째 : 더하기

        두 번째 : 빼기

        세 번째 : 곱하기

        네 번째 : 나누기(몫)

        다섯 번째 : 나누기(나머지)

        단, 나눗셈과 나머지 연산 시 0으로 나누는 경우 "0으로 나눌 수 없습니다"라는 메시지를 출력하도록 처리하세요.

        -- 출력 예시 --
        =============================
        첫 번째 정수를 입력하세요: 20
        두 번째 정수를 입력하세요: 30
        더하기 결과 : 50
        빼기 결과 : -10
        곱하기 결과 : 600
        나누기한 몫 : 0
        나누기한 나머지 : 20
        ==============================
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int n1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int n2 = sc.nextInt();

        Problem19 problem19 = new Problem19();
        problem19.calculator(n1, n2);
    }

    public void calculator(int n1, int n2) {
        int result = 0;

        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1 :
                    result = n1 + n2;
                    System.out.println("더하기 결과 : " + result);
                    break;
                case 2 :
                    result = n1 - n2;
                    System.out.println("빼기 결과 : " + result);
                    break;
                case 3 :
                    result = n1 * n2;
                    System.out.println("곱하기 결과 : " + result);
                    break;
                case 4 :
                    if(n2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                    }
                    result = n1 / n2;
                    System.out.println("나누기한 몫 결과 : " + result);
                    break;
                case 5 :
                    if(n2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                    }
                    result = n1 % n2;
                    System.out.println("나누기한 나머지 결과 : " + result);
                    break;
            }
        }

    }
}
