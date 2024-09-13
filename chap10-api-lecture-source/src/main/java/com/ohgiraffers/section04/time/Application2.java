package com.ohgiraffers.section04.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application2 { // 24-09-13 (금) 1교시 - 시간(time)

    public static void main(String[] args) { // 다 외울 필요 없이, 흐름만 알자.

        /* title. time 패키지의 포매팅(수정)을 적용해서 출력할 수 있다. */

        String timeNow = "10:17:10";
        String dateNow = "2024-09-13";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        System.out.println("localTime = " + localTime); // 10:17:10
        System.out.println("localDate = " + localDate); // 2024-09-13

        String timeNow2 = "10-17-10";
        String dateNow2 = "240913"; // 원래는 20240913 이었지만, 타입이 맞지 않아, 오류

        LocalTime localTime1 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        // 10:17:10출력, 너 파일에 맞게 번역해줘~ (원래는 - 가 아니라 : 이 맞다.)
        System.out.println("localTime1 = " + localTime1); // 10:17:10
        LocalDate localDate1 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println("localDate1 = " + localDate1); // 2024-09-13
    }
}
