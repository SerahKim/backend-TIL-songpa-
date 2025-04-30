package com.chapter05_array.array;

public class Application3 {
    public static void main(String[] args) {
        /*
        값의 형태 별 기본값
        - 정수 : 0
        - 실수 : 0.0
        - 논리 : false
        - 문자 : /u0000
        - 참조 : null
        */

        /*
        배열의 접근
        - 배열의 주소가 담겨있는 참조 변수(iarr : stack에 할당되어 있다.)에 접근할 시 주소값이 나오게 되고
        - 배열 요소에 접근할 시 그 값이 나오게 된다. (힙에 할당되어 있다.)
        */

        int[] iarr = new int[5];

        // int형이기 때문에 전부 0으로 초기화되어 있음.
        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }

        /*
        자바에서 지정한 기본값 이외의 값으로 초기화를 하고 싶은 경우 블럭을 이용한다.
        블럭을 사용하는 경우 new를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기가 설정된다.
        */
        int[] iarr2 = {11, 22, 33, 44, 55};
        int[] iarr3 = new int[] {11, 22, 33, 44, 55};
        System.out.print("iarr2 = " + iarr2.length);
        System.out.print("iarr3 = " + iarr3.length);

        // 초기화 값 확인
        for(int i = 0; i < iarr2.length; i++) {
            System.out.print(iarr2[i]);
        }

        String[] sarr = {"apple", "banana", "grape", "orange"};
        for(int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i]);
        }

    }
}
