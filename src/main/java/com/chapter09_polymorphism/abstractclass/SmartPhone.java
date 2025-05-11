package com.chapter09_polymorphism.abstractclass;

public class SmartPhone extends Product {

    public SmartPhone() {}

    // 추상 클래스를 상속받았을 경우에는 추상 메소드를 반드시 오버라이딩 해야 한다.
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstractMethod를 오버라이딩 한 메소드를 호출함...");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}
