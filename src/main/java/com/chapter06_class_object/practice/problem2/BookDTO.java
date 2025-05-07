package com.chapter06_class_object.practice.problem2;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    // 기본 생성자
    public BookDTO() {}

    // 매개변수 있는 생성자
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    // 매개변수 있는 생성자의 오버로딩
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this(title, publisher, author);
        this.price = price;
        this.discountRate = discountRate;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // getter
    public String getTitle() {
        return this.title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    // 필드값 출력용 메소드
    public void printInformation() {
        System.out.println(this.title + ", "+ this.publisher + ", "+ this.author + ", " + this.price  + ", "+ this.discountRate);
    }
}
