package com.ohgiraffers.section01.extend;

public class FireCar extends Car { // 24-09-11 (수) 1~2교시 상속(extends) 적용하기.
    //Car 클래스의 정보를 일일이 다 적어야하는 불편함이 있지만 Car 클래스의 정보를 상속받으면 편하다.
    /* index. 1. extends 키워드를 통해 Car 클래스 상속 */

    public FireCar () { // 기본생성자

        /* comment.
        *   모든 생성자에는 가장 첫 줄에 supper()를 컴파일러가 자동 추가해준다.
        *   super() → 부모의 기본 생성자를 호출하는 구문.
        *   명시적, 묵시적 둘 다 가능. */
        super(); // (부모의 기본 생성자 호출) 써도 되고 안 써도 추가 된다.
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }

    /* index. 2. soundHorn() 메서드 오버 라이딩*/

    @Override
    public void soundHorn() {

        if (isRunning()) {
            System.out.println("빠아아아아아아아아아아아아아아아아아아아아아앙~!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 다 밀고 지나가기 전에 비켜주세요.");
        }
    }

    /* index. 3. 물뿌리는 기능 추가 */
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 분사합니다~!");
    }
}
