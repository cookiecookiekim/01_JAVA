package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.List;

public class Application2 {

    public static void main(String[] args) { // 24-09-19 3교시 컬렉션(LinkedList) ★★

        /* title. LinkedList에 대해 이해할 수 있다. */

        /* comment. LinkedList
        *   ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 나온 클래스
        *   내부는 이중연결리스트로 구현되어 있다.
        *   → 인덱스 체계가 아닌 다음 요소에 대한 주소를 저장하는 방식 */

        /* comment. 단일 연결 리스트
        *   저장한 요소가 순서를 유지하지 않고 저장되지만, 이러한 요소들 사이를
        *   링크로 연결하여 구성하며 마치 연결된 리스트 형태인 것 처럼 만든 자료구조.
        *   요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하면 되기 때문에
        *   ArrayList보다 성능이 우수하다.
        *   하지만, 단일 연결 리스트는 다음 요소만 링크(참조)하기 때문에
        *   이전 요소로의 접근이 어렵다. */

        /* comment. 이중 연결 리스트
        *   단일 연결 리스트는 다음 요소만 링크(참조)하는 반면, 이중 연결 리스트는
        *   이전 요소도 링크하여 이전 요소에 대한 접근도 쉽게 고안된 자료구조 이다.
        *   LinkedList가 이중 연결 리스트를 구현한 것이며, List 인터페이스를
        *   상속 받아서 구현되어 ArrayList와 사용 방법이 거의 유사하다.
        *   하지만 ★ 내부적으로 요소를 저장하는 방식이 다르다는 것은 인지해야 한다. ★ */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size()); // 5 출력

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + "번 째 값 : " + linkedList.get(i)); // 순서대로 출력
        }

        for (String s : linkedList) {
            System.out.println(s); // 순서대로 출력
        }

        linkedList.set(0, "pineapple"); // 0번째 인덱스에 pineapple 넣겠다.
        System.out.println("linkedList = " + linkedList); // 출력 = [pineapple, banana, orange, mango, grape]

        linkedList.clear(); // 리스트 내 모든 요소를 제거하는 메서드
        System.out.println(linkedList); // []
        // isEmpty() → 비어있는지 확인하는 메서드
        System.out.println(linkedList.isEmpty()); // true
    }
}
