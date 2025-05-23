package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
    private int bNo = (int)(Math.random() * 100);
    private String title;
    private int category;
    private String author;

    public BookDTO() {}

    public BookDTO(String title, int category,  String author) {
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String categoryName = "";
        if (category == 1) {
            categoryName = "인문";
        } else if (category == 2) {
            categoryName = "자연과학";
        } else if (category == 3) {
            categoryName = "의료";
        } else {
            categoryName = "기타";
        }

        return  "책 번호 : " + bNo +
                ", 카테고리 : " + categoryName +
                ", 도서명 : " + title +
                ", 작가명 : " + author;
    }
}
