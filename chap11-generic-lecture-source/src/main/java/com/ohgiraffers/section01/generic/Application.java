package com.ohgiraffers.section01.generic;

public class Application { // 24-09-13 (금) 2~3교시 - 제네릭

    public static void main(String[] args) {

        /* title. 제네릭(generic)에 대해 이해할 수 있다. */

        /* comment.
        *   제네릭은'일반적인'이라는 사전적 의미를 갖는다.
        *   자바에서 제네릭이란 데이터 타입을 일반화 한다는 의미. */

        /* comment.
        *   제네릭은 클래스나 메서드에서 사용할 내부 데이터 타입을
        *   컴파일 시점에 지정하는 방법을 말한다.
        *   컴파일 시, 미리 타입 검사를 실행하게 되면 클래스나 메서드
        *   내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며,
        *   반환값에 대한 타입 변환 및 타입 검사에 대한 코드 생략 가능. */

        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        // T를 Integer로 쓸 거야~ 하면 GenericTest의 T는 Integer 형태로 바뀜
        gt1.setValue(10); // int 자료형이지만 알아서 Integer 타입이 됨.
        System.out.println("gt1.getValue() : " + gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setValue("김규남"); // ↑ <String> 타입으로 제한을 걸은 것.
        System.out.println("gt2.getValue() : " + gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        /* comment.
        *   JDK 7버전부터 타입 선언 시 타입 변수를 작성하면
        *   생성자 쪽에서는 타입을 생략해도 된다. */
    }
}
