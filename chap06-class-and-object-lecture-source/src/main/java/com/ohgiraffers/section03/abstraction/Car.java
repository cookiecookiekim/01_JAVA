package com.ohgiraffers.section03.abstraction;

public class Car {

    // 관리해야 할 상태 : 속력 , 시동상태
    private boolean isOn; // 시동 상태
    private int speed; // 현재 속력

    public void startUp() {
        if (isOn) { // ← 현 상태는 false이다. 이유는 boolean 타입의 초기값은 false 이기 때문
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 출발 준비 완료!!");
        }
    }

    public void go() {
        if (isOn) { // ← 현 상태는 true이다. 이유는 startUp에서 시동이 걸렸기 때문에
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 : " + this.speed + "km/h 입니다.");
        } else {
            System.out.println("차의 시동을 확인해 주세요.");
        }

    }

    public void stop() {
        if (isOn) { // 시동이 걸려있고, 달리는 상태인 경우만 멈출 수 있다.
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("끼이이익~~ 차가 멈췄습니다.");
            } else {
                System.out.println("이미 차의 속도는 0km/h 입니다.");
            }
        } else { // 시동이 이미 꺼져 있을 때
            System.out.println("이미 차의 시동이 걸려있지 않습니다.");
        }

    }

    public void turnOff() { // 시동이 걸려 있따면 시동을 끄고 이미 꺼져있다면 끌 수 없고, 움직인다면 브레이크 먼저
        if (isOn) {
            if (this.speed > 0) { // 해당 메서드에 매개변수가 없다면 this 굳이 안 써도 된다 (전역변수니까)
                System.out.println("달리는 상태에서 시동을 끄면 큰일납니다.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끄겠습니다. 다시 운행하려면 시동을 켜세요");
            }

        } else {
            System.out.println("이미 시동이 꺼져있는 상태입니다.");
        }
    }
}
