package com.ohgiraffers.section01.exception;

public class Application3 { // 24-09-20 (금) 4교시 예외처리 (try-catch)

    public static void main(String[] args) { // 예외 발생하는 케이스 예시

        /* title. try-catch 블럭을 이용하여 예외처리 하기 */

        /* index. 3. try-catch 블럭을 이용한 방법 (예외 발생) */

        ExceptionTest et = new ExceptionTest();
        try {
            // 상품의 가격이 더 높게 만들 것이다.
            et.checkEnoughMoney(50000,10000);
            System.out.println("================ 상품 구입 가능 ===============");

        } catch (Exception e) { // try 구문에서 예외 발생 시 catch 구문 동작
            System.out.println("================ 상품 구입 불가능 ===============");
            // 지금은 출력문구 하나만 넣었지만, 원하는대로 화면 문구를 넣어도 된다. (나중에...)
        }

        System.out.println("프로그램을 종료합니다..");

    }
}
