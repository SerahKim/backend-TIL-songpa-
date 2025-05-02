package com.chapter06_class_object.abstraction;

public class CarRacer {
    // CarRacer 클래스 이외의 다른 곳에서의 Car 클래스에 대한 접근을 막는다.
    private final Car car = new Car();

    // 메소드와 필드 상태를 중심으로 한 추상화 기법 (행위 중심)
    // Car의 동작을 startUp(), go()라는 행위로 접근하여, Car 내부의 상세 동작을 몰라도 추상화 기법을 통해 접근 가능하다.
    public void startUp() {
        car.startUp();

    }
    public void stepAccelator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }


}
