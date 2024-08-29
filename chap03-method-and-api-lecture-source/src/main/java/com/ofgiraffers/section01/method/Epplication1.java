package com.ofgiraffers.section01.method;

public class Epplication1 { // 문제 풀이 (1시간 걸림)

          public static void main(String[] args) {
            int num1 = 37;
            int num2 = 28;

            Epplication1 epp1 = new Epplication1();
            String result1 = epp1.isEven(num1);
              System.out.println("result = " + result1);

            String result2 = epp1.isEven(num2);
              System.out.println("result2 = " + result2);
       }
       public String isEven (int first) {
           return (first % 2 == 0) ? "참" : "거짓";

       }
}
    //int형 변수 num1, num2 를 선언하고 num1과 num2가 짝수인지 판별하는 메소드 isEven을  작성하시오.
//
//단, 결과는 참, 거짓으로 출력되며 삼항연산자를 이용하기 바랍니다.
//
//입력 )
//
//num1 = 37
//
//num2 = 28
//
//출력 결과 )
//
//num1 = 거짓
//
//num2 = 참

