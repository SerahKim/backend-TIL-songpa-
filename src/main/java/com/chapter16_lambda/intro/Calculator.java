package com.chapter16_lambda.intro;

/*
자바에서는 메소드를 독립적으로 선언하는 것이 불가능하다.
클래스나 인터페이스 내부에서만 선언되기 때문에 메소드를 가지는 클래스나 인터페이스가 필요하다.
하지만 모든 인터페이스에 메소드를 작성한다고 람다식을 활용할 수 있는 것은 아니다.
인터페이스 내부에 하나의 추상메소드가 선언된 인퍼테이스만 람다식읠 타깃이 될 수 있다.
이러한 인터페이스를 함수적 인터페이스(functional interface)라고 하며,
해당 조건을 만족하는지 컴파일 시점에 체크해주는 이근이
@FunctionalInterface 어노테이션이다.
*/

@FunctionalInterface
public interface Calculator {
    public int sumTwoNumber(int a, int b);
//    public int minusTwoNumber(int a, int b); // 어노테이션이 붙어있으면 딱 하나만 사용이 가능하다.
}
