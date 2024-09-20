package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception { // 음수와 관련이 없으므로 Exception 상속

    public NotEnoughMoneyException(String message) {

        super(message);

    }

}
