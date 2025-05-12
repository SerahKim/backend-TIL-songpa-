package com.chapter10_api.string;

import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {
        /*
        문자열 분리
        문자열을 특정 구분자로 분리하여 문자열을 반환하는 기능을 한다.
        - split() : 정규 표현식을 이용하여 문자열을 분리한다.
                    정규 표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
                    공백을 포함
        - StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 구분한다.
                            split()보다는 속도면에서 더 빠르다.
                            공백 무시
        */
        String emp1 = "100/홍길동/서울/영업부"; // 모든 값 존재함
        String emp2 = "200/유관순//총무부"; // 주소 없음
        String emp3 = "300/이순신/경기도"; // 부서 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for (int i = 0; i < empArr1.length; i++) {
            System.out.println(empArr1[i]);
        }
        System.out.println("-------------------------");
        for (String ea2 : empArr2) {
            System.out.println(ea2);
        }
        System.out.println("-------------------------");
        for (int i = 0; i < empArr3.length; i++) {
            System.out.println(empArr3[i]);
        }
        System.out.println("-------------------------");
        StringTokenizer str1 = new StringTokenizer(emp1, "/");
        StringTokenizer str2 = new StringTokenizer(emp2, "/");
        StringTokenizer str3 = new StringTokenizer(emp3, "/");

        while (str1.hasMoreTokens()) {
            System.out.println(str1.nextToken());
        }
        System.out.println("-------------------------");
        while (str2.hasMoreTokens()) {
            System.out.println(str2.nextToken());
        }
        System.out.println("-------------------------");
        while (str3.hasMoreTokens()) {
            System.out.println(str3.nextToken());
        }

    }
}
