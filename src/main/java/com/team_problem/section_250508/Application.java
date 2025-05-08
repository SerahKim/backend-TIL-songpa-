package com.team_problem.section_250508;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* comment. 상속, 오버라이딩, 객체배열, final, static 사용하기 */
        /*
         * 설계
         * 1. Book 클래스(부모 클래스) 하위 카테고리 자식 클래스(소설, 만화, 에세이, 시)
         * 2. Book 클래스 필드 : 도서번호(final), 도서명, 저자, 출판사, 카테고리명(final static), 도서 수(static) / 메소드 : 도서 정보 출력
         * 3. 오버라이딩 메소드 : 도서 정보 출력, 카테고리별 도서 수 출력(static)
         * 4. 소설 클래스 필드 : 장르 / 메소드 : 장르 출력
         * 5. 만화 클래스 필드 : 컬러 / 메소드 : 흑밸/컬러 여부 문자열로 반환
         * 6. 에세이 클래스 필드 : 주제 / 메소드 : 에세이 주제 출력
         * 7. 시 필드 : 장르 / 메소드 : 장르 출력
         */

        Scanner sc = new Scanner(System.in);

        BookService bookManager = new BookService();

        while(true) {
            System.out.println("=======도서관 관리 시스템=======");
            System.out.println("1. 카테고리 전체");
            System.out.println("2. 소설 카테고리");
            System.out.println("3. 만화 카테고리");
            System.out.println("4. 에세이 카테고리");
            System.out.println("5. 시 카테고리");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int num1 = sc.nextInt();

            System.out.print("1. 등록된 도서 정보 조회 ");
            System.out.print("2. 등록된 도서 수 조회");
            int num2 = sc.nextInt();

            switch (num1) {
                case 1 : {
                    switch (num2) {
                        case 1 :
                            bookManager.registeredAllBooksInfo();
                            break;
                        case 2 :
                            bookManager.registeredAllBooksCount();
                    }
                } break;
                case 2 : {
                    switch (num2) {
                        case 1 :


                        case 2 :
                    }
                } break;
                case 3 : {
                    switch (num2) {
                        case 1 :
                            bookManager.registeredComicsInfo();
                            break;
                        case 2 :
                            bookManager.registeredComicsCount();
                            break;
                    }
                } break;
                case 4 : {
                    switch (num2) {
                        case 1 :


                        case 2 :
                    }
                } break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    break;


            }

        }

    }
}
