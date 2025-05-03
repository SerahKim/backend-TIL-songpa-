package com.team_problem.section_250502;

public class Problem3 {
    public static void main(String[] args) {
        /*
        - 문제 설명
        문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

        - 제한사항
        1 ≤ my_string의 길이 ≤ 1,000

        - 입출력 예
        my_string	 return
        "jaron"	   "noraj"
        "bread"	   "daerb"

        - 입출력 예 설명
        입출력 예 #1
        my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.

        입출력 예 #2
        my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.
        */
        Problem3 problem3 = new Problem3();

        System.out.println(problem3.solution("bread"));
    }

    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer = my_string.charAt(i) + answer;
        }
        return answer;
    }
}
