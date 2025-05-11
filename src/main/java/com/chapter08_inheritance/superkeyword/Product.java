package com.chapter08_inheritance.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출함...");
    }

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        super(); // 부모 클래스여도 사실은 super()가 숨겨져 있음. Object를 호출함.(모든 클래스는 Objcet를 기반으로 작성되기 때문)
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출함");
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public String getInformation() {
        return "Product [" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                ']';
    }
}
