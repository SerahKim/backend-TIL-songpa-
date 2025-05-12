package com.team_problem.section_250508;

public class Comics extends Book{
    private boolean isColor;

    // 기본 생성자
    public Comics() {}

    // isColor를 포함한 생성자
    public Comics(int num, String name, String author, String publisher, boolean isColor) {
        super(num, name, author, publisher);
        this.isColor = isColor;
    }

    // 코믹스 카테고리에 등록된 도서 정보 출력
    @Override
    public String bookInfo() {
        return  "카테고리 : " + CATEGORY_COMICS + " / "+ super.bookInfo() + " / 색칠 : " + (this.isColor? "컬러" : "흑백");
    }

    // 코믹스 카테고리에 등록된 도서 개수 출력
    @Override
    public int bookCounts(Book[] books) {
        int count = 0;

        for (Book b : books) {
            if (b instanceof Comics) {  // Comics 인스턴스 되어 있는 것만 카운트
                count++;
            }
        }

        return count;
    }






}
