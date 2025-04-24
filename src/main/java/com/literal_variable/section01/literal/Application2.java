package com.literal_variable.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        /*
        값을 직접 연산하여 출력할 수 있다.
        이 때 값 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.
        */

        // 1. 숫자와 숫자의 연산
        // 1-1. 정수와 정수의 연산
        System.out.println("========= 정수와 정수의 연산 =========");
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(123 / 456);
        System.out.println(123 % 456); // 나머지를 구하는 연산

        // 1-2. 실수와 실수의 연산
        System.out.println("========= 실수와 실수의 연산 =========");
        System.out.println( 1.23 + 1.23);
        System.out.println( 1.23 - 0.3);
        System.out.println( 1.23 * 1.23);
        System.out.println( 1.23 / 0.1);
        System.out.println( 1.23 % 1.2); // 약간의 오차가 생긴다.

        // 1-3. 정수와 실수의 연산
        // 결과는 항상 실수가 나온다.
        System.out.println("========= 정수와 실수의 연산 =========");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 2. 문자의 연산
        // 2-1. 문자와 문자의 연산
        System.out.println("========= 정수와 실수의 연산 =========");
        System.out.println('a' + 'b'); // 아스키 코드로 인식하여 계산(a = 97, b = 98)
        System.out.println('a' - 'b'); // 아스키 코드로 인식하여 계산(a = 97, b = 98)
        System.out.println('a' * 'b'); // 아스키 코드로 인식하여 계산(a = 97, b = 98)
        System.out.println('a' / 'b'); // 아스키 코드로 인식하여 계산(a = 97, b = 98)
        System.out.println('a' % 'b'); // 아스키 코드로 인식하여 계산(a = 97, b = 98)

        // 2-2. 문자와 정수의 연산
        System.out.println("========= 문자와 정수의 연산 =========");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        // 2-3. 문자와 실수의 연산
        System.out.println("========= 문자와 실수의 연산 =========");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 1.0);
        System.out.println('a' / 1.0);
        System.out.println('a' % 1.0);

        // 3. 문자열의 연산
        // 3-1. 문자열과 문자열의 연산
        // 문자열과 문자열의 '+' 연산자를 사용하면 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("========= 문자열와 문자열의 연산 =========");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        // 3-2. 문자열과 다른 형태의 값 연산
        // 문자열과의 연산은 '+' 연산자 이외는 쓸 수 없다.
        // 3-2-1. 문자열과 정수의 연산
        System.out.println("hello world" + 123);
        // 3-2-1. 문자열과 실수의 연산
        System.out.println("hello world" + 1.23);
        // 3-2-1. 문자열과 문자의 연산
        System.out.println("hello world" + 'a');
        // 3-2-1. 문자열과 논리의 연산
        System.out.println("hello world" + true);

        System.out.println("123" + "456");

        // 4. 논리값 연산
        // 모든 연산자를 사용해도 연산되지 않는다.
        // 문자열과의 연산 이외의는 모두 에러가 발생된다.
        // 4-1. 논리값과 논리값 연산
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);
        // 4-2. 논리값과 정수 연산
//        System.out.println(true + 1);
        // 4-3. 논리값과 실수 연산
//        System.out.println(true + 1.23);
        // 4-4. 논리값과 문자 연산
//        System.out.println((true + 'a'));
        // 4-5. 논리값과 문자열 연산
        System.out.println(true + "a"); // 문자열 이어붙이기로 인식하여 연산이 된다.
//        System.out.println(true - "a"); // '+' 연산자 이외에는 연산되지 않는다.
//        System.out.println(true * "a"); // '+' 연산자 이외에는 연산되지 않는다.
//        System.out.println(true / "a"); // '+' 연산자 이외에는 연산되지 않는다.
//        System.out.println(true % "a"); // '+' 연산자 이외에는 연산되지 않는다.
    }
}

