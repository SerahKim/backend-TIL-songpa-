package com.team_problem.section_250508;

public class Novel extends Book{
    private String genre;

    // 기본 생성자
    public Novel() {}

    // genre를 포함한 생성자
    public Novel(int num, String name, String author, String publisher, String genre) {
        super(num, name, author, publisher);
        this.genre = genre;
    }

    // 소설 카테고리에 등록된 도서 정보 출력
    @Override
    public String bookInfo() {
        return  "카테고리 : " + CATEGORY_NOVEL + " / "+ super.bookInfo() + " / 장르 : " + this.genre;
    }

    // 소설 카테고리에 등록된 도서 개수 출력
    @Override
    public int bookCounts(Book[] books) {
        int count = 0;

        for (Book b : books) {
            if (b instanceof Novel) {  // Novel로 인스턴스 되어 있는 것만 카운트
                count++;
            }
        }

        return count;
    }
}
