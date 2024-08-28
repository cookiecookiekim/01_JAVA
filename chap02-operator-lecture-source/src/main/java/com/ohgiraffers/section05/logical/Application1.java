package com.ohgiraffers.section05.logical;

public class Application1 { // 24-08-28 (수) 1교시 [logical 논리연산자] 수업

    public static void main(String[] args) {

        /* title. 논리연산자에 대해 이해하고 활용할 수 있다. */
        /* comment. 논리연산자
        *   논리값(true of false)를 취급하는 연산자이다.*/
        /* comment.
        *   1. 논리 연결 연산자
        *    - 두 개의 피연산자를 가지는 이항 연산자이며, 두 개의 논리 식을 판단하여 참과 거짓을 구분해준다.
        *   1-1. && (논리 AND) 연산자
        *   - 두 개의 논리식 모두 참일 경우 참을 반환, 둘 중 하나라도 거짓이면 거짓
        *   1-2. || (논리 OR) 연산자
        *   - 두 개의 논리식 둘 중 하나라도 참일 경우에는 참을 반환, 둘 다 거짓이면 거짓
        *   2. 논리 부정 연산자 - 피연산자가 하나인 단항 연산자
        *   2-1. !(논리 NOT) 연산자
        *   - 논리식의 결과가 참이면 거짓, 거짓이면 참을 반환한다. (식을 반전 시킨다.)
        *   */

        /* index. 1. 논리 연산자의 결과값 확인 */
        System.out.println("true와 true의 논리 and 연산 : " + (true && true)); //true
        System.out.println("true와 false의 논리 and 연산 : " + (true && false)); //false
        System.out.println("false와 true의 논리 and 연산 : " + (false && true)); //false
        System.out.println("false와 false의 논리 and 연산 : " + (false && false)); //false
        System.out.println("=========================================================================");
        System.out.println("true와 true의 논리 or 연산 : " + (true || true)); // true
        System.out.println("true와 false의 논리 or 연산 : " + (true || false)); // true
        System.out.println("false와 true의 논리 or 연산 : " + (false || true)); //ture
        System.out.println("false와 false의 논리 or 연산 : " + (false || false)); // false
        System.out.println("=========================================================================");
        System.out.println("true의 논리 not 연산 : " + (!true)); // false
        System.out.println("true의 논리 not 연산 : " + (!false)); // true

        /* index. 2. 논리식에 논리연산자 활용해보기 */

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d)); //ture
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d)); // false
        System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b && c < d)); // false
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d)); // false
        System.out.println("=========================================================================");
        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d)); // true
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d)); // true
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + (a > b || c < d)); // true
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d)); // false

    }
}
