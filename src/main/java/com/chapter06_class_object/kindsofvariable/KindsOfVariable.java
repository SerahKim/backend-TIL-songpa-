package com.chapter06_class_object.kindsofvariable;

public class KindsOfVariable { // 클래스 영역의 시작

    /*
    클래스 영역에 작성하는 변수를 필드라고 한다.
    필드 == 멤버 변수(클래스가 가지는 멤버라는 의미) == 객체 변수 == 속성 == 전역 변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
    */

    /*
    non-static field를 인스턴스 변수라고 한다.
    (인스턴스 생성 시점에 사용 가능한 변수라는 의미)
    */
    private int globalNum;

    /*
    static field를 정적필드(클래스 변수)라고 한다.
    (정적(클래스) 영역에 생성되는 변수라는 의미, 프로그램 시작 시점에 사용 가능한 변수라는 의미)
    */
    private static int staticNum;

    /*
    메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
    매개변수도 일종의 지역변수로 생각하면 된다.
    지역 변수와 매개변수 모두 호출 시 stack을 할당받아 stack에 생성된다.
    */
    public void testMethod (int num) { // 메소드 영역의 시작

        /* 메소드 영역 안에 작성하는 변수를 지역 변수라고 한다.*/
        int localNum;

        System.out.println(num);

//        System.out.println(localNum); // 지역 변수는 사용 전에 반드시 초기화되어야지만 사용 가능하다.
        System.out.println(globalNum); // 전역변수이기 때문에 메소드 안에서 사용 가능하다.
        System.out.println(staticNum); // 전역변수이기 때문에 메소드 안에서 사용 가능하다.
    }

    public void testMethod() {
//        System.out.println(localNum); // 다른 메소드에서 선언한 지역 변수는 사용 불가능하다.
        System.out.println(globalNum);
        System.out.println(staticNum);
    }


}
