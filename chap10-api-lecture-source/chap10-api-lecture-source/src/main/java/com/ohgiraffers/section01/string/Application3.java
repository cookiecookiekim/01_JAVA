package com.ohgiraffers.section01.string;

import java.util.StringTokenizer;

public class Application3 { // 24-09-12 (목) 4교시 API - 문자열 분리

    public static void main(String[] args) { // String은 한 번 초기화 해놓으면 불변이다! ! !

        /* title. 문자열 분리에 대해 이해할 수 있다. */

        /* comment.
         *   split() : 정규 표현식을 이용해서 문자열 분리
         *            공백도 문자열로 포함한다.
         *  정규표현식은 속도가 느리다는 단점을 가지고 있고,
         *  자바에서는 다루지 않고 자바스크립트에서 다룰 예정 */

         /*  comment. StringTokenizer
              문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
              공백 문자열을 무시할 수 있다.
              정규표현식을 사용하지 않아 split() */

        //                 사번/이름/주소/부서
        String employee1 = "100/홍길동/서울/영업부";
        String employee2 = "200/유관순//총무부"; // 주소 없음
        String employee3 = "300/이순신/경기도/"; // 부서 없음

        String[] emp1Arr = employee1.split("/");
        String[] emp2Arr = employee2.split("/");
        String[] emp3Arr = employee3.split("/");

        for (int i = 0; i < emp1Arr.length; i++) {
            System.out.println(emp1Arr[i]);
        }
        for (int i = 0; i < emp2Arr.length; i++) {
            System.out.println(emp2Arr[i]);
        }
        for (int i = 0; i < emp3Arr.length; i++) {
            System.out.println(emp3Arr[i]);
        }

        // StringTokenizer 요건 몰라도 됨!
        // 전달인자 (분리하고 싶은 문자열, 구분 기호)
        StringTokenizer st1 = new StringTokenizer(employee1, "/");
        StringTokenizer st2 = new StringTokenizer(employee2, "/");
        StringTokenizer st3 = new StringTokenizer(employee3, "/");
        //StringTokenizer는 인덱스 체계가 아니므로 for문 사용 불가.
        while (st1.hasMoreTokens()) { // 더 많은 토큰을 가지고 있냐? true면 반환
        System.out.println("st1 : " + st1.nextToken());
        }

        while (st2.hasMoreTokens()) {
            System.out.println("st2 : " + st2.nextToken());
        }

        while (st3.hasMoreTokens()) {
            System.out.println("st3 : " + st3.nextToken());
        }
    }
}
