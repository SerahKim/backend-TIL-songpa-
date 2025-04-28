package com.chapter03_method_API.method;

public class Application3 {
    public static void main(String[] args) {
        /*
        메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 사용할 수 있다.
        전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        지금까지 우리가 배운 변수는 지역변수에 해당한다.

        * 변수의 종류
        1. 지역변수
           - 지역 변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. (지역 변수의 스코프)
        2. 매개변수
            - 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
            - 이 때 전달하는 값은 전달인자라고 부르고, 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수라고 부른다.
        3. 전역변수(필드)
        4. 클래스(static) 변수
        */

        Application3 app3 = new Application3();

        // 1. 전달인자로 값 전달 테스트
        app3.testMethod(40);
//        app3.testMethod("40"); // 매개변수는 int 형이지만 인자가 String 형이기 때문에 호출할 수 없다.
//        app3.testMethod(20, 30, 40); // 매개 변수와 개수와 순서에 어긋나도 호출할 수 없다.
//        app3.testMethod();

        // 2. 변수에 저장한 값 전달 테스트
        int age = 20;
        app3.testMethod(age);

        // 3. 자동 형변환 이용하여 값 전달
        byte byteAge = 10; // int보다 값이 작기 때문에 byte가 int로 자동 형변환이 되어 들어간다.
        app3.testMethod(byteAge);

        // 4. 강제 형변환 이용하여 값 전달
        long longAge = 80;
//        app3.testMethod(longAge); // int형 보다 값이 크기 때문에 자동 형변환이 되지 않기 때문에 강제 형변환을 해줘야한다.
        app3.testMethod((int) longAge); // int형 보다 값이 크기 때문에 자동 형변환이 되지 않기 때문에 강제 형변환을 해줘야한다.

        // 5. 연산 결괄르 이용해서 값 전달
        app3.testMethod(age * 3);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는" + age + "세 입니다.");
    }
}
