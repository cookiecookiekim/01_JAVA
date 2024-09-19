package com.ohgiraffers.section02.set;

import java.util.Set;
import java.util.TreeSet;

public class Application2 { // 24-09-19 5~6교시 컬렉션 Set

    public static void main(String[] args) { // 찐 로또번호 추첨기 만들기 실습

        /* title. TreeSet에 대해 이해하고 사용할 수 있다. */

        /* comment.
        *   TreeSet 클래스는 데이터가 정렬된 상태로 저장되는
        *   이진 검색 트리 형태로 요소를 저장하게 된다.
        *   이진 검색 트리 구조는 데이터를 추가하거나 제거하는 등의
        *   기본 동작 시간이 매우 빠르다. */
        // ← 배열은 하나하나 까봐야 하지만 이건 위에서부터 참 or 거짓 형태로

        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("maysql");
        tset.add("jabc");
        tset.add("html");
        tset.add("css");
        // TreeSet 특징 1 : 자동 오름차순 정렬
        // TreeSet 특징 2 : 중복 불가 (Set 상속받은 녀석이다)
        System.out.println("tset = " + tset); // = [css, html, jabc, java, maysql]
                        // TreeSet은 순서대로 출력은 안 하지만, 자동 오름차순 정렬이 된다.

        /* comment. 로또 번호 발생기 실습
        *   요구사항
        *   1. 로또 번호는 중복이 될 수 없다. (조건이 이것 뿐이면 Set만 쓰면 된다.)
        *   2. 로또 번호는 오름차순 정렬로 나오게 한다. (오름차순 조건이면 TreeSet 써야한다.) */

        // 다형성을 적용해서 인스턴스 생성
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add(((int) (Math.random() * 45)) + 1);
        }

        System.out.print("이번 주 로또 당첨 번호는?");
        System.out.println(lotto); // [17, 18, 29, 35, 42, 45]

    }
}
