package com.ohgiraffers.section01.generic;

public class GenericTest <T> { // 24-09-13 (금) 2~3교시 - 제네릭

    /* comment.
    *   제네릭 설정은 클래스 선언부 마지막 부분에
    *   다이아몬드연산자(<>)를 이용하여 작성한다. */

    /* comment.
    *   다이아몬드 연산자 내부에 작성한 T는 타입 변수라고 부른다.
    *   타입 변수를 자료형 대신 사용할 것인데,
    *   가상으로 존재하는 타입이며, T가 아니라 다른 영문자를
    *   사용해도 상관없다.
    *   하지만 type의 의미를 가지기 때문에 T를 많이 쓴다.
    *   또한 여러개의 타입 변수를 작성할 때에는 나열 연산자(,)를
    *   이용해서 여러개 기술 할 수 있다. */

    /* comment. 사용하는 쪽에서는 우리가 만든 제네릭 클래스 사용 시,
    *   <T> ← 대신에 <우리가 정한 자료형>
        실제 사용할 타입을 타입 변수 자리에 맞춰서 넣어주면,
    *   컴파일 시점에 타입이 결정되게 됨. */

    // 아직 타입이 정해지지 않은 상태 T → 가상의 자료형
    private T value;

    // getter/setter 작성 시에도 가상의 타입(T)사용 가능.
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
