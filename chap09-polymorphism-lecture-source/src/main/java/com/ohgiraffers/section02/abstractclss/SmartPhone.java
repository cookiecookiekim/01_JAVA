package com.ohgiraffers.section02.abstractclss;

public class SmartPhone extends Product{ // 24-09-12 (목) 1 교시 추상 클래스


    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 오버라이딩 강제화 된 abstMethod() 호출됨...");
    }

    // 상속 복습 : 부모의 것 뿐만 아니라 자기만의 기능을 가질 수 있다.
    public void childMethod() {
        System.out.println("SmartPhone 클래스의 childMethod() 호출됨...");
    }

}
