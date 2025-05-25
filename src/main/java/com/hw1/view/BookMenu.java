package com.hw1.view;

import com.hw1.countroller.BookManager;
import com.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu() {
        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 정보 정렬 후 출력 : 정렬 방식을 선택해주세요. (1. 오름차순, 2. 내림차순)");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");

            System.out.print("번호를 입력하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    /* 1. 입력 받은 도서 추가 */
                    bm.addBook(inputBook());
                    break;
                case 2 :
                    /* 2. 도서 정보 정렬 후 출력 */
                    System.out.println("정렬 방식을 입력해주세요. (1. 오름차순, 2. 내림차순)");
                    int select = sc.nextInt();

                    // 도서 정렬
                    ArrayList<BookDTO> sortedBookList = bm.sortedBookList(select);
                    // 도서 출력
                    bm.printBookList(sortedBookList);
                    break;
                case 3 :
                    /* 3. 도서 삭제 */
                    // 해당 인덱스 찾기
                    System.out.println("삭제할 도서명을 입력해주세요.");
                    String title = sc.next();

                    int indexDelete = bm.searchBook(title);
                    if (indexDelete == -1) {
                        System.out.println("삭제할 도서가 존재하지 않습니다.");
                    } else {
                        bm.deleteBook(indexDelete);
                        System.out.println("성공적으로 삭제되었습니다.");
                    }

                    break;
                case 4 :
                    int indexSearch = bm.searchBook(inputBookTitle());
                    if (indexSearch == -1) {
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    } else {
                        bm.printBook(indexSearch);
                    }
                    break;
                case 5 :
                    if (bm.getBookList().isEmpty()) {
                        System.out.println("출력할 도서가 없습니다.");
                    } else {
                        bm.displayAll();
                    }
                    break;
                case 6 :
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
                    break;

            }
        }
    }

    public BookDTO inputBook() {
        System.out.println("도서명을 입력해주세요.");
        String title = sc.next();

        System.out.println("카테고리 번호를 입력해주세요. (1. 인문, 2. 자연과학, 3. 의료, 4. 기타)");
        int category = sc.nextInt();

        System.out.println("작가명을 입력해주세요.");
        String author = sc.next();

        System.out.println("등록이 완료되었습니다.");
        return new BookDTO(title, category, author);
    }

    public String inputBookTitle() {
        System.out.println("조회할 도서명을 입력해주세요.");
        String title = sc.next();

        return title;
    }
}
