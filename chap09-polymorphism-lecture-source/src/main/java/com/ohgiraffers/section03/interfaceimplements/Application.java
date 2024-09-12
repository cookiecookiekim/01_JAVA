package com.ohgiraffers.section03.interfaceimplements;

public class Application { // 24-09-12 (목) 2~3교시 인터페이스

    public static void main(String[] args) {

        /* title. 인터페이스(interface)에 대해 이해할 수 있다. */

        /* comment.
        *   인터페이스도 추상클래스와 마찬가지로 클래스의 변형체.
        *   추상 메서드와 상수 필드만 가질 수 있는 특징이 있다. */

        /* comment. 인터페이스 사용 목적
        *   1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성 부여
        *   2. 자바가 가진 단일 상속의 단점을 극복할 수 있다. (다중 상속 가능) */

        // 인터페이스도 인스턴스를 생성할 수 없다.
//        InterfaceProduct interfaceProduct = new InterfaceProduct();

        // 다형성을 이용해서 자식 타입의 인스턴스로 사용할 수 있다.
        InterfaceProduct interfaceProduct = new Product();

        // 동적 바인딩을 통해 오버라이딩 된 메서드로 호출된다.
        interfaceProduct.nonStaticMethod();
    }
}
