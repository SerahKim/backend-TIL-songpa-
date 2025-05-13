package com.chapter12_collection.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        collection 프레임 워크
        데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스이다.
        */

        /*
        Collection Framework는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해 놓은 것
        1. List 인터페이스
        - 순서가 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
        - vector, ArrayList, LinkedList, Stack, Queue 등이 있다.

        2. Set 인터페이스
        - 순서가 없는 데이터 집합으로 데이터의 중복을 허용하지 않는다.
        - HashSet, TreeSet 등이 있다.

        3. Map 인터페이스
        - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
        - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
        - 단, value는 중복된 값으로 저장할 수 있다.
        - HashMap, TreeMap, HashTable, Properties 등이 있다.
        */

        /*
        - ArrayList
        가장 많이 사용되는 컬렉션 클래스이다.
        내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.

        ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
        배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
        ArrayList는 저러한 배열의 단점을 보완하고자 크기 변경, 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
        자동적으로 수행되는 것이지 속도가 빨라지는 것이 아니다.
        */

        ArrayList alist = new ArrayList<>(); // 내부적으로 10칸짜리의 배열이 생성된 것, alist는 객체를 담는 배열이다.
        List list = new ArrayList<>(); // List를 구현한 것이므로 다형성으로 생성할 수도 있다.
        Collection col = new ArrayList<>(); // 더 상위 클래스인 Collection을 통해서도 만들 수 있다.

        // 모두 박싱처리가 된 객체
        // 넣어준 순서대로 값이 들어간다.
        alist.add("apple"); // 리스트의 추가
        alist.add(123);
        alist.add(45.32);
        alist.add(new Date());

        System.out.println(alist); // toString 메소드가 오버라이딩 되어있기 때문에 간편하게 볼 수 있다.
        System.out.println(alist.size()); // list의 크기
        for(int i = 0; i < alist.size(); i++) {
            System.out.println(i + " : " + alist.get(i)); // 리스트의 요소
        }

        alist.add("apple"); // 값의 중복 저장 가능, 인덱스가 다른 위치에 값이 저장되고 있기 때문에 중복 저장이 가능하다.
        System.out.println(alist);

        alist.add(1, "banana"); // 1번째 인덱스에 banana 추가
        System.out.println(alist);

        alist.remove(2); // 2번째 인덱스의 값 제거
        System.out.println(alist);

        alist.set(1, Boolean.valueOf(true)); // 1번째 인덱스의 값을 true(Boolean 타입)으로 수정
        System.out.println(alist);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
//        stringList.add(123); // 타입을 지정해 놓으면 올바르지 않은 타입의 값을 넣었을 시 컴파일 에러 발생
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println(stringList);

        // Collections는 메소드를 구현해놓은 클래스
        Collections.sort(stringList); // 오름차순 정렬
        System.out.println(stringList);

        stringList = new LinkedList<>(stringList);

        /*
        Iterator 반복자 인터페이스를 활용해서 역순으로 정렬한다.
        LinkedList 타입으로 형변환 후 descendingIterator() 메소드를 사용하면
        내림차순 정렬된 Iterator 타입의 목록으로 반환을 해준다.

        Iterator란?
        Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
        반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        인덱스로 관리되는 컬렉션이 아닌 경우네느 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        - hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false 반환
        - next() : 다음 요소를 반환
        */

        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

        // Iterator 반복자는 값을 한 번 꺼내면 다시 값을 꺼낼 때 빈 배열이 나옴
//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println(descList);
    }
}
