package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {// 24-09-02 2교시 조건문 (else 구문 추가)
    /* title. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    /* comment. [if-else문 표현식]
    *   if(조건식) {
    *   조건이 true일 때 실행할 구문;
    *   } else {
    *   조건이 false일 때 실행할 구문;
    *   }*/

    /* comment. if문은 조건식의 결과가 참(true)이면 if{ } 내부의 코드 실행,
        else문은 조건식의 결과가 거짓(false)이면 else { } 내부의 코드 실행. */

    /* index. 1. 문제
    *   정수 한 개를 입력 받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."를 출력하고,
    *   홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램 만들어 보기.
    *   단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 해보자. */
    public void testIfElseStatement () {
        Scanner scr = new Scanner(System.in);
        System.out.print("숫자 한 개 입력해 주세요 : ");
        int result = scr.nextInt();
        if (result % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
            System.out.println("프로그램을 종료합니다");
    }

    public void testNestedIfElseStatement() { // 중첩 else if
        /* index. 2. 문제
        *   숫자를 하나 입력받아, 양수이면 "입력하신 숫자는 양수입니다."를 출력하고,
        *   음수이면 "입력하신 숫자는 음수입니다." 출력해보자.
        *   단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 해보자. */

        Scanner scr = new Scanner(System.in);
        System.out.print("숫자 한 개 입력해 주세요 : ");
        int result = scr.nextInt();

        if (result != 0) {
            if (result > 0) {
                System.out.println("입력하신 숫자는 양수입니다.");
            } else {
                System.out.println("입력하신 숫자는 음수입니다.");
            }
        } else {
            System.out.println("입력하신 숫자는 0입니다.");
        }
        System.out.println("프로그램이 종료합니다.");
    }
}
