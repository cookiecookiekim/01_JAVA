package com.ohgiraffers.section04.use;

// 경운기는 차의 기본적인 기능(가고,서고) 할 수 있지만
// 경적을 울리는 기능 없다.

public class FarmCar extends Car { // 24-09-12 (목) 3교시 인터페이스 예시
    @Override
    public void go() {
        System.out.println("경운기가 털털털털 움직입니다...");
    }

    @Override
    public void stop() {
        System.out.println("경운기가 멈춥니다...");
    }
}
