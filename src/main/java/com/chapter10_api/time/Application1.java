package com.chapter10_api.time;

import java.time.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        java.time(time 패키지)
            ㄴ java.time.zone : 시간대에 관련된 기능 제공
                               LocalTime, LocalDate, LocalDateTime, ZoneDataTime 클래스들이 있다.
        */

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalTime timeOf = LocalTime.of(18, 30, 20); // 사용자 지정
        System.out.println(timeOf);

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        LocalDate dateOf = LocalDate.of(2023, 1, 26);
        System.out.println(dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println(dateTimeOf);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTimeOf);
    }
}
