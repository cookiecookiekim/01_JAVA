package com.ohgiraffers.section03.practice;

public class CarRacer {
    Car car = new Car();


    public void turnOn() {
        car.isOn();
    }

    public void start() {
        car.go();
    }

    public void stop() {
        car.enStop();
    }

    public void turnOff() {
        car.enOff();
    }
}
