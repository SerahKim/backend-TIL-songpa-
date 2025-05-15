package com.chapter16_lambda.fuctionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Application3 {
    public static void main(String[] args) {
        /* 표준 함수적 인터페이스(3) : Function */

        /* 1. Function<T, R>#apply(T t) : R : 객체 T를 R로 매핑한다. */
        Function<String, Integer> function = (str) -> Integer.parseInt(str); // String 객체를 Integer 타입으로 매핑
        String value = "12345";
        System.out.println(function.apply(value) + " : " + function.apply(value).getClass().getName());

        /* 2. BiFunction<T, U, R>#apply(T t, U u) : R : 객체 T랑 U를 R로 매핑한다. */
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "67890";
        System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());

        /* 3. IntFunction<R>#apply(int value) : R : int를 R로 매핑한다. */
        IntFunction<String> intFunction = intValue -> String.valueOf(intValue);
        int intValue = 123;
        System.out.println(intFunction.apply(intValue) + " : " + intFunction.apply(intValue).getClass().getName());
    }


}
