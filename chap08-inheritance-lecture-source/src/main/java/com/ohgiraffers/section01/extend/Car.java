package com.ohgiraffers.section01.extend;

public class Car { // 24-09-11 (수) 1~2교시 상속(extends) 적용하기.

    /* 멤버 → 필드 , 메서드 */

    // protected : 접근제한자로 같은 페키지 내에 있는 클래스에서 사용 가능
    protected boolean runningStatus; // 달리고 있는 지 여부 // 최초 기본값은 false

    public Car () { // 호출 흐름 파악을 위한 기본 생성자
    System.out.println("Car 클래스의 기본 생성자 호출됨...");
    }

    /* run() : 달리는 기능, soundHorn() : 경적을 울리는 기능
    *  isRunning() : 주행 상태를 반환하는 기능
    *  stop() : 멈추는 기능 */

    public void run () {
        runningStatus = true; // 최초 기본값이 false이므로 true로 바꿔준다.
        System.out.println("자동차가 달려갑니다.");
    }

    public void soundHorn () { // 자동차는 주행중인 상태일때만 경적을 울릴 수 있다.
        if (runningStatus) { // runningStatus가 true일 때.
            System.out.println("빵~ 빵~");
        } else {
            System.out.println("주행중이 아니기 때문에 경적을 울릴 수 없습니다.");
        }
    } // → override를 이용하여 부모(Car)가 가지고 있는 콘솔창을 FireCar에서 수정하여
      // Car 클래스의 soundHorn이 아닌, FireCar 클래스의 soundHorn이 출력.

    protected boolean isRunning () { // 접근제한자 사용 (자동차가 스스로 작동할 수 있도록 설정)

        return runningStatus; // 주행 상태를 반환
    }

    public void stop () {

        runningStatus = false;
        System.out.println("자동차가 멈춥니다...");

    }

}
