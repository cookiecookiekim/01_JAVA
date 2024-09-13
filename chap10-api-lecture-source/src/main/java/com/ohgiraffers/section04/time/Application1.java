package com.ohgiraffers.section04.time;

import java.time.*;

public class Application1 { // 24-09-13 (금) 1교시 - 시간(Time) 자주 씀!
                 // 추후 프로젝트 시 시간 관련해서 고려해야 함
    public static void main(String[] args) {

        /* title. time 패키지에서 제공하는 클래스들의 사용 문법 */
        /* comment. time 패키지는 JDK 1.8에서 추가
        *   Date , Calendar가 가지고 있는 한계점을
        *   극복하기 위해 나오게 되었다.
        *   LocalTime, LocalDate, LocalDateTime, ZonedDateTime
        *   등 대표적인 클래스가 있음. */

        LocalTime timeNow = LocalTime.now();
        // now는 누운 글씨체 → static → 인스턴스 생성 필요 x
        System.out.println("timeNow = " + timeNow); // 현 시간 출력

        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow); // 현 날짜 출력

        LocalDate dateOf = LocalDate.of(2024, 8, 15);
        System.out.println("dateOf = " + dateOf); // 지정한 날짜 출력

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        // 현재 날짜와 시간출력

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        //영국 시간 기준으로 시간, 날짜 출력

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(dateOf, timeNow, ZoneId.of("Asia/Tokyo"));
        System.out.println("zonedDateTime1 = " + zonedDateTime1);
        // ZoneId.of(:문자열로 원하는 지역 설정")

    }
}
