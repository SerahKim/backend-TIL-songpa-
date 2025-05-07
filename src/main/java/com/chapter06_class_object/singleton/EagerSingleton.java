package com.chapter06_class_object.singleton;

public class EagerSingleton {

    // 인스턴스 먼저 생성
    private static EagerSingleton eager = new EagerSingleton();

    // 밖에서 인스턴스를 새롭게 생성할 수 없게 private
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return eager;
    }
}
