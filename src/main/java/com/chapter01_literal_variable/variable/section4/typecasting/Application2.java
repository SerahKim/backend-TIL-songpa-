package com.chapter01_literal_variable.variable.section4.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /*
        강제 형변환 : 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        예) (바꿀자료형) 값;

        자동형변환의 규칙의 반대 상황에서 강제 형변환이 필요하다.
        1. 강제 형변환 규칙
            1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
            1-2. 실수를 정수로 변경 할 때
            1-3. 문자형을 int미만 크기의 변수에 저장할 때
            1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
        */

        // 1-1-1. 정수끼리의 강제 형변환
        long lnum = 8L;
//        int inum = lnum; // 데이터 손실 가능성을 컴파일러가 알려준다.
        int inum = (int) lnum; // 변경하려는 자료형을 명시하여 강제 형변환을 해야한다.

        short snum = (short) inum;
        byte bnum = (byte) snum;

        // 1-1-2. 실수끼리의 강제 형변환
        double dnum = 8.0;
//        float fnum = dnum;\
        float fnum = (float)dnum;
        System.out.println("fnum = " + fnum);

        // 1-2. 실수를 정수로 변경할 떄
        float fnum2 = 4.0f; // float : 4byte
//        long lnum2 = fnum2; // long : 8byte
        // 실수형을 정수형에 담을 경우 소수점 자리 이하 데이터 손실 가능성이 있어 강제 형변환을 해야된다.

        // 1-3. 문자형을 int 미만 크기의 변수에 저장할 때
        char ch = 'a';
        byte bnum2 = (byte) ch;
//        short snum2 = ch; // short와 char 모두 2byte의 크기를 가지지만 ch 타입은 부호 비트인 LSB비트까지 사용하기 때문에 실질적으로는 char이 short보다 더 크다.

        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2; // 음수도 강제 형변환하면 대입할 수 있다.

        // 1-4. 논리형 강제 형변환 규칙에서도 제외된다.

        boolean isTrue = true;
    }
}
