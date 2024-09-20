package com.ohgiraffers.section01.exception;

public class Application2 { // 24-09-20 (금) 3교시 예외처리 (try-catch)

    public static void main(String[] args) { // 예외 발생하지 않는 케이스 예시

        /* title. try-catch 블럭을 이용하여 예외처리 하기 */

        /* index. 2. try-catch 블럭을 이용한 방법 (예외 발생하지 않음) */

        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(10000,50000);
            System.out.println("================ 상품 구입 가능 ===============");

        } catch (Exception e) { // try 구문에서 예외 발생 시 catch 구문 동작
            System.out.println("================ 상품 구입 불가능 ===============");
        }

        System.out.println("프로그램을 종료합니다..");

    }
}
