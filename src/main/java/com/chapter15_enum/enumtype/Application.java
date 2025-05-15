package com.chapter15_enum.enumtype;

import com.chapter15_enum.enumtype.Subjects;

public class Application {
    public static void main(String[] args) {
        /* 열거형(enum) */
        /* 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 한 개임을 보장한다. */
        Subjects subjects1 = Subjects.JAVA;
        Subjects subjects2 = Subjects.HTML;

        if(subjects1 == subjects2) {
            System.out.println("두 과목은 같은 과목입니다.");
        } else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        /* 단일 인스터임을 보장하기에 == 비교가 가능하다.*/
        System.out.println(subjects1 == Subjects.JAVA); // true

        /* 2. 이름 충돌 방지를 위해 접두사를 쓰지 않아도 Enum 타입 별로 네임스페이스를 가진다. */
        /*
        동일한 이름의 상수가 필요한 경우 네임스페이스를 다르게 한다.
        public enum Backend { JAVA, ORACLE, JDBC, JAVASCRIPT };
        public enum Frontend { HTML, CSS, JAVASCRIPT };
        */

        /* 3. toString()을 이용하여 문자열로 변경하기 쉽다. */
        System.out.println(Subjects.JAVA.toString());

        /* 4. values()를 이용하여 상수값 배열을 반환하고 이를 이용해 연속처리 할 수 있다. */
        Subjects[] subjects =  Subjects.values();
        for (Subjects s : subjects) {{
            System.out.println(s);
        }}

        /* 5. 타입 안정성을 보장한다. */
        printSubject(Subjects.HTML);
//        printSubject(2); // Enumtype은 인스턴스이기 때문에 정수를 사용하는 경우 타입불일치로 컴파일 에러 발생
    }

    public static void printSubject(Subjects subjects) {
        System.out.println(subjects.toString());
    }
}
