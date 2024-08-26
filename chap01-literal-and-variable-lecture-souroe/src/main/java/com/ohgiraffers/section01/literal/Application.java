package com.ohgiraffers.section01.literal;

public class Application {

    public static void main(String[] args) {
/* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 필기.
        * Java 라고 하는 프로그래밍 언어에서
        * 전해진 약속된 형태의 값들이 있다
        */
        /*목차. 1. 순자 형태의 값*/
        // 1-1 정수 형태의 값 출력
        System.out.println(123);

       // 1-2. 실수 형태의 값 출력
        System.out.println(1.23);

        /*목차. 2. 문자 형태의 값 출력 */
        // 문자 형태의 값음 홀따옴표('a');
        System.out.println('a');

        //*목차 2. 두 개 이상의 문자를 ''입력하면?
//        System.out.println('ab ');
        // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
        System.out.println(' ');
//
        //아무런 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('3');

        //숫자 값이지만, 홀때옴펴러 감싸진 경우에는 문자 3으로 인식한다

        /*목차. 3. 문자열 형태의 값 출력*/
        System.out.println("안녕하세요");
        // 문자열은 문자 여러개가 나열된 형태의 의미이며 ,쌍타옴표(double-quotartion)으로 감싸야 한다 (문자 a와는 다르다)
        //문자열은 문자 여러개개가 나열한

        /* 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);

        }


}
