package com.practice;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int sincerity = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int service = sc.nextInt();
        System.out.print("미소 점수 : ");
        int smile = sc.nextInt();

        int avg = (sincerity + service + smile) / 3;

        if(avg >= 60) {
            if (sincerity >= 40 && service >= 40 && smile >= 40) {
                System.out.println("합격입니다!");
            }
            if(sincerity < 40){
                System.out.println("성실 점수 미달로 불합격입니다.");
            }
            if(service < 40){
                System.out.println("서비스 점수 미달로 불합격입니다.");
            }
            if(smile < 40){
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
        } else {
            System.out.println("평균점수 미달로 불합격입니다.");
            if(sincerity < 40){
                System.out.println("성실 점수 미달로 불합격입니다.");
            }
            if(service < 40){
                System.out.println("서비스 점수 미달로 불합격입니다.");
            }
            if(smile < 40){
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
        }
    }
}
