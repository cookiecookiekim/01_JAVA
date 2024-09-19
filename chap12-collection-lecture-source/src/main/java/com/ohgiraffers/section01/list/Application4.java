package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 { // 24-09-19 4교시 컬렉션 Queue ★★

    public static void main(String[] args) {

        /* title. Queue에 대해 히해하고 사용할 수 있다. */

        /* comment. Queue
        *   선형 메모리 공간에 데이터를 저장하는
        *   선입선출(FIFI - First In First Out) 방식의 자료구조
        *   Queue 인터페이스를 상속받는 하위 인터페이스는 다양하지만
        *   대부분은 LinkedList를 이용해 인스턴스를 생성한다. */

        // Queue도 인터페이스이기 때문에 인스턴스 생성 불가.
        Queue<String> que = new LinkedList<>();

        // Queue 데이터 넣기 offer() 메서드를 이용
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que); // = [first, second, third, fourth, fifth]

        /* comment. Queue에서 데이터를 꺼내는 2가지 방법
        *   peek() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온) 반환
        *   poll() : 해당 큐에 가장 앞에 있는 요소 반환 후 제거 */

        System.out.println("peek() : " + que.peek()); // first 출력
        System.out.println("peek() : " + que.peek()); // first 출력 (삭제되지 않음)
        System.out.println("que = " + que); // = [first, second, third, fourth, fifth]

        System.out.println("poll() : " + que.poll()); // first 출력 후 first 삭제
        System.out.println("poll() : " + que.poll()); // second 출력 후 second 삭제)
        System.out.println("que = " + que); // = [third, fourth, fifth]
    }
}
