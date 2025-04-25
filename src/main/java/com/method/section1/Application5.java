package com.method.section1;

public class Application5 {
    public static void main(String[] args) {
        /*
        메소드 리턴에 대해 이해할 수 있다.
        return이란?
            모든 메소드 내부에는 return;이 존재한다.
            void형 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
            return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
        */

        System.out.println("main() 메소드 시작함...");

        // 1. 메소드 리턴 테스트
        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main() 메소드 종료됨...");
    }
    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        return;

//        System.out.println("단순한 출력문 ..."); // return은 반드시 맨 마지막에 적어줘야한다. 이미 자신을 호출한 곳으로 돌아가버렸는데 리턴 다음 코드를 수행하는 것은 불가능하기 때문
    }
}
