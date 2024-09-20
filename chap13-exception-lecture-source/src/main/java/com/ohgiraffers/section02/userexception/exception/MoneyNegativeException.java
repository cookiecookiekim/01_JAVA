package com.ohgiraffers.section02.userexception.exception;
// 가진 돈이 음수일 때 처리 할 클래스

public class MoneyNegativeException extends NegativeException { // 24-09-20 (금) 4교시 예외처리 (심화)

    public MoneyNegativeException(String message) {

        super(message); // 여기서 super는 NegativeException
    }
}
