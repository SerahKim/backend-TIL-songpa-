package com.chapter06_class_object.statickeyword;

public class Application {
    public static void main(String[] args) {
        /*
        static
        - 정적 메모리 영역에 프로그램이 start 될 때 할당하는 키워드이다.
        - 인스턴스를 생성하지 않고도 사용할 글래스의 멤버(필드, 메소드)에 지정할 수 있다.
        - 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
        - 하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다.
        - 명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하자.
        - 의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때이다.
        */

        /* 1. static 키워드를 필드에서 사용 */
        StaticFieldTest sft1 = new StaticFieldTest();

        System.out.println(sft1.getNonStaticCount());
        System.out.println(sft1.getStaticCount());

        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println(sft1.getNonStaticCount());
        System.out.println(sft1.getStaticCount());

        // 새로운 인스턴스 생성
        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println(sft2.getNonStaticCount()); // 0으로 다시 초기화
        System.out.println(sft2.getStaticCount()); // 1로 값 유지

        /*
        인스턴스 변수의 경우에는 sft1, sft2 두 개의 인스턴스가 서로 값을 공유하지 못하고
        인스턴스를 생성할 때마다 0으로 초기화 되었다.
        하지만 static 필드의 경우에는 클래스 변수 자체가 프로그램을 종료할 떄까지 유지되고 있기 때문에
        값은 유지하고 있다. (유지 보수가 어려워짐)
        따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static을 사용한다.
        */

        /* 2. static 키워드를 메소드에서 사용하기 */
        /* 2-1. non-static 메소드 호출*/
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        /* static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
        * static 메소드를 호출하는 방식으로 호출해야 한다.*/
//        smt.nonStaticMethod(); // 호출 가능하나 권장하지 않음.

        /* 2-2. static 메소드 호출 */
        StaticMethodTest.staticMethod(); // 권장하는 방식
    }
}
