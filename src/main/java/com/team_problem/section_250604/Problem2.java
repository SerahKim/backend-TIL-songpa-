package com.team_problem.section_250604;

import com.team_problem.section_250602.Problem1;

public class Problem2 {
    public static void main(String[] args) {
        /*
        - 문제 설명

        길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

        - 제한 조건
        n은 길이 10,000이하인 자연수입니다.

        - 입출력 예
        n	     return
        3	     "수박수"
        4	     "수박수박"
        */
        Problem2 problem2 = new Problem2();
        System.out.println(problem2.solution(3));
    }

    public String solution(int n) {
        return "수박".repeat((int) Math.ceil((double) n / 2)).substring(0, n);
    }
}
