package com.literal.section1.literal;

public class Application {
    public static void main(String[] args) {
       // 여러가지 값의 형태를 출력할 수 있다.

        // 1. 숫자 형태의 값 출력
        // 1-1. 정수 형태의 값 출력
        System.out.println(123);

        //1-2. 실수 형태의 값 출력
        System.out.println(1.23);

        // 2. 문자 형태의 값 출력
        // '' : 문자 출력
        // "" : 문자열 출력
        System.out.println('a'); // 문자 형태의 값을 싱글 쿼테이션으로 감싸주어야 한다.
//        System.out.println('ab'); // 두 개 이상의 문자는 문자로 취급하지 않고 문자열 취급한다.
//        System.out.println(''); // 빈 문자열도 싱글 쿼테이션으로 사용할 수 없다.
        System.out.println('1'); // 숫자 값이지만 싱글 쿼테이션으로 감싸져 있는 경우 문자 '1'이라고 판단한다.

        // 3. 문자열 형태의 값 출력
        System.out.println("안녕하세요"); // 문자열로 문자 여러 개가 나열된 형태를 말하며 쌍따옴표로 감싸주어야 한다.
        System.out.println("123"); // 정수이지만 더블 쿼테이션으로 감싸져있기 때문에 문자열로 보아야한다.
        System.out.println(""); // 빈 문자열은 더블 쿼테이션으로 사용 가능하다.
        System.out.println("a"); // 싱글 쿼테이션으로 감싼 문자는 문자열로 취급된다.

        // 4. 논리 형태의 값 출럭
        System.out.println(true);
        System.out.println(false);
    }
}
