package com.team_problem.section_250602;

public class Problem2 {
    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        System.out.println(problem2.solution("one4seveneight"));
    }
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        for (int i = 0; i < strArr.length; i++) {
            if (s.contains(strArr[i])) {
                s = s.replace(strArr[i], String.valueOf(i));
            }
        }

        return Integer.parseInt(s);
    }
}
