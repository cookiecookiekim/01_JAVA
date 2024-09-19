package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 { // 24-09-19 5교시 컬렉션 Set

    public static void main(String[] args) { // 로또번호 추첨기 만들기 연습

        /* title. Set 자료구조의 특성을 이해하고 HashMap을 이용할 수 있다. */

        /* comment. ★ Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징 ★
        *   1. 요소의 저장 순서를 유지하지 않는다.
        *   2. 같은 요소의 중복 저장을 허용하지 않는다
        *   (null 값도 하나의 null만 허용) */

        /* comment. HashSet 클래스
        *   Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        *   해시 알고리즘을 사용해서 검색 속도가 빠르다는 장점을 가지고 있다. */

        HashSet<String> hset = new HashSet<>(); // String 타입으로 HashSet 형성

        hset.add(new String("java")); // new String 안 써도 괜찮음.
        hset.add(new String("mysql"));
        hset.add(new String("jabc"));
        hset.add(new String("html"));
        hset.add(new String("css"));
        // 1. 저장 순서 유지하지 않음.
        System.out.println("hset = " + hset); // = [css, java, jabc, mysql, html]

        // 2. 중복된 값 허용 여부 확인.
        hset.add(new String("java")); // java가 이미 있으니까 중복 x
        System.out.println("hset = " + hset); // = [css, java, jabc, mysql, html]

        System.out.println("저장된 객체의 수 " + hset.size()); // 5
        System.out.println("mysql이 포함되어 있는지 확인 : " + hset.contains("mysql")); // true
                                                            // Auto Boxing (자동 형변환)
        System.out.println("mysql이 포함되어 있는지 확인 : " + hset.contains(new String("mysql"))); // true
                                                           // 원래는 Wrapper 통해서 바꿔주는데 굳이 안 써도 자동 박싱

        /* comment.
        *   Set은 저장 순서를 유지하지 않기 때문에 저장된 객체를 하나씩 꺼낼 방법이 없다. */

        /* title. 1. toArray() 메서드를 이용해 배열로 변경 후 반복문 사용 */
        // toArray → Object 클래스
        Object[] arr = hset.toArray(); // 자료형이 Object이므로 일치시켜주자.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]); // 0 : css, 1 : java ~~ 출력
        }

        /* index. 2. iterator() 반복자를 통한 목록화 연속 처리 */
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) { // hasNext()는 boolean형 → iter가 참이면 출력하겠다.
            System.out.println(iter.next());
        }
    }
}
