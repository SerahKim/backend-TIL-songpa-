package com.chapter16_lambda.fuctionalinterface;

import java.util.Objects;
import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {
        /* 표준 함수적 인터페이스(5) : Predicate(조건 검증할 떄 많이 사용) */

        /* 1. Predicate<T>#test(T t) : boolean : T를 조사하여 boolean을 리턴한다. */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test(123));
        System.out.println("문자열인지 확인 : " + predicate.test("123"));
    }
}
