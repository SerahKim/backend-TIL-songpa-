package com.method.section1;

public class Application6 {
    public static void main(String[] args) {
        /*
        복귀를 할 때 그냥 복귀를 할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        이 때 가지고 가는 값을 리턴값이라고 한다.
        */

        Application6 app6 = new Application6();

        // 1. 메소드 리턴값 확인
        String returnText = app6.testMethod();
        System.out.println("returnText = " + returnText);
        System.out.println(app6.testMethod());
    }
    public String testMethod() {

        // public 뒤에 바로 return으로 가지고 갈 타입을 명시한다.
        // 아무것도 return 하지 않는 경우 void, 값을 반환하는 경우에는 반환값의 자료형을 작성해야 한다.
        return "hello world";
    }

}
