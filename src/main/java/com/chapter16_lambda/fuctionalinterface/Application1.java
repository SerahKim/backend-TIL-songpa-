package com.chapter16_lambda.fuctionalinterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {
        /* 표준 함수적 인터페이스(1) : Consumer */
        /*
        JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
        Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다. (매개변수 소비자 역할)
        Supplier : 매개변수 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
        Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
        Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있따. 차이점은 매개변수로 연산을 한 후 동일타입으로 리턴한다.
        Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
        */

        /* 1. Consumer<T>#accpet(T t) : void : 객체 T를 받아 소비한다. */
        Consumer<String> consumer = (String str) -> System.out.println(str + "이 입력됨.");
        consumer.accept("hello world");

        /* 2. BiConsumer<T, U>#accpet(T t, U u) : void : 객체 T, U를 받아 소비한다. */
        BiConsumer<String, LocalTime> biConsumer = (String str1, LocalTime time) -> System.out.println(str1 + "이(가)" + time + "에 입력됨");
        biConsumer.accept("hello world", LocalTime.now());

        /* 3. IntConsumer#accpet(int value) : void : int 값을 받아 소비한다. */
        IntConsumer intConsumer = (int num1) -> System.out.println("입력하신 정수의 제곱은 " + (num1 * num1) + "입니다.");
        intConsumer.accept(15);

        /* 4. LongConsumer#accept(long value) : void : long 값을 받아 소비한다. */
        LongConsumer longConsumer = (long num2) -> System.out.println("입력하신 점수는 " + num2 + "입니다.");
        longConsumer.accept(12345);

        /* 5. ObjIntConsumer<T>#accept(T t, int value) : void : 객체 T와 int를 받아 소비한다.*/
        ObjIntConsumer<java.util.Random> objIntConstumer = (random, bound) -> System.out.println("0부터 " + bound + "전 까지의 난수 발생 : " + random.nextInt(bound));
        objIntConstumer.accept(new java.util.Random(), 10);

        /* 6. ObjLongConsumer<T>#accpet(T t, long value) : void : 객체 T와 long 값을 받아 소비한다. */
        ObjLongConsumer<LocalDate> localDateObjLongConsumer = ((localDate, value) -> System.out.println(localDate + "의" + value + "일 후의 날짜는 : " + localDate.plusDays(value)));
        localDateObjLongConsumer.accept(LocalDate.now(), 10);

        /* 7. ObjDoubleConsumer<T>#accept(T t , double value) : void : 객체 T와 double 값을 받아 소비한다. */
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer = (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), 123.0);
    }
}
