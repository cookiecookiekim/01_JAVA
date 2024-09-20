package com.ohgiraffers.section02.userexception.exception;
// 상품가격이 음수일 때 처리 할 클래스

public class PriceNegativeException extends NegativeException { // 24-09-20 (금) 4교시 예외처리 (심화)

    public PriceNegativeException(String message) {

        super(message); // 여기서 super는 NegativeException
    }
}
