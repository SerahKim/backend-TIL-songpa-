package com.team_problem.section_250530;

import java.util.Arrays;
import java.util.Locale;

public class Problem2 {
    public static void main(String[] args) {
        /*
        - 문제 설명

        함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        예를들어 n이 118372면 873211을 리턴하면 됩니다.

        - 제한 조건
        n은 1이상 8000000000 이하인 자연수입니다.

        - 입출력 예
        n	      return
        118372	  873211
        */

        Problem2 problem2 = new Problem2();
        System.out.println(problem2.solution(118372));
    }
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");

        Arrays.sort(strArr);

        StringBuilder sb = new StringBuilder(String.join("",strArr)).reverse();

        return Long.parseLong(sb.toString());
    }
}
