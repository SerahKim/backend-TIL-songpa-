package com.team_problem.section_250508;

public class Book {
    private int num;
    private String name;
    private String author;
    private String publisher;
    public final static String CATEGORY_NOVEL;
    public final static String CATEGORY_COMICS;
    public final static String CATEGORY_ESSAY;
    public final static String CATEGORY_POEM;

    static {
        CATEGORY_NOVEL = "소설";
        CATEGORY_COMICS = "만화";
        CATEGORY_ESSAY = "에세이";
        CATEGORY_POEM = "시";
    }

    public Book() {}

    public Book(int num, String name, String author, String publisher) {
        this.num = num;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    // 책 번호
    public int getNum() {
        return this.num;
    }

    // 책 이름
    public String getName() {
        return this.name;
    }

    // 도서 정보 출력 메소드
    public String bookInfo() {
        return "책 정보 : [" +
                "ID : " + num +
                ", 이름 : " + name +
                ", 저자 : " + author +
                ", 출판사 : " + publisher +
                ']';
    }

    public int bookCounts(Book[] books) {
        int count = 0;

        for (Book b : books) {
            count++;
        }
        return count;
    }


}
