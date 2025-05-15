package com.chapter16_lambda.fuctionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {
        /* 표준 함수적 인터페이스(4) : Operator(값을 가공하고 싶을 때 주로 사용) */

        /* 1. BinaryOperator<T>#apply(T t1, T t2) : T : T와 T를 연산하여 T를 리턴한다. */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello", "world"));

        /* 2. UnaryOperator<T>#apply(T t) : T : T를 연산하여 T를 리턴한다. */
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hell"));

    }
}
