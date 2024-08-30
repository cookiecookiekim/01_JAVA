package com.ohgiraffers.section01.method;

public class Calculator { // 24-08-29 (목) 5교시 static 메서드 연계 방법 (다른 클래스 메인에서 다른 클래스로)

    /* comment. 우리는 Application에서 2개의 정수를 전달할 것이고, Calculator 클래스는 2개의 정수를 전달 받아,
     *   최소값을 구하는 메서드 (기능)
     *   최대값을 구하는 메서드 (기능)
     *   실행 후 Application에게 2개의 정수 중 큰 값과 작은 값이 무엇인지 알려줄 것이다. */

    public int minNumberOf (int first, int second) {
        return (first < second) ? first : second; // 항상 min 값 출력
    }

    public static int maxNumberOf (int first, int second) { // static이란 공유하면서 바뀌지 않는 값이란 걸 알아두자
        return (first > second) ? first : second; // 항상 max 값 출력
    }

}
