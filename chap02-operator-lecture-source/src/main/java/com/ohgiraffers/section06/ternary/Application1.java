package com.ohgiraffers.section06.ternary;

public class Application1 { // 24-08-28 (수) 3교시 [삼항연산자]

    public static void main(String[] args) {
        /* title. 삼항연산자에 대해 이해할 수 있다.
        *   삼항연산자 : 자바에서 유일하게 피연산자 항목이 3개인 연산자이다. = 항목이 3개이다.
        *   표현 방법 = (조건식) ? 조건이 참일 때 사용할 값 : 조건이 거짓일 때 사용할 값 */

        /* index. 1. 삼항연산자 단독 사용 */
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0) ? "양수" : "음수";
        String result2 = (num2 > 0) ? "양수" : "음수";
        System.out.println("result1 = " + result1); // 양수
        System.out.println("result2 = " + result2); // 음수

        /* index. 2. 삼항연산자 중첩 활용 */ //단독으로 많이 사용하지 중첩은 그렇게 많이 사용하지 않는다.
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0) ? "양수" : (num3 == 0) ? "0" : "음수"; // 어렵게 생각하지 말고 순서대로 계산된다.
        String result4 = (num4 > 0) ? "양수" : (num4 == 0) ? "0" : "음수"; // 어렵게 생각하지 말고 순서대로 계산된다.
        String result5 = (num5 > 0) ? "양수" : (num5 == 0) ? "0" : "음수"; // 어렵게 생각하지 말고 순서대로 계산된다.

        System.out.println("result3 = " + result3); // 양수
        System.out.println("result4 = " + result4); // 0
        System.out.println("result5 = " + result5); // 음수

    }
}
