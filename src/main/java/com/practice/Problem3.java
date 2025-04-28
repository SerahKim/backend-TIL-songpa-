package com.practice;

public class Problem3 {
    public static void main(String[] args) {
        double ko = 80.5;
        double math = 50.6;
        double eng = 70.8;

        int totalScore = (int)(ko + math + eng);
        int avg = totalScore / 3;

        System.out.println("총점 : " + totalScore);
        System.out.println("평균 : " + avg);
    }



}
