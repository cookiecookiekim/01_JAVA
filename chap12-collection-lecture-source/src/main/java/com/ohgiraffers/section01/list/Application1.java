package com.ohgiraffers.section01.list;

import java.util.*;

public class Application1 {

    public static void main(String[] args) { // 24-09-19 1~2교시 컬렉션 ★ (매우 중요) ★

        /* title. 컬렉션 프레임 워크에 대해 이해할 수 있다. */

        /* comment.
        *   java에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을
        *   쉽고 효과적으로 처리할 수 있도록 표준화된 방법을 제공하는
        *   클래스들의 집합을 의미한다.
        *   즉, 누군가가 만들어둔 데이터를 효율적으로 저장하는 자료구조와
        *   알고리즘을 우리가 사용하는 것을 의미한다. */

        /* comment.
        *   Collection 3가지의 인터페이스 중 한가지를 상속받아 구현
        *   1. List 인터페이스
        *    - 순서가 있는 데이터 집합으로 데이터 중복 저장 허용 (외우기)
        *    - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
        *   2. Set 인터페이스
        *   - 순서가 없는 데이터 집합으로 데이터 중복 저장을 허용하지 않음.
        *   - HashSet, TreeSet 등이 있다.
        *   3. Map 인터페이스
        *   - 키와 값 한 쌍으로 이루어지는 데이터 집합
        *   - key는 위에서 나온 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고,
        *    key 값은 중복을 허용하지 않는다. (중요)
        *    key는 중복이 될 수 없지만, key 값이 다르다면 value는 중복이 가능하다.
        *   - HashMap, TreeMap, HashTable, Properties 등이 있다. */

        /* comment.
        *   1. 이번 클래스에서는 List 계열 다룰 예정
        *   ArrayList(매우 중요, 매우 많이 사용 됨.)
        *   - 가장 많이 사용되는컬렉션 클래스
        *   - 내부적으로 배열을 이용하여 요소를 관리하며,
        *   인덱스를 이용해 배열의 요소에 빠르게 접근할 수 있다. */

        /* comment.
        *   ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
        *   배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다.
        *   ArrayList는 이러한 단점을 해결하기 위해
        *   - 크기 변경, 요소의 추가, 삭제, 정렬 기능을 미리 메서드로 만들어서
        *   제공해 주고 있다. */

        // ArrayList 인스턴스 생성 시 내부적으로 10칸짜리 배열 생성
        ArrayList alist = new ArrayList();

//        List list = new List(); // 생성 불가, 왜?
        // List 따라가보면 얘는 Interface로 나온다.
        // Interface는 생성자를 가질 수 없기에 직접적으로 인스턴스 생성 불가능

        // 그럼 어떻게 해야할까?
        // List 인터페이스를 상속받은 클래스로 인스턴스를 생성하면 된다.
        List list = new ArrayList(); // List를 상송받은 ArrayList 클래스로 인스턴스 생성
        // 이 과정이 다형성이다.

        /* comment.
        *   다형성을 적용해서 상위 레퍼런스로 ArrayList 객체를 만들 수 있다.
        *   List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        *   레퍼런스 타입은 List로 하는 것이 더 유연한 코드를 작성하는 방법이다. */

        // list에 값 추가하는 방법 → add
        alist.add("apple");
        alist.add(123);
        alist.add(45.67);
        alist.add(new Date());
        // () 값에 객체를 넣어줘야 하지만 리터럴 값을 넣어도 이상이 없다, 왜?
        // auto-boxing 처리가 되기 때문에
        // int, double 등 기본(원시값) → Integer, Double

        System.out.println("alist = " + alist); // 순서대로 넣은 값 그대로 출력
        // alist = [apple, 123, 45.67, Thu Sep 19 10:58:30 KST 2024]
        // 하지만 주소 값이 출력이 돼야 하지만 값이 나오고 있다, 왜?
        //toString 메서드가 Overriding되어 있기 때문

        System.out.println("alist의 크기 : " + alist.size()); // 4 출력
        // ArrayList의 장점 : 인덱스로 관리한다 → for문(반복문) 사용 가능하다.

        for (int i = 0; i < alist.size(); i++) {
            System.out.println(i + "번 째 인덱스의 값 : " + alist.get(i));
            // 흔한 배열처럼 [ ] 로 접근하지 않고, get() 메서드를 통해 접근한다.
        }

        // 데이터의 중복저장 허용 확인 해보자
        alist.add("apple");
        System.out.println("alist = " + alist);
        // alist = [apple, 123, 45.67, Thu Sep 19 10:58:30 KST 2024, apple] 출력

        // 원하는 인덱스 위치에 값 추가해 보자
        alist.add(1, "banana"); // 1번 자리에 banana를 넣겠다.
        System.out.println("alist = " + alist); // 한 칸씩 밀려, 값이 삽입됨.
        // alist = [apple, banana, 123, 45.67, Thu Sep 19 11:01:21 KST 2024, apple] 출력

        // 원하는 인덱스 위치에 값을 삭제해보자
        alist.remove(1); // 1 번째의 값을 삭제하겠다.
        System.out.println("alist = " + alist); // banana 삭제
        // alist = [apple, 123, 45.67, Thu Sep 19 11:03:33 KST 2024, apple] 출력

        // set을 이용하여 지정된 위치에 값 수정 해보자
        alist.set(1, Boolean.valueOf(true)); // Wrapper 클래스로 boolean 값을 Boolean 타입으로 바꾸기
        System.out.println("alist = " + alist);
        // alist = [apple, true, 45.67, Thu Sep 19 11:06:01 KST 2024, apple] 출력

        /* comment.
        *   모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 지정되어 있다.
        *   따라서 <> 내부에 타입을 지정하면 해당 공간은 지정한 타입 외에는
        *   사용할 수 없게 된다. */
        List<String> stringList = new ArrayList<>(); // String 타입으로 모두 변환(가둬)된다.
        stringList.add("apple");
//        stringList.add(123); // 이미 <String>으로 설정했기 때문에 정수는 안 됨
        // → 제네릭 문법으로 타입 지정 시, 지정 타입 외에 타입은 저장 불가.
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");
        // 제네릭 타입 지정 시 장점 : 잘못 드갈 때 컴파일 에러로 즉시 확인 (안전성 보장)
        System.out.println("stringList = " + stringList);
        // stringList = [apple, orange, banana, mango, grape] 출력

        /* comment. 정렬 기능도 사용 가능하다.
        *   저장 순서를 유지하고 있는 stringList를 오름차순 정렬 */
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);
        // stringList = [apple, banana, grape, mango, orange] 출력

