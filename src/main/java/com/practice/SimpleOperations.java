package com.practice;

public class SimpleOperations {
    /*
    // method practice (2)

    다음과 같은 조건을 만족하는 프로그램을 작성하시오.

    반환형과 매개변수 유무에 따라 메소드를 작성하고, 이를 호출하거나 출력하시오.

    1. 구현 클래스 및 구현 내용

    com.ohgiraffers.practice02.SimpleOperations.java

    + printMessage():void                         // 함수 호출 확인용 메소드
    + sumNumbers(start:int, end:int):int          // start부터 end까지의 숫자들의 합을 리턴함
    + isEvenNumber(num:int):boolean               // 주어진 숫자가 짝수이면 true, 아니면 false를 리턴함
    + countCharacter(input:String, ch:char):int   // 주어진 문자열에서 특정 문자의 개수를 리턴함
    + reverseString(input:String):String          // 주어진 문자열을 뒤집어서 리턴함


    com.ohgiraffers.practice02.Application.java

    + main(args:String[]):void                    // 모든 메소드는 main 함수에서 호출하여 출력

    ------------------------------------------------------------------------------------

    2. Application 클래스 작성 내용

    public class Application {
        public static void main(String args[]) {
            // 메소드 호출 확인용 메소드 호출
            // start부터 end까지의 숫자들의 합을 출력하는 메소드 호출
            // 주어진 숫자가 짝수인지 판별하는 메소드 호출 후 결과 출력
            // 주어진 문자열에서 특정 문자의 개수를 출력하는 메소드 호출
            // 주어진 문자열을 뒤집은 결과를 출력하는 메소드 호출
        }
    }

    ------------------------------------------------------------------------------------

    3. 실행 결과 예시

    메소드 호출 확인
    1부터 10까지의 숫자들의 합은 : 55
    10은 짝수입니다.
    "Hello World"에서 'o'의 개수는 : 2
    "Hello World"를 뒤집은 결과는 : dlroW olleH
    */

    public void printMessage() {
        System.out.println("메소드 호출 확인");
    }

    public int sumNumbers(int start, int end) {
        int result = 0;

        for (int i = start; i <= end; i++) {
            result += i;
        }

        return result;
    }

    public boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else if (num % 2 != 0) {
            return false;
        }
        return true;
    }

    public int countCharacter(String input, char ch) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
            ;
        }

        return count;
    }

    public String reversString(String input) {
        StringBuffer str = new StringBuffer(input);
        return  str.reverse().toString();
    }
}
