package com.ohgiraffers.section03.constant;

public class Application2 { // 24-08-26 (월)

    public static void main(String[] args) {

        /* 수업목표. 상수의 명명 규칙에 대해 이해할 수 있다. */
        /* 필기.
        상수의 명명 규칙은 변수의 명명 규칙과 컴파일 에러를 발생시키는 규칙이 동일하다.
        하지만 개발자들끼리의 암묵적 규칙에서는 일부 차이가 있다. */
         /* 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다. */
        final int AGE = 20;
        final int AGE2 = 30;

        /* 2. 단어와 단어 연결은 언더스코어 (_)를 사용한다. (상수에서는 낙타표기법을 쓰지 못하므로) EX) MAX_AGE */
        final int MAX_AGE = 60;

        // 소스트리 , 깃허브 연동하였고, 잘 작동 되는지 시험삼아 저장해보는 것.
    }
}
