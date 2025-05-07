package com.chapter06_class_object.parameter;

public class Application {
    public static void main(String[] args) {
        /*
        매개변수(parameter)로 사용 가능한 자료형
        1. 기본 자료형
        2. 기본 자료형 배열
        3. 클래스 자료형
        4. 클래스 자료형 배열
        5. 가변 인자
        */

        ParameterTest pt = new ParameterTest();

        /* 1. 기본 자료형을 매개변수로 전달 받는 메소드 호출 확인 */
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        /* 2. 기본 자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
        int[] iarr = new int[] {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr); // 얕은 복사

        System.out.print("변경 후 원본 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

        System.out.println();
        System.out.println();

        /* 3. 클래스 자료형 */
        RectAngle r1 = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        System.out.println("+++++ 변경 후 사각형의 넓이와 둘레 +++++");
        r1.calcArea();
        r1.calcRound();
        System.out.println();

        /* 4. 가변인자*/
//        pt.testVariableLengthArrrayParameter(); // 인자가 없는 경우 에러 발생
        pt.testVariableLengthArrrayParameter("홍길동"); // 이름만 있어도 가능
        pt.testVariableLengthArrrayParameter("유관순", "볼링");
        pt.testVariableLengthArrrayParameter("이순신", "볼링", "테니스", "당구");
        pt.testVariableLengthArrrayParameter("신사임당", new String[] {"테니스", "서예", "떡썰기"});
    }
}
