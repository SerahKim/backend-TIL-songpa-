package com.chapter15_enum.intenum;

public class Application {
    public static void main(String[] args) {
        /* 정수 열거 패턴 */

        /* 1. 정수값만을 저장하고 있는 필드일 뿐이다. */
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }

        /* 2. 이름 충돌 방지를 위해 접두어를 써서 구분해야 한다. */
//        BACKEDN_JAVASCRIPT = 0;
//        FRONTEND_JAVASCRIPT = 0;

        /* 3. 문자열로 출력하기 까다롭다. */
        int num = 0;
        String subjectText = "";

        switch (num) {
            case Subjects.JAVA :
                subjectText = "JAVA";
                break;
            case Subjects.ORACLE:
                subjectText = "ORACLE";
                break;
            case Subjects.JDBC:
                subjectText = "JDBC";
                break;
        }

        System.out.println("subjectText = " + subjectText);

        /* 4. 같은 그룹에 속한 상수들을 순회할 수 없다. (전체 상수의 갯수 확인 불가능) */

        /* 5. 타입 안전을 보장할 수 없다. */
        printSubject(Subjects.ORACLE);
        printSubject(2); // 아무 숫자나 넣어도 에러가 발생하지 않는다.

    }

    public static void printSubject(int subjectNumber) {
        String subject = "";

        switch (subjectNumber) {
            case Subjects.JAVA :
                subject = "JAVA";
                break;
            case Subjects.ORACLE:
                subject = "ORACLE";
                break;
            case Subjects.JDBC:
                subject = "JDBC";
                break;
        }
    }
}
