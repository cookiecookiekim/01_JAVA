package com.ohgiraffers.section02.userexception.exception;


// 예외 클래스 만드는 방법 , Exception을 상속 받게 되면 사용자 정의의 예외 클래스 만들 수 있다.
public class NegativeException extends Exception { // 모든 예외 클래스인 Exception 상속 받기

    public NegativeException (String message) { // 24-09-20 (금) 4교시 예외처리 (심화)

        super(message); // 여기서 super는 Exception

    }

}
