package com.chapter09_polymorphism.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /*
        인터페이스
        여기서 다루는 인터페이스는 자바 클래스와 유사한 형태이지만
        추상 메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
        */

        /*
        인터페이스의 사용 목적
        1. 추상 클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용한다.
        2. 자바의 단일 상속의 단점을 국복할 수 있다. (인터페이스는 다중 상속)
        3.
        */

        // 인스턴스 생성 불가능하다
//        InterProduct interProduct = new InterProduct() {}

        InterProduct interProduct = new Product();

        interProduct.nonStaticMethod();
        interProduct.abstractMethod();

        interProduct.defaultMethod();

        /* 인터페이스명. 메소드명(); */
        InterProduct.staticMethod();

        /* 인터페이스명.필드명(); */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);
    }
}
