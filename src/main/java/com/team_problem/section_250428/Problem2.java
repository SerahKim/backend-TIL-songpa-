package com.team_problem.section_250428;

public class Problem2 {
    public static void main(String[] args) {
        /*
        - 문제 설명
        정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록
        solution 함수를 작성해주세요.

        - 제한사항
        0 < n ≤ 1000

        - 입출력 예
        n	  result
        10	    30
        4	    6

        - 입출력 예 설명
        입출력 예 #1
        n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.

        입출력 예 #2
        n이 4이므로 2 + 4 = 6을 return 합니다.
        */

        int n = 10;

        Problem2 problem2 = new Problem2();
        int answer = problem2.solution(n);
        System.out.println("n : " + answer);

    }

    public int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
