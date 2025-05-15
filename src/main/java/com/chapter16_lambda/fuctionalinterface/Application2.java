package com.chapter16_lambda.fuctionalinterface;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {
        /* 표준 함수적 인터페이스(2) : Supplier */

        /* 1. Supplier<T>#get() : T : 객체 T를 리턴한다. */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        /* 2. BooleanSupplier#getAsBoolean() : boolean : boolean값을 리턴한다. */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0? false : true;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /* 3. IntSupplier#getAsInt() : int : int 값을 리턴한다. */
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위를 던져서 나온 수 : " + intSupplier.getAsInt());

        /* 4. DoubleSupplier#getAsDouble() : double : double 값을 리턴한다. */
        DoubleSupplier doubleSupplier = () -> Math.random(); // 0 ~ 0.99 사이의 값 랜덤
        System.out.println("Math.random()의 리턴값 : " + doubleSupplier.getAsDouble());

        /* 5. LongSupplier#getAsLong() : long : long값을 리턴한다. */
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : " + longSupplier.getAsLong());
    }
}
