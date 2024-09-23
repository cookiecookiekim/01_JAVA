package com.ohgiraffers.practice1;

public class Calculrator { // 계산을 위한 클래스

    public void plusMethod (int number1 , int number2)  {

        int plusResult = number1 + number2;
        System.out.println("더하기 결과 : " + number1 + " + " + number2 + " = " + plusResult);

    }

    public void minusMethod (int number1 , int number2) {

        int minusResult = number1 - number2;
        System.out.println("빼기 결과 : " + number1 + " - " + number2 + " = " + minusResult);

    }

    public void multipleMethod (int number1 , int number2) throws MultipleNotZeroException {

        if (number1 == 0 || number2 == 0) {
            throw new MultipleNotZeroException("곱하는 수는 0이 될 수 없습니다");

        } else {
            int multipleResult = number1 * number2;
            System.out.println("곱하기 결과 : " + number1 + " * " + number2 + " = " + multipleResult);
        }
    }

    public void divideMethod (int number1 , int number2) throws DivideNotZeroException {

        if (number1 == 0 || number2 == 0) {
            throw new DivideNotZeroException ("나눌 수는 0이 될 수 없습니다.");

        } else {
            int divideResult = number1 / number2;
            System.out.println("나누기 결과 : " + number1 + " / " + number2 + " = " + divideResult);
        }
    }

}
