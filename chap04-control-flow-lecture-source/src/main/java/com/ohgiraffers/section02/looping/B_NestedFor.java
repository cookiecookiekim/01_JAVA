package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_NestedFor { // 24-09-03 2교시 중첩 for문

    public void printGugudanTwoToNine () { // 2에서 9단 까지의 구구단 모두 출력

        for (int dan = 2; dan <= 9; dan++) { // 처음 2에서 시작되고 아래 for문으로 넘어가는데 전체가 다 끝나야 for문을 나와서 3단이 된다.

            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su)); // 흐름을 이해하자!
            }
            System.out.println(); // 한 줄 띄우기
        }

    }
    ///////////////////////////////////////////////////////////////////
    public void upgradeGUgudanTwoToNine () { // 1 ~ 3 chaptor 복습 (매개변수 , 전달인자)

        for (int dan = 2; dan <= 9; dan++) {
            printGugudanOf(dan); // 전달인자
            // 한 줄 띄어쓰기 (밑에 메서드와 비교용)
            System.out.println();
        }
        
    }

    private void printGugudanOf(int dan) { // // 매개변수 [private은 해당하는 class 내에서만 사용 가능]

        System.out.println("dan = " + dan);

        for (int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }

    }
///////////////////////////////////////////////////////////////////////
    public void printStarInputRowTimes () {
        /* comment.
        *   키보드로 정수를 입력 받아 해당 정수만큼 한 행에 "*"을 5개씩 출력하는 구문 */
        /* 2 입력하면
         *****
         ***** 출력
         */
        Scanner scr = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력해 주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <= row; i++) { // row => 줄 수

//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
            printStar(5);
            System.out.println();
        }
    }

    private void printStar (int times) { // 5 // times => 별 개수
        for (int i = 1; i <= times; i++) {
            System.out.print("*");
        }
    }

    public void printTriangleStars () { // 3교시 문제 풀어보기
        /* comment. 키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*"을 행의 번호개씩 출력
        *   ex) 정수를 입력해 주세요 : 3
        *   *
        *   **
        *   ****/
        Scanner scr = new Scanner(System.in);
        System.out.print("하나의 정수를 입력해 주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void printReverseTriangleStars () { // 3교시 문제 풀어보기
        /* comment. ex)정수를 입력해 주세요 : 3
        *   ***
        *   **
        *   *  */

        Scanner scr = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = scr.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int z = num; z >= i; z--) {

                System.out.print("*"); // 줄바꿈 제대로 하자..........
            }
            System.out.println();
        }

    }

}
