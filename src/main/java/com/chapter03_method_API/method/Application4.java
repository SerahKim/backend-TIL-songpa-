package com.method;

public class Application4 {
    public static void main(String[] args) {
        // 여러 개의 전달 인자를 이용한 메소드 호출을 할 수 있다.
        Application4 app4 = new Application4();

        // 1. 여러 개의 매개변수를 가진 메소드 호출

        app4.testMethod("홍길동", 20, '남');
//        app4.testMethod(20, "홍길동", '남'); // 매개변수의 순서 불일치 시 컴파일 에러

        // 2. 변수에 저장된 값을 전달하며 호출할 수 있다.
        String name = "유관순";
        int age = 20;
        char gender = '여';

        app4.testMethod(name, age, gender);
    }

    // 상수도 매개변수로 선언가능하다. (이 때는 선택적으로 소문자로도 가능)
    public void testMethod(String name, int age, final char gender) {
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다.");
    }
}
