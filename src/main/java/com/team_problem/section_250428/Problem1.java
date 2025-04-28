package com.team_problem.section_250428;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        /*
        - 문제 설명
        정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

        - 제한 사항
        n은 0 이상 3000이하인 정수입니다.

        - 입출력 예
        n	  return
        12	    28
        5	    6

        - 입출력 예 설명
        입출력 예 #1
        12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

        입출력 예 #2
        5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
        */

        // scanner 선언
        Scanner scanner = new Scanner(System.in);

        // class 인스턴스화
        Problem1 problem1 = new Problem1();

        // 사용자 입력
        System.out.println("숫자를 입력하세요 : ");
        int n = scanner.nextInt();

        // method 호출
        System.out.println(n + "의 약수의 합은 " + problem1.solution(n));

    }

    public int solution(int n) {
        int sum = 0;
        for(int x = 1; x <= n; x++) {
            if (n % x == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
