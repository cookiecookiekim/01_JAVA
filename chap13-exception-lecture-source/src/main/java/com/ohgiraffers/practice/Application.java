package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws DivideNotZeroException, MultipleNotZeroException {

        Scanner scr = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int number1 = scr.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int number2 = scr.nextInt();

        Calculrator cal = new Calculrator();

        scr.nextLine();

        while (true) {
            System.out.print("사칙 연산 기호를 입력 하세요 : ");
            String asd = scr.nextLine();

            if (asd.equals("+")) {
                cal.plusMethod(number1, number2);
                break;
            } else if (asd.equals("-")) {
                cal.minusMethod(number1, number2);
                break;
            } else if (asd.equals("*")) {
                cal.multipleMethod(number1, number2);
                break;
            } else if (asd.equals("/")) {
                cal.divideMethod(number1, number2);
                break;
            }
        }
    }
}

//        Application 클래스와 Calculrator 클래스 구현
//        Application 클래스에서는 main 메소드 구현
//        Application 클래스에서 Scanner 객체를 사용해서 2 개의 정수, 1 개의 사칙연산 기호를 받는다.
//        입력 한 정수를 Calculrator 클래스의 메소드로 전달한다.
//                사칙연산이 수학적으로 통용되는 상식선에서 정상적으로 돌아가도록 구현
//        모든 사칙 연산은 정수로 계산되도록 할 것
//        나누기의 경우 나눌 수 가 0인 경우 사용자 정의의 DivideNotZeroException 이 발생하도록 구현
//        DivideNotZeroException 클래스는 message 로 "나눌 수는 0이 될 수 없습니다" 출력
//        곱하기의 경우 곱하는 수가 0인 경우 사용자 정의의 MultipleNotZeroException 이 발생하도록 구현
//        MultipleNotZeroException 클래스는 message 로 "곱하는 수는 0이 될 수 없습니다" 출력
//        그 외에 본인이 만들고 싶은 예외사항 있으면 얼마든지 추가 가능
