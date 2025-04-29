package com.team_problem.section_250427;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        /*
        - 문제 설명
        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

        - 제한 조건
        n은 10,000,000,000이하인 자연수입니다.

        - 입출력 예
        n	    return
        12345	[5,4,3,2,1]
        */

        int n = 12345;

        Problem3 problem3 = new Problem3();

        System.out.println(Arrays.toString(problem3.solution(n)));
    }

    public int[] solution(int n) {
        String str = "" + n;
        int [] intArr = new int[str.length()];

        for (int i = str.length() - 1; i >= 0 ; i--) {
            intArr[str.length()- 1 - i] = str.charAt(i) - '0';
        }
        return intArr;
    }
}
