package com.ohgiraffers.section01.extend;

public class FarmCar extends Car { // 24-09-11 (수) 2교시 상속(extends) 추가 적용하기.

    public FarmCar () {
        System.out.println("FarmCar의 기본 생성자 호출됨...");
    }

    @Override // 단축기 : ctrl + o
    public void run() {
        System.out.println("털털털털털...");
    }

    @Override
    public void soundHorn() {
        System.out.println("경적을 울리고 싶으나 경적 기능이 없습니다.");
    }

    @Override
    public void stop() {
        System.out.println("푸슝...");
    }
}
