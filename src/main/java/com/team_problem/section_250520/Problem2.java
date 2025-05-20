package com.team_problem.section_250520;

public class Problem2 {
    public static void main(String[] args) {
        /*
        - 문제 설명
        프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
        전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

        - 제한 조건
        phone_number는 길이 4 이상, 20이하인 문자열입니다.

        - 입출력 예
        phone_number	 return
        "01033334444"	"*******4444"
        "027778888"	    "*****8888"
        */
        Problem2 problem2 = new Problem2();
        System.out.println(problem2.solution("01033334444"));
    }

    // 시간 복잡도 : O(n^2)
    // 이유 : 자바에서 String은 불변이다. 따라서 answer += ...을 할 때마다 새로운 문자열 객체를 생성하고 기존 문자열을 복사하기 때문이다.
    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (i >= 0 && i < phone_number.length() - 4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }

    // 시간 복잡도를 줄이는 방법 : O(n)
    public String solution2(String phone_number) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer.append("*");
            } else {
                answer.append(phone_number.charAt(i));
            }
        }

        return answer.toString();
    }

}
