package com.ohgiraffers.section01.method;

public class Application8 { // 24-08-29 (목) 5교시 static 메서드 (static은 그렇게 많이 사용하지 않음, 이해만 하자)

    public static void main(String[] args) {

        /* title. static 메서드를 호출할 수 있다.  */
        /* comment.
        *   우리가 지금 만들고 있는 메서드는 public과 void or 자료형 사이에 static 키워드가 붙은 메서드를 만들어서 호출해 볼 예정
        *   static 나중에 다시 다룰 예정이지만, static 키워드가 붙은 메서드 호출을 알아볼 것이다. */

        /* comment.
        *   [표현식] : 클래스명.메서드명();*/

        Application8.sumTwoNumbers(10, 20); // static 이라는 키워드는 이미 컴퓨터가 인식을 하고 있기 때문에 new라는 메모리 공간을 만들 필요가 없다.
        int result = Application8.sumTwoNumbers(10, 20); // static이라는 키워드가 붙을 시엔 기울임체가 된다.
        System.out.println("result = " + result);
        /* comment.
        *   [동일한 클래스] 내에 작성된 static 메서드는 클래스명이 생략 가능하다. */
        sumTwoNumbers(10, 20);

    }

    public static int sumTwoNumbers (int first, int second) {
        return first + second;
    }
}
