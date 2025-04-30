package com.team_problem.section_250428;

import java.security.PublicKey;
import java.sql.Array;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        /*
        - 문제 설명
        문자열 배열 strlist가 매개변수로 주어집니다.
        strlist 각 원소의 길이를 담은 배열을 return하도록
        solution 함수를 완성해주세요.

        - 제한사항
        1 ≤ strlist 원소의 길이 ≤ 100
        strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.

        - 입출력 예
        strlist	                          result
        ["We", "are", "the", "world!"]	  [2, 3, 3, 6]
        ["I", "Love", "Programmers."]	    [1, 4, 12]

        - 입출력 예 설명
        입출력 예 #1
        ["We", "are", "the", "world!"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.

        입출력 예 #2
        ["I", "Love", "Programmers."]의 각 원소의 길이인 [1, 4, 12]을 return합니다.
        */
        String[] strList = {"I", "Love", "Programmers."};

        Problem3 problem3 = new Problem3();
        int[] intList = problem3.solution(strList);
        System.out.println(Arrays.toString(strList) + "의 각 원소의 길이는 " + Arrays.toString(intList));
    }

    public int[] solution(String[] strlist) {
        int[] result = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            result[i] = strlist[i].length();
        }

        return  result;
    }

}
