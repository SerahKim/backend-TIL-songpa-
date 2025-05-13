package com.chapter12_collection.set.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        Set 자료구조
        Set 인터페이스를 구현한 Set 클래스의 특징
        1. 요소의 저장 순서를 유지하지 않는다.
        2. 같은 요소의 중복 저장을 허용하지 않는다. (null 값도 중복하지 않게 하나의 null만 저장한다.)

        HashSet 클래스
        Set 컬랙션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        */

        HashSet<String> hashSet = new HashSet<>();

        // HashSet의 인스턴스를 생성할 수 있는 방법
//        Set hset2 = new HashSet();
//        Collection hset3 = new HashSet<>();

        // 순서 무작위
        hashSet.add("java");
        hashSet.add("oracle");
        hashSet.add("jdbc");
        hashSet.add("html");
        hashSet.add("css");

        System.out.println(hashSet);

        // 중복 저장이 되지 않음
        System.out.println("java");
        System.out.println(hashSet);

        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("oracle"));

        // 저장된 객체를 하나씩 꺼내는 기능이 없다.
        // 따라서 반복문을 이용해서 연속처리하는 방법 2가지가 있다.
        /* 1. toArray() 배열로 바꾸고 반복문 사용 */
       Object[] arr =  hashSet.toArray();
       for (int i = 0; i < arr.length; i++) {
           System.out.println(i + " : " + arr[i]);
       }

        /* 2. iterator()로 목록 만들어 연속 처리*/
        Iterator<String> iter = hashSet.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        hashSet.clear();
        System.out.println(hashSet.isEmpty()); // true
    }
}
