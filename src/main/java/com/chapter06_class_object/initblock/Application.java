package com.chapter06_class_object.initblock;

public class Application {
    public static void main(String[] args) {
        /*
        초기화 블럭
        복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블러과 정적 초기화 블럭으로 구분된다.
        (1) 인스턴스 초기화 블럭
        - 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
        - 인스턴스를 호출하는 시점마다 호출이 된다.
        - 인스턴스 변수를 초기화하면 정적 필드에는 실행 시점마다 값을 덮어쓴다.
        {
            초기화 내용 작성
        }

        (2) 정적 초기화 블럭
        - 클래스가 로드 될 때 한 번 동작한다.
        - 정적 필드를 초기화하며, 인스턴스 변수는 초기화하지 못한다.
        static {
            초기화 내용 작성
        }

        초기화 블럭의 동작 순서
        JVM 기본값 -> 명시적 초기값 -> 정적 초기화 블럭 -> 인스턴스 초기화 블럭 -> 생성자
        */

        Product product = new Product();

        /* 1. 자료형별 기본값으로 초기화된 내용 확인 */
//        System.out.println(product.getInformation());

        /* 2. 명시적 초기화로 초기화된 내용 확인 */
//        System.out.println(product.getInformation());

        /* 3. 초기화 블럭으로 필드 초기화 확인 */
        /* 인스턴스 초기화 블럭이 명시적 초기화 블럭을 덮어씀 */
        /* 정적 초기화 블럭으로 초기화된 값이 인스턴스 초기화 블럭의 값으로 덮어씌어짐. */
//        System.out.println(product.getInformation());

        /* 4. 매개 변수 있는 생성자를 이용한 초기화 확인 */
        Product product2 = new Product("대륙폰", 3000000, "샤오미");
        System.out.println(product2.getInformation());
    }
}
