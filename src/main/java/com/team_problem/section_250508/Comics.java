package com.team_problem.section_250508;

public class Comics extends Book{
    private String genre;

    public Comics() {}

    public Comics(int num, String name, String author, String publisher) {
        super(num, name, author, publisher);
    }

    public Comics(int num, String name, String author, String publisher, String genre) {
        super(num, name, author, publisher);
        this.genre = genre;
    }

    // 코믹스 카테고리에 속한 도서 정보 출력
    @Override
    public String bookInfo() {
        return  "카테고리 : " + CATEGORY_COMICS + super.bookInfo() + " / 장르 : " + this.genre;
    }

//    // 코믹스 카테고리에 속한 도서 수 출력
//    public int bookCounts (Comics[] comics) {
//        // 메소드 호출 시 countCategory 초기화
//        int countCategory = 0;
//
//        for (Comics comics1 : comics) {
//            countCategory++;
//        }
//
//        System.out.println(CATEGORY_COMICS+ "카테고리에 총 " + countCategory + "개의 책이 있습니다.");
//        return countCategory;
//    }




}
