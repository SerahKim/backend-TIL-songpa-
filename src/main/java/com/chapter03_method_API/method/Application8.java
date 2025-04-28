package com.chapter03_method_API.method;

public class Application8 {
    public static void main(String[] args) {
        /*
        static 메소드를 호출하는 방법
        - 클래스명.메소드명();

        주의사항
        - static 메소드를 남발해서는 안된다!
        - static으로 선언한 명확한 이유가 있는 경우 사용할 수 있다.
         */

        Application8.sumTwoNumbers(10, 20);
        sumTwoNumbers(20, 30); // 동일한 클래스일 때 클래스명 생략 가능
    }
    public static int sumTwoNumbers (int first, int second) {
        return first + second;
    }
}
