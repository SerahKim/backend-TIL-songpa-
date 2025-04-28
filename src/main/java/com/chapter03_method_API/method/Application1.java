package com.method;

public class Application1 {
    public static void main(String[] args) {
        /*
        매소드란?
        메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        호출된 순서대로 동작 후 메소드의 동작이 끝나면 자신을 호출한 곳으로 다시 돌아감.
        */

        System.out.println("main() 시작됨....");

        /*
        메소드 호출 방법
        클래스명 사용할 이름 = new 클래스명(); // 객체 생성
        사용할이름.메소드명(); // 메소드 호출
        */
        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨...");
    }

    public void methodA() {
        System.out.println("methodA() 호출함...");
        methodB();
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출함...");
        methodC();
        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC() 호출함...");
        System.out.println("methodC() 종료됨...");
    }
}
