package com.ohgiraffers.section03.practice;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        CarRacer racer = new CarRacer();
        // 사용자 : 시동 걸기, 엑셀 밟기, 브레이크 밟기, 시동 끄기

        // 카레이서 : 시동 걸기, 엑셀 밟기, 브레이크 밟기, 시동 끄기
        // 조건 : 시동이 걸려있는 상태에서 시동을 걸 수 없다 / 시동이 꺼진 상태에서 브레이크 밟을 시 시동을 다시 건다. /

        // 카 : 시동 걸리기, 속력 올리기, 속력 줄이기, 시동 끄기
        // 조건 : 시동이 걸리지 않았다면 시동 걸어야한다 / 시동이 걸리지 않았다면 속력을 올릴 수 없다 /

        Scanner scr = new Scanner(System.in);
        System.out.println("-----------------HiMedia 카레이싱 =================");
        System.out.println("1. 시동 걸기");
        System.out.println("2. 전진");
        System.out.println("3. 정지");
        System.out.println("4. 시동 끄기");
        System.out.println("9. 프로그램 종료");

        racer.car.isOn=false;

        while (true) {
            System.out.print("메뉴를 선택해 주세요 : ");
            int no = scr.nextInt();

            switch (no) {
                case 1 :
                    racer.turnOn();
                    break;
                case 2 :
                    racer.start();
                    break;
                case 3 :
                    racer.stop();
                    break;
                case 4 :
                    racer.turnOff();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
            if (no == 9) {
                break;
            }

        }

    }
}
