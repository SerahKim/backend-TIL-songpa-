package com.chapter12_collection.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /*
        stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현하였다.
        스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        후입선촐(LIFO-Last Input First Out) 방식의 자료 구조라 불린다.
        */

        Stack<Integer> integerStack = new Stack<>();

        // 값을 넣을 때는 push()
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        System.out.println("----------");

        // 요소를 찾을 때 search()
        System.out.println(integerStack.search(5)); // 1, 가장 최근에 들어간 값부터 찾기 시작. 1번째부터 시작한다. 인덱스 개념이 아님

        System.out.println("----------");

        // peek() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환
        System.out.println(integerStack.peek());
        System.out.println(integerStack);

        System.out.println("----------");

        // pop() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환 후 제거
        // EmptyStackException : 스택이 다 비어있는데 계속 값을 꺼내려고 했을 때 해당 에러 발생
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
//        System.out.println(integerStack.pop());

        System.out.println(integerStack);

    }
}
