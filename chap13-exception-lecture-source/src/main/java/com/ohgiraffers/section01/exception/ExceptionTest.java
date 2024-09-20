package com.ohgiraffers.section01.exception;

public class ExceptionTest { // 24-09-20 (금) 3~4교시 예외처리 (실습 클래스)


    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money >= price) {
            System.out.println("상품을 구매할 자격이 있습니다.");
        } else { // 돈 부족
            /* comment. 예외 상황 삽입
            *   강제로 예외를 발생시키는 방법
            *   throw new 예외클래스명(); */
            throw new Exception(); // catch (Exception e)가 잡고 있으므로 빨간 에러 안 뜬다.
        } // 프로그램이 종료되지 않았다.

        System.out.println("즐거운 쇼핑 하세요~!");

    }

}
