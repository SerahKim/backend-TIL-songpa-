package com.chapter10_api.string;

public class Application2 {
    public static void main(String[] args) {
        /*
        문자열 객체를 만드는 방법
        - 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
        - new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        /* str1과 str2는 리터럴로 선언되어 동일 객체로 인식된다. */
        System.out.println(str1 == str2); // true
        /* str3는 새롭게 생성된 인스턴스이므로 다른 객체로 인식 */
        System.out.println(str2 == str3); // false
        /* str4 또한 새롭게 생성된 인스턴스이므로 다른 객체로 인식 */
        System.out.println(str3 == str4); // false

        /* 동일한 문자열은 동일한 hashCode 값을 반환하도록 재정의 되어있다.*/
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        /* 문자열은 불변이라는 특징을 가진다. */
        str2 += "oracle";
        // str2는 수정을 한 것이 아니라 새롭게 할당을 한 것, 문자열은 변하지 않기 때문
        System.out.println(str1 == str2); // false

        /*
        equals : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌
                 문자열 값을 비교하여 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록
                 Object의 equals() 메소드를 재정의 해두었다.
                 따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지를 비교하기 위해 == 연산 대신
                 equals() 메소드를 사용해야 한다.
        */
        System.out.println(str1.equals(str3)); // true, 값만 보기 때문에
        System.out.println(str1.equals(str4)); // true
    }
}
