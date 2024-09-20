package com.ohgiraffers.practice2;

public class Calculrator {

    public void result (int num1, int num2, String asd) throws DivideNotZeroException, MultipleNotZeroException {

        switch (asd) {
            case "+" :
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-" :
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*" :
                if (num1 == 0 || num2 == 0) {
                    throw new MultipleNotZeroException("곱하는 수는 0이 될 수 없습니다");
                } else {
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));}
                break;
            case "/" :
                if (num1 == 0 || num2 == 0) {
                    throw new DivideNotZeroException("나눌 수는 0이 될 수 없습니다");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); }
                break;
        }
    }
}
