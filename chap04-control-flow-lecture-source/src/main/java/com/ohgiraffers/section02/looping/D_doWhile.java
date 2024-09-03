package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile { // 24-09-03 (화) 4교시 do-while 이어서

    public void testdoWhileStatement () {

        /* title. do-while문 단독 사용에 대해 이해할 수 있다. */
        /* comment. [do-while 문 표현식]
        *   초기식;
        *   do {
        *       1회차에는 무조건 실행하고, 이후는 조건식을 확인해서 조건을 만족하는 경우에만 반복할 구문;
        *       증감식;
        *   } while(조건식) */

        do {
            System.out.println("최초 한 번 동작함");

        } while (false);

        System.out.println("반복문 종료 확인");

    }

    public void doWhileExample () { //24-09-03 (화) 5교시 do-while 이어서

        /* index. 스캐너로 문자열을 입력받아, 반복적으로 출력할 예정.
        *   단, exit가 입력되면 반복문 종료 */
        Scanner scr = new Scanner(System.in);
        String str = ""; // 입력도 반복으로 하려고 ""; 이렇게

        do {
            System.out.print("문자열을 입력해 주세요 : ");
            str = scr.nextLine();
            System.out.println("str = " + str);
            /* comment. 문자열은 == 비교가 불가능하다. → 이유는, 각 주소가 다르기 때문에...참조형...  → 난중에 자세히....
            *   그러면 어떻게 비교할까?
            *   equals() : 문자열이 같은지를 비교해주는 메소드 */
        } while (!str.equals("exit")); // 조건이 만족하지 않을때, 즉 faulse일 때 종료.

        System.out.println("프로그램을 종료합니다.");

    }

}
