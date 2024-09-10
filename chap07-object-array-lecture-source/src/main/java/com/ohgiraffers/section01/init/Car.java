package com.ohgiraffers.section01.init;

public class Car { // 24-09-10 (화) 4교시 클래스 - 객체 배열

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void carMaxSpeedInfo() {
        System.out.println(modelName + "이(가) 최고속도 " + maxSpeed + "km/h로 달려갑니다.");
    }
}
