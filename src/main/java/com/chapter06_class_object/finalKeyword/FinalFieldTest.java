package com.chapter06_class_object.finalKeyword;

public class FinalFieldTest {
    /*
    final
    - final은 종단의 의미를 가지는 키워드이다.
    - final 키워들 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만, 결국 변경 불가의 의미이다.
        (1) 지역변수 : 초기화 이후 값 변경 불가
        (2) 매개변수 : 호출 시 전달한 인자 변경 불가
        (3) 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
        (4) 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
        (5) non-static 메소드 : 메소드 재작성(overriding) 불가
        (6) static 메소드 : 메소드 재작성(overriding) 불가
        (7) 클래스 : 상속 불가
    */

    /* 1. non-static field에 final 사용 */
    /*
    final은 변경 불가의 의미를 가진다.
    따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    그 초기화 이후 값을 변경할 수 없기 때문에 아래 방식은 사용할 수 없고 선언하면서 바로 초기화를 해주어야 한다.
    */
//    private final int nonStaticNum;

    // 해결 방법
    /* 1-1. 선언과 동시에 초기화 한다. */
    private final int NON_STATIC_NUM = 1;

    /* 1-2. 생성자를 이용해서 초기화 한다. */
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    /* 2. static field에서 final 사용*/
    /*
    static도 자바에서 지정한 기본값이 초기에 대입되기 때문에
    final 키워드 사용 시 초기화를 하지 않으면 에러가 발생한다.
    */
//    private static final int STATIC_NUM; // 0으로 초기화 후 변경 불가

    // 생성자를 이용해서 초기화되지 않는 이유
    /*
    생성자는 인스턴스가 생성되는 시점에 호출이 되기 때문에 그 전에는 초기화가 일어나지 못한다.
    하지만, static은 프로그램이 start될 때 초기화되어있기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
    기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
    즉, 호출되는 시점이 다르기 때문에 생성자로 초기화 못함

    1. static 변수는 클래스 로딩 시 초기화 (프로그램 시작 시점)
    2. 생성자는 객체 생성 시에만 호출 (클래스 로딩 이후)
    3. final 변수는 딱 한 번만 초기화 가능
    4. 따라서 클래스가 로드될 때 STATIC_DOUBLE은 이미 기본값(0.0)으로 초기화되지만, final이므로 더 이상 값을 변경할 수 없게됨.
    5. 그래서 생성자에서 초기화하려고 하면 이미 늦었기 때문에 컴파일 오류가 발생

    이런 제약이 있는 이유
    - 예측 가능성:
    static final 변수는 상수이므로, 프로그램 전체에서 값이 일정해야 함.
    생성자에서 초기화할 수 있다면, 인스턴스마다 다른 값이 할당될 수 있어 "상수"의 개념에 맞지 않게됨.
    - 클래스 로딩 순서:
    클래스 변수가 프로그램 시작 시, 클래스가 로드될 때 초기화되기 때문에, 인스턴스 생성 후에 변수를 초기화하는 것은 논리적으로 맞지 않음.
    */
    private static final double STATIC_DOUBLE;

    /* 생성자로 초기화 */
//    public FinalFieldTest(double staticDouble) {
//        FinalFieldTest.STATIC_DOUBLE = staticDouble;
//    }

    // 해결 방법
    /* 1-1. 선언과 동시에 초기화 한다. */
    private static final int STATIC_NUM = 1;

    /* 1-2. 초기화 블럭 */
    static {
        STATIC_DOUBLE = 0.5;
    }
}
