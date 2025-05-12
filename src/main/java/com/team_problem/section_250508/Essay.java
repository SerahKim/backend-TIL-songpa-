package com.team_problem.section_250508;

public class Essay extends Book{
    private String  theme;

    // 기본 생성자
    public Essay() {}

    // isColor를 포함한 생성자
    public Essay(int num, String name, String author, String publisher, String theme) {
        super(num, name, author, publisher);
        this.theme = theme;
    }

    // 에세이 카테고리에 등록된 도서 정보 출력
    @Override
    public String bookInfo() {
        return  "카테고리 : " + CATEGORY_ESSAY + " / "+ super.bookInfo() + " / 주제 : " + this.theme;
    }

    // 에세이 카테고리에 등록된 도서 개수 출력
    @Override
    public int bookCounts(Book[] books) {
        int count = 0;

        for (Book b : books) {
            if (b instanceof Essay) {  //  Essay로 인스턴스 되어 있는 것만 카운트
                count++;
            }
        }

        return count;
    }






}
