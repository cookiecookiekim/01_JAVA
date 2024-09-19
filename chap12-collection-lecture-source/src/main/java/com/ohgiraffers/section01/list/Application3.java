package com.ohgiraffers.section01.list;

import java.util.Stack;

public class Application3 { // 24-09-19 4교시 컬렉션 Stack ★ (중요) ★

    public static void main(String[] args) {

        /* title. Stack 구조에 대해 이해할 수 있다. */

        /* comment. Stack
         *   대표적인 예시로 메서드의 호출 구조를 들 수 있다.
         *   선형 메머리 공간에 데이터를 저장하며
         *   후입선출(선입후출)(LIFO - Last In First Out) 방식의 구조이다. */

        Stack<Integer> integerStack = new Stack<>();
        // Stack에 값을 넣을 때는 push()
        integerStack.push(1); // 가장 첨에 입력 → 맨 밑에 있음
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5); // 가장 마지막에 입력 → 맨 위에 있음

        System.out.println("integerStack = " + integerStack); // 출력 = [1, 2, 3, 4, 5]

        // stack 요소를 찾을 때 search() 사용 가능하다.
        System.out.println(integerStack.search(5)); // 1 출력, 왜?
        // 인덱스가 아닌 위에서부터의 순번을 의미하기 때문.
        // 또한 가장 상단의 위치가 0이 아닌 1부터 시작한다.

        /* comment. stack에 값 꺼내는 2가지의 메서드
        *   peek() : 해당 스택 공간에 가장 마지막(상단)에 있는 요소 반환
        *   pop() : 해당 스택 공간에 가장 마지막(상단)에 있는 요소 반환 후 제거 */

        System.out.println("peek() : " + integerStack.peek()); // 5 (가장 위에 있는 놈을 빼낸다.)
        System.out.println("integerStack = " + integerStack); // 출력 = [1, 2, 3, 4, 5]

        System.out.println("pop() : " + integerStack.pop());// 5 반환 후 삭제 됐다.
        System.out.println("integerStack = " + integerStack); // 출력 = [1, 2, 3, 4]

    }
}
