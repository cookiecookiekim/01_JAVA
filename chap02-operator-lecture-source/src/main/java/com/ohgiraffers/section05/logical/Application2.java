package com.ohgiraffers.section05.logical;

public class Application2 { // 24-08-28 (수) 2교시 [logical 논리연산자] 수업

    public static void main(String[] args) {

        /* title. 논리연산자의 우선순위에 대해 이해하고 활용해보자. */

        /* comment. 논리 연산자의 우선순위와 활용
        *   논리 and 연사자와 논리 or 연산자의 우선순위
        *   && : 11 순위
        *   || : 12 순위 */

        /* index. 1. 1부터 100 사이의 값인지 확인 */ //하나의 조건 같지만 두 개의 조건이다.
        int num1 = -10;
        System.out.println("num1이 1부터 100사이인지 확인 " + (1 <= num1 && num1 <= 100)); //false

        /* index. 2. 영어 대문자인지 확인 */
        char ch1 = 'G'; // 문자는 내부적으로 숫자이다.
        System.out.println("ch1이 영어 대문자인지 확인 " + ('A' <= ch1 && ch1 <= 'Z')); //true

        /* 번외 */
        // a는 A보다 클까? → 구글링 하지 말아보자. → 형변환 활용해보기.
        char aTest = 'z';
        char ATest = 'Z';

        int aToInt = (int) aTest;
        int AToInt = (int) ATest;
        System.out.println(aToInt);
        System.out.println(AToInt);

        /* index. 3. 'f' 대소문자 상관없이 영어인지 확인해보기 */
        char ch2 = 'f';
        System.out.println("f가 영문자인지 확인 : " + (('A' <= ch2 && ch2 <= 'Z') || ('a' <= ch2 && ch2 <= 'z'))); // true
        System.out.println("f가 영문자인지 확인 : " + ('A' <= ch2 && ch2 <= 'z')); // true

    }
}
