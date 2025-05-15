package com.chapter15_enum.grammar;

import com.chapter06_class_object.constructor.User;

public class Application {
    public static void main(String[] args) {
        /*
        클래스가 로딩 시 자동으로 JVM이 enum을 메모리에 올려주고 인스턴스가 생성되므로
        new 키워드를 통해 별도로 인스턴스를 생성하지 않아도 된다.
        */
//        UserRole userRole = new UserRole(); // 이런식으로 쓸 수 없다.
        UserRole admin = UserRole.ADMIN;

        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER; // 최초로 불렀을 때 생성자가 호출됨.
        // ordinal() : 몇번째 인덱스인지 출력하는 메소드
        System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());

        UserRole2 consumer2 = UserRole2.CONSUMER; // 이미 한번 인스턴스를 만들어놓으면 다시 호출한다고 해도 호출되지 않는다.

    }
}
