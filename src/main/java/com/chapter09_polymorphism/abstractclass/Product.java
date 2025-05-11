package com.chapter09_polymorphism.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private  static  int staticField;

    // 기본 생성자를 가질 수는 있지만 직접적으로 인스턴스를 생성할 수 없다.
    public Product() {}

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출됨.");

    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 호출됨.");
    }

    public abstract void abstractMethod(); // 추상 메소드가 존재하면 클래스도 반드시 추상 클래스로 만들어줘야 한다.


}
