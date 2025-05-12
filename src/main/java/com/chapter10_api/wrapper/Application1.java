package com.chapter10_api.wrapper;

import java.nio.IntBuffer;

public class Application1 {
    public static void main(String[] args) {

        /*
        기본타입         Wrapper 클래스
        ----------------------------
        byte      |     Byte
        short     |     Short
        int       |     Integer
        long      |     Long
        float     |     Float
        double    |     Double
        char      |     Character
        boolean   |     Boolean
        */

        /*
        박싱(Boxing) : 기본타입을 래퍼 클래스의 인스턴스로 인스턴스화 하는 것
        언박싱(UnBoxing) : 래퍼 클래스 타입의 인스턴스를 기본 타입으로 변경하는 것
        */

        int intValue = 20;
        Integer boxingNumber1 = Integer.valueOf(intValue); // wrapper 클래스로 박싱 처리
        int unBoxingNumber1 = boxingNumber1.intValue(); // int 타입으로 언박싱 처리

        /* 오토 박싱과 오토 언박싱 */
        Integer boxingNumber2 = intValue; // 오토 박싱, Integer.valueOf()를 쓰지 않고 바로 박싱할 수 있음
        int unBoxingNumber2 = boxingNumber2; // 오토 언박싱
    }
}
