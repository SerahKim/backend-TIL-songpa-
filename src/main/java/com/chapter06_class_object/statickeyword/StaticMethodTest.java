package com.chapter06_class_object.statickeyword;

public class StaticMethodTest {
    private int count;

    public void nonStaticMethod() {
        this.count++;
        System.out.println("nonStaticMethod 호출...");
    }

    public static void staticMethod() {
//        this.count++; // this는 사용할 수 없다.
        System.out.println("staticMethod 호출...");
    }
}
