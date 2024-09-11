package com.ohgiraffers.section01.polymorphism;

public class Frog extends Animal { // 24-09-11 (수) 5~6교시 클래스 - 다형성
                                // 부모 매서드를 가져와서 재정의 및 기능 추가 했음.

    @Override
    public void 먹기() {
        System.out.println("개구리가 식탁에 앉아 햄버거를 먹습니다.");
    }

    @Override
    public void 뛰기() {
        System.out.println("개구리가 폴~~짝 뛰기 시작합니다.");
    }

    @Override
    public void 울부짖기() {
        System.out.println("개굴개굴");
    }

    /* comment. 자식은 부모의 메서드 재정의 뿐 아니라 본인의 기능도 가질 수 있다. */
    public void 낼름공격 () {
        System.out.println("개구리가 혓바닥으로 세게 내리칩니다.");
    }
}
