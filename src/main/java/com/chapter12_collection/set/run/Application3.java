package com.chapter12_collection.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*
        TreeSet 클래스
        데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
        이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
        Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
        */

        TreeSet<String> test = new TreeSet<>();

//        Set<String> test2 = new TreeSet<>();

        test.add("java");
        test.add("oracle");
        test.add("jdbc");
        test.add("html");
        test.add("css");

        System.out.println(test);

        // Iterator 키워드 이용
        Iterator<String> iter = test.iterator();

        while (iter.hasNext()) {
            System.out.println(((String) iter.next()).toUpperCase());
        }

        // 배열 특성 이용
        Object[] arr = test.toArray();

        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}
