package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while { //

    public void testWhileStatement () { // 24-09-03 4교시 while문 기초

        /* title. while문 단독 사용에 대한 흐름을 이해할 수 있다. */
        /* comment. [while문 표현식]
        *   초기식;
        *   while (조건식) {
        *       조건을 만족하는 경우 반복할 구문;
        *       증감식;
        *   } */

        /* index. 1부터 10까지 1씩 증가시키면서 i값을 출력하는 반복문 */

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }

    }

    public void whileExample1 () {
        /* index. 스캐너를 사용해서 문자열을 입력받아, 인덱스를 이용해 1글자씩 출력해보기 */
        Scanner scr = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scr.nextLine();

        /* comment.
        *   charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환해주는 메서드
        *   length() : String 클래스에서 제공하는 메서드로 문자열의 길이를 int형으로 반환해준다. */

        System.out.println("===================== for 문 ==========================");
        // ex) 안녕 → 안 녕

        for (int i = 0; i < str.length(); i++) { // length(); 사용

            char ch = str.charAt(i);
            System.out.println(i + "번 째 : " + ch);
        }
        System.out.println("=================== while 문 ===========================");

        int i = 0;
        while (i < str.length());
        char ch = str.charAt(i);
        System.out.println(i + " 번 째 : " + ch);
        i++;

    }

    public void whileExample2 () {
        /* comment. 중첩 while문을 사용해서 구구단 출력 연습 */
        // dan : 2 ~ 9
        // su : 1 ~ 9
        int dan = 2;

        while (dan < 10) {
            int su = 1;

            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                     su++;

            }
            System.out.println(); // 한 줄 띄어쓰기
            dan++;

        }

    }

}
