package com.chapter12_collection.list.dto;

public class BookDTO {
    private int number;
    private String title;
    private String autor;
    private int price;

    public BookDTO() {}

    public BookDTO(int number, String title, String autor, int price) {
        this.number = number;
        this.title = title;
        this.autor = autor;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", price=" + price +
                '}';
    }
}
