package com.team_problem.section_250428;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        /*
        - 문제 설명
        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

        - 제한사항
        N의 범위 : 100,000,000 이하의 자연수

        - 입출력 예
        N	  answer
        123	  6
        987	  24

        - 입출력 예 설명
        입출력 예 #1
        문제의 예시와 같습니다.

        입출력 예 #2
        9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
        */

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 클래스 인스턴스화
        Problem2 problem2 = new Problem2();

        // input 받기
        System.out.println("숫자를 입력해주세요 : ");
        int n = scanner.nextInt();

        // 결과 출력
        System.out.println(problem2.solution(n));

    }

    public int solution(int n) {
        int sum = 0;
        while(n > 0) { // n이 0이 되는 순간 더 이상 꺼내올 자리수가 없기 때문에 n이 0이 될 때까지 반복
            sum += n % 10; // 123 % 10 = 3이기 때문에 마지막 자리수를 얻을 수 있다.
            n /= 10; // 123 / 10 = 12이기 때문에 n의 값은 마지막 자리수인 3이 없어지고 12가 된다. (즉, 처리가 끝난 자리수를 버릴 수 있다.)
        }

        return sum;
    }
}