        //////////////////////////////////////////////////////////////////////////

        /* comment.
        *   복잡하긴 하지만 내림차순 정렬도 가능하다. (알아두면 좋다..)
        *   ArrayList에서는 내림차순 정렬을 제공하지 않아,
        *   List의 또 다른 구현체인 LinkedList에서 제공한다. */

        // List<String> stringList = new LinkedList<>(stringList);
        stringList = new LinkedList<>(stringList);
        // ArrayList → LinkedList로 바꿔준 거.

        /* comment. Iterator(반복자)란?
        *   Colletction 인터페이스의 Iterator() 메서드를 이용하여 인스턴스 생성 가능
        *   컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용
        *   반복자라고 불리우며, 반복문을 통해서 값을 하나씩 꺼내기 위한 용도이다.
        *   인덱스로 관리되는 컬렉션이 아닌 경우는 반복문을 사용해서 요소에 접근할 수 었기
        *   때문에 인덱스를 사용하지 않고도 반복문을 쓰기 위한 목록을 만들어 주는 역할.
        *   hasNext() : 다음 요소를 가지고 있으면 true, 없으면 false
        *   next() : 다음 요소 반환 */

        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

        /* comment.
        *   dIter라는 레퍼런스 변수에 내림차순한 결과를 담았기 때문에
        *   다시 한 번 ArrayList로 옮길 것이다. */

        List<String> descList = new ArrayList<>();

        while (dIter.hasNext()) { // Iterator는 알아두면 좋다.
            descList.add(dIter.next()); // 규칙이 없을 때 반복하고 싶을때 사용
        }                              // hasNext(), next()

        System.out.println("descList = " + descList);
        // descList = [orange, mango, grape, banana, apple] 출력
    }
}
