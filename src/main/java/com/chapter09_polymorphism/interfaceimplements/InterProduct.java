package com.chapter09_polymorphism.interfaceimplements;

public interface InterProduct {
    /*
    인터페이스는 상수 필드만 작성이 가능하다.
    public static final 제어자 조합 상수 필드라고 부른다.
    반드시 선언과 동시에 초기화 해줘야 한다.
    */

    public static final int MAX_NUM = 100;

    // 모든 필드는 묵시적으로 public static final이다.
    int MIN_NUM = 10;

    // 인터페이스는 생성자를 가질 수 없다.
//    public InterProduct() {}

    // 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다.
//    public void nonStaticMethod() {}

    // 추상 메소드만 사용 가능하다.
    public abstract void nonStaticMethod();

    // 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다. (다른 접근 제한자 사용 불가)
    // 따라서 인터페이스의 메소드를 오버라이딩 해야 하는 경우 반드시 접근 제한자를 public으로 해야 오버라이딩이 가능하다.
    void abstractMethod();

    // static 메소드는 작성 가능하다
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 statucMethod 호출됨...");
    }

    // default 키워드를 사용하면 non-static 메소드도 작성 가능하다.
    /*
    인터페이스의 default 메소드
    의미: 인터페이스에 실제 구현이 포함된 메소드를 정의할 수 있게 함
    목적: 인터페이스에 새 기능을 추가하면서 기존 구현체들의 호환성을 유지
    특징: non-static 메소드이며 구현 클래스에서 재정의 가능
    */

    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }
}
