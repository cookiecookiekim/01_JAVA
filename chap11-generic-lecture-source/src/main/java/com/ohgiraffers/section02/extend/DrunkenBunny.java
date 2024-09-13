package com.ohgiraffers.section02.extend;
// 24-09-13 (금) 3교시
public class DrunkenBunny extends Bunny {  // Animal - Mammal - Rabbit - Bunny를 상속받음


    @Override
    public void cry() { // Bunny의 cry 메서드를 재정의
        System.out.println("봐니봐뤼 바닏밪니...당느큰 당은....");
    }
}
