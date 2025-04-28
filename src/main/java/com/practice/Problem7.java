package com.practice;

public class Problem7 {
    public static void main(String[] args) {

    int month = 6;
    int day = 15;
    String present = "";

    if(month >= 1 && month <= 6) {
        if(day >= 1 && day <= 15) {
            present = "배민 쿠폰";
        }
    } else if(month >= 7 && month <= 12) {
        if(day >= 16 && day <= 31) {
            present = "스타벅스 커피";
        }
    } else {
        present = "사탕";
    }

        System.out.println("김시은의 선물은 " + present + "입니다.");
    }
}
