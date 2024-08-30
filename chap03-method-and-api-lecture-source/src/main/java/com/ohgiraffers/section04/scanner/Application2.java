package com.ohgiraffers.section04.scanner;

import java.util.Scanner; // 24-08-30 (금) 4교시 메서드의 응용, nextLine(), next()의 차이

public class Application2 {

    public static void main(String[] args) {

        /* title. Scanner의 nextLine(), next()의 차이 */
        /* comment
        *   nextLine() : 공백을 포함한 한 줄을 입력하기 위한 개행 문자 전까지 읽어서 문자열로 반환한다 ( → 공백 문자 포함)
        *   next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환 ( → 공백 문자 포함하지 않음) */

        /* index. 1. Scanner 객체 생성 = 사용할 준비 */
        Scanner sc = new Scanner(System.in);

        /* index. 2. 문자열 입력 */
        // nextLine() 사용
        System.out.print("인사말을 입력해 주세요 : ");
        String hi = sc.nextLine();
        System.out.println(hi);

        // next() 사용
        System.out.print("인사말을 입력해 주세요 : ");
        String nextHi = sc.next();
        System.out.println(nextHi);

        /* index. 3. 문자 */


    }
}
