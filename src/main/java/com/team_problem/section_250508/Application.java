package com.team_problem.section_250508;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* comment. 상속, 오버라이딩, 객체배열, final, static 사용하기 */
        /*
         * 설계
         * 1. Book 클래스(부모 클래스) 하위 카테고리 자식 클래스(소설, 만화, 에세이, 시)
         * 2. Book 클래스 필드 : 도서번호(final), 도서명, 저자, 출판사, 카테고리명(final static), 도서 수(static) / 메소드 : 도서 정보 출력
         *                     (번호 : 100 ~ 199 -> 소설, 200 ~ 299 : 만화, 300 ~ 399 : 에세이, 400 ~ 499 : 시)
         * 3. 오버라이딩 메소드 : 도서 정보 출력, 카테고리별 도서 수 출력(static)
         * 4. 소설 클래스 필드 : 장르 / 메소드 : 장르 출력
         * 5. 만화 클래스 필드 : 컬러 / 메소드 : 흑밸/컬러 여부 문자열로 반환
         * 6. 에세이 클래스 필드 : 주제 / 메소드 : 에세이 주제 출력
         * 7. 시 필드 : 장르 / 메소드 : 장르 출력
         */

        Scanner sc = new Scanner(System.in);

        BookService bookManager = new BookService();

        while (true) {
            System.out.println("=======도서관 관리 시스템=======");
            System.out.println("1. 카테고리 전체");
            System.out.println("2. 소설 카테고리");
            System.out.println("3. 만화 카테고리");
            System.out.println("4. 에세이 카테고리");
            System.out.println("5. 시 카테고리");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int num1 = sc.nextInt();

            // 종료 조건 먼저 체크
            if (num1 == 9) {
                System.out.println("프로그램을 종료합니다.");
                break; // while 루프 종료
            }

            // 9가 아닌 경우에만 두 번째 메뉴 입력 받음
            System.out.println("1. 등록된 도서 정보 조회");
            System.out.println("2. 등록된 도서 수 조회");
            System.out.print("메뉴 선택 : ");
            int num2 = sc.nextInt();

            switch (num1) {
                case 1:
                    if (num2 == 1) bookManager.registeredAllBooksInfo();
                    else if (num2 == 2) bookManager.registeredAllBooksCounts();
                    break;
                case 2:
                    if (num2 == 1) bookManager.registeredNovelBooksInfo();
                    else if (num2 == 2) bookManager.registeredNovelBooksCounts();
                    break;
                case 3:
                    if (num2 == 1) bookManager.registeredComicsBooksInfo();
                    else if (num2 == 2) bookManager.registeredComicsBooksCounts();
                    break;
                case 4:
                    if (num2 == 1) bookManager.registeredEssayBooksInfo();
                    else if (num2 == 2) bookManager.registeredEssayBooksCounts();
                    break;
                case 5:
//                    if (num2 == 1) bookManager.registeredPoemBooksInfo();
//                    else if (num2 == 2) bookManager.registeredPoemBooksCounts();
//                    break;
                default:
                    System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
            }
        }
    }
}

