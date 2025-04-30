package com.chapter05_array.copy;

public class Application1 {
    public static void main(String[] args) {
        /*
        배열의 복사
        1. 얕은 복사 : stack의 주소값만 복사
        - stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
        - 따라서 복사된 변수와 원본 변수는 동일한 배열의 주소값을 가지고 있다.
        - 하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)하게 된다면
           다른 레퍼런스 변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다.
        2. 깊은 복사 : heap의 배열에 지정된 값 복사
        */

        int[] originArr = {1, 2, 3, 4, 5};

        /* 얕은 복사 */
        int[] copyArr = originArr;

        // 주소값이 같기 때문에 같은 배열이다.
        System.out.println(originArr.hashCode()); // 2060468723
        System.out.println(copyArr.hashCode()); // 2060468723

        // 값도 동일하게 가지고 있다. (같은 배열이기 때문에)
        for(int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " "); // 1 2 3 4 5
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " "); // 1 2 3 4 5
        }
        System.out.println();

        // 값 변경을 했어도 원본과 복사 배열의 값은 동일하다.
        copyArr[0] = 99;

        for(int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " "); // 99 2 3 4 5
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " "); // 99 2 3 4 5
        }
        System.out.println();

    }
}
