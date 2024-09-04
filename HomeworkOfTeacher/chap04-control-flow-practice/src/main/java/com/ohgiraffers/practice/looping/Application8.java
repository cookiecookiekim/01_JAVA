package com.ohgiraffers.practice.looping;

import java.util.Random;
import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /* 1부터 100 사이의 난수를 발생시키고
         * 정수를 입력 받아서 입력받은 정수가 발생한 난수보다 큰 경우 "입력하신 정수보다 큽니다."를,
         * 입력받은 정수보다 난수가 작은 경우 "입력하신 정수보다 작습니다."를 출력하며
         * 입력한 정수와 난수와 같은 경우가 될 때까지 난수 맞추기를 반복하는 프로그램을 만드세요.
         *
         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. n회 만에 정답을 맞추셨습니다."라고
         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
         * 첫 회부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
         *
         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하세요.
         *
         * -- 프로그램 예시 --
         * 정수를 입력하세요 : 5
         * 입력하신 정수보다 작습니다.
         * 정수를 입력하세요 : 3
         * 입력하신 정수보다 큽니다.
         * 정수를 입력하세요 : 4
         * 정답입니다. 3회만에 정답을 맞추셨습니다.
         * */
        Application8 app8 = new Application8();
        app8.test8();
    }

    public void test8 () {
        Scanner scr = new Scanner(System.in);
        Random rd = new Random();
        int nan = rd.nextInt(100) + 1;
        System.out.println("난수는 " + nan + "입니다.");
        int count = 0;

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            count++;
            int num = scr.nextInt();

            if (num > nan) {
                System.out.println("입력하신 정수가 난수보다 큽니다.");
            } else if (num < nan) {
                System.out.println("입력하신 정수가 난수보다 작습니다.");
            } else {
            break;
            }

        }
        System.out.println("정답입니다. " + count + " 회 만에 정답을 맞추셨습니다.");

    }

}
