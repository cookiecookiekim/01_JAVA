package com.ohgiraffers.section03.map;

import java.util.*;

public class Application1 { // 24-09-20 (금) 1교시 Map

    public static void main(String[] args) {

        /* title. Map의 자료 구조에 대해 이해하고 HashMap을 이용할 수 있다. */

        /* comment. Map 인터페이스의 특징
        *   일반적인 Collection 인터페이스와는 다른 저장 방식을 가지고 있다.
        *   Map의 가장 큰 특징은 키(key)와 값(value)를 하나의 세트로 저장하는 방식 */

        /* comment. 키(key)란?
        *   값을 찾기 위한 이름 역할을 하는 객체 → 변수의 역할
        *   1. 키는 중복 저장을 허용하지 않지만, 키가 다르다면 값은 중복 가능
        *   2. 요소의 저장 순서를 유지하지 않는다. */

        /* comment. Map 인터페이스를 구현한 대표 클래스
        *   ( HashMap, HashTable, TreeMap )
        *   이 3가지 클래스 중, HashMap이 가장 많이 사용되며
        *   해시 알고리즘이 적용되어 검색 속도가 매우 빠른 특징 */

        HashMap hmap = new HashMap();

        /* index. 1. HashMap 인스턴스에 값 저장하기 (put) */
        hmap.put("one", new Date()); // 클래스는 이렇게 인스턴스 생성해야하나?
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println(hmap); // 순서유지X , K-V 세트로 출력

        /* index. 2. 키는 중복 저장이 안 된다. (set 방식) */
        // 키는 중복 저장이 되지 않기 때문에 최신 값으로 덮어 씌어짐. (12)
        hmap.put(12, "yellow banana");
        System.out.println("hmap = " + hmap); // (12, "red apple") 삭제 → 덮어 씌여짐.

        /* index. 3. 값은 중복 저장이 되는지 확인 */
        // key 값이 중복되지 않는다면 value는 중복 저장 가능
        hmap.put(11, "yellow banana");
        hmap.put(10, "yellow banana");
        System.out.println(hmap);

        /* index. 4. Map에 저장된 값 꺼내기 (get) */
        System.out.println("12번 키에 해당하는 값 : " + hmap.get(12)); // yellow banana
        // 12번째 키에 있는 값을 꺼내온다.

        hmap.remove(12);
        System.out.println("hmap = " + hmap);

        // 저장된 객체 수 확인 size() 메서드
        System.out.println("hmap에 저장된 객체 수 : " + hmap.size());

        // 다형성 적용해서 HashMap 만들기
        Map<String, String> hmap2 = new HashMap<>();
        // Map은 인터페이스이므로 다형성을 적용하여 하위 자식인 HashMap 클래스를 이용하여 생성

        hmap2.put("one", "java");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "mybatis");
        hmap2.put("five", "jpa");

        // 이 아래부터 이해 안 감. 복습 5번 예약...............................................
        /* index. keySet()을 이용해서 키만 따로 Set으로 만들고, iterator()로 목록 만들기 */ // 2교시
        Set<String> keySet = hmap2.keySet(); // set 방식으로 바뀜
        Iterator<String> keyIter = keySet.iterator(); // Map → Set → Iterator가 된 것.
        /* index. 2. Iterator에서 제공하는 hasNext(), next() 메서드 사용해서 반복문 */

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key);
            System.out.println(value);
            System.out.println(key + " = " + value);
        }
    }
}
