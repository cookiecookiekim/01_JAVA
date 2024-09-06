package com.ohgiraffers.section03.practice;

public class Car { // private 하자
    boolean isOn;
    int speed;

    public void isOn () {
        if (isOn) {
            System.out.println("시동이 안 걸렸습니다.");
        } else {
            isOn = true;
            System.out.println("시동이 걸렸습니다.");
        }

    }
    
    public void go() {
        if (isOn) {
            if (speed < 0) {
                System.out.println("시동은 걸려 있으나, 속도가 0km/h 입니다.");
            } else {
                speed += 10;
                System.out.println("속도가 10km/h 씩 증가합니다. 현재 속도는 " + speed + " 입니다." );
            }
        }
    }

    public void enStop() {
        if (speed > 0) {
            System.out.println("10km/h 씩 감소합니다. 속도를 줄이세요.");
            speed -= 10;
            System.out.println("현재 속도는 " + speed + " 입니다.");
        } else {
            System.out.println("속도가 0km/h 입니다");
        }
    }

    public void enOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("시동을 종료할 수 없습니다. 완전히 멈춰주세요.");
            } else {
                isOn = false;
                System.out.println("속도가 멈췄습니다. 시동을 종료하겠습니다.");
            }
        } else { // isOn = false;를 여기 넣어서 코드가 꼬였었따.
            System.out.println("이미 시동을 종료하였습니다.");
        }
    }
}
