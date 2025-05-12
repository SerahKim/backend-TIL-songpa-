package com.chapter10_api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application2 {
    public static void main(String[] args) {
        /* time 패키지의 날짜 비교 연산 메소드 */
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2020, 11, 11);
        LocalDateTime future = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        ZonedDateTime present = ZonedDateTime.now();

        System.out.println(localDate.isAfter(past));
        System.out.println(localDateTime.isBefore(future));
        System.out.println(zonedDateTime.isEqual(present));
    }
}
