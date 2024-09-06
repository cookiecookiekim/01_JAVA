package com.ohgiraffers.section03.abstraction;

public class CarRacer {// 24-09-06 (금) 6교시 클래스 (abstraction - 추상화)

    private Car car = new Car(); // 속성 : 자동차
    // class도 자료형이다.... 고로 private 선언 가능.

    public void startUp () {
        car.startUp();
    }

    public void stepAccelator () {
        car.go();
    }

    public void stepBreak () {
        car.stop();
    }

    public void turnOff () {
        car.turnOff();
    }
}
