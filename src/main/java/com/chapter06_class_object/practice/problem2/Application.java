package com.chapter06_class_object.practice.problem2;

public class Application {
    public static void main(String[] args) {
        // 기본 생성자를 이용한 필드값 출력
        BookDTO book1 = new BookDTO();
        book1.printInformation();

        // 필드 3가지 초기화하는 생성자를 이용하여 필드값 출력
        BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        book2.printInformation();

        // 모든 필드를 초기화하는 생성자를 이용하여 필드값 출력
        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book3.printInformation();

    }
}
