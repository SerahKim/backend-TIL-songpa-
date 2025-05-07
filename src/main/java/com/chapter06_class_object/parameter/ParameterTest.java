package com.chapter06_class_object.parameter;

public class ParameterTest {
    /* 1. 기본 자료형 매개변수 */
    public void testPrimaryTypeParameter(int num) {
        System.out.println("매개변수로 전달받은 값 : " + num);
        System.out.println();
    }

    /* 2. 배열 매개변수 */
    public void testPrimaryTypeArrayParameter (int[] iarr) {
        System.out.println("매개변수로 전달받은 값 : " + iarr);
        System.out.println();

        System.out.print("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i]);
        }

        System.out.println();

        iarr[0] = 99; // 배열 값 변경

        System.out.print("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

        System.out.println();
    }

    /* 3. 객체 매개변수 */
    // RectAngle의 객체인 rectAngle을 전달
    // rectAngle의 속성을 그대로 사용할 수 있다.
    // 또한, 변경된 속성값도 적용된다.
    public void testClassTypeParameter (RectAngle rectAngle) {
        System.out.println("매개 변수로 전달받은 값 : " + rectAngle);
        System.out.println();

        System.out.println("+++++ 변경 전 사각형의 넓이와 둘레 +++++");
        rectAngle.calcArea();
        rectAngle.calcRound();
        System.out.println();

        System.out.println("+++++ 변경 후 사각형의 넓이와 둘레 +++++");
        rectAngle.setWidth(100);
        rectAngle.setHeight(100);

        rectAngle.calcArea();
        rectAngle.calcRound();
        System.out.println();
    }

    // 가변 인자는 항상 매개변수의 맨 뒤 쪽에 선언되어야 한다. (몇 개가 올 지 모르기 때문에)
    public void testVariableLengthArrrayParameter (String name, String ...hobby) {
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }


}
