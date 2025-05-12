package com.chapter10_api.wrapper;

import com.team_problem.section_250508.Book;

public class Application2 {
    public static void main(String[] args) {
        /*
        문자열 parsing
        문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다.
        */

        byte b = Byte.parseByte("1"); // String 값을 byte로 변환
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
    //    long l = Long.parseLong("8L"); // 문자열로 인식하기 때문에 8L로는 사용 불가 (컴파일 에러는 안남)
        long l = Long.parseLong("8");
        float f = Float.parseFloat("4.0f"); // 4.0f는 된다.
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");

        // character는 parsing 기능을 제공하지 않는다.
        char c = "abc".charAt(0);
    }
}
