package com.chapter07_object_array.uses;

public class MemberRepository {
    private final static Member[] members;
    private static int count; // final이 붙으면 무조건 초기화를 해줘야하지만 여기서는 final이 붙어있지 않기 때문에 JVM 기본값으로 들어가 있다.

    /*
     static 초기화 블럭으로 초기화한 값은 배열의 길이이기 때문에 배열의 길이는 변경 불가능.
     하지만 배열의 요소들은 0으로 초기화 되어있음에도 final이 적용되는 영역은 배열의 길이 뿐이기 때문에
     인덱스로 접근해서 요소 하나하나를 바꾸는 것은 가능하다.
     */

    static {
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers) {

        for (int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }

        return true;
    }

    public static Member[] finAllMembers() {
        return members;
    }
}
