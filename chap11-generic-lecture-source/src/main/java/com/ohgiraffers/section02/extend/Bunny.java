package com.ohgiraffers.section02.extend;
// 24-09-13 (금) 3교시
public class Bunny extends Rabbit { // Animal - Mammal - Rabbit을 상속받음


    @Override
    public void cry() { // 부모(Rabbit)의 메서드를 재정의 해보자.
        System.out.println("바니바니 바니바니 당근 당근");
    }
}
