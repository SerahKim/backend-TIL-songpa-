package com.practice;

public class Application {
    public static void main(String[] args) {
        // method problem1
        Calculator calc = new Calculator();

        calc.checkMethod();

        int sum = calc.sum1to10();
        System.out.println("1부터 10까지의 합 : " + sum);

        calc.checkMaxNumber(10, 20);

        int n1 = 10;
        int n2 = 20;
        int sum2 = calc.sumTwoNumber(n1, n2);
        System.out.println(n1 + "과 " + n2 + "의 합은 : " + sum2);

        int n3 = 10;
        int n4 = 5;
        int sub = calc.minusTwoNumber(n3, n4);
        System.out.println(n3 + "과 " + n4 + "의 차는 : " + sub);

        System.out.println("=============================================");

        // method problem2
        SimpleOperations simOp = new SimpleOperations();

        simOp.printMessage();

        int start = 1;
        int end = 10;
        int sum3 = simOp.sumNumbers(1, 10);
        System.out.println(start + "부터 " + end + "까지의 합은 : " + sum3);

        int num = 10;
        System.out.println(simOp.isEvenNumber(num) ? num + "은 짝수입니다." : num + "홀수입니다.");

        String input = "Hello World";
        char ch = 'o';
        System.out.println(input + "에서 " + ch + "의 개수는 : " + simOp.countCharacter(input, ch));

        System.out.println(input + "을 뒤집은 결과는 " + simOp.reversString(input));
    }
}
