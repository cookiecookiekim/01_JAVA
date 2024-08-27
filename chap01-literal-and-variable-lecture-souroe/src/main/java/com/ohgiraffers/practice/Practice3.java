package com.ohgiraffers.practice;

public class Practice3 { // 24-08-27 실습문제 3 (실수 형태로 저장한 후, 정수 형태로 출력하기)

    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double en = 70.8;

        int sum = (int) (korean + math + en);
        int avg = (int) (korean + math + en)/3;

        System.out.println("\n" + "========== 출력 예시 ===========" + "\n");
        System.out.println("총 점 : " + sum);
        System.out.println("평 균 : " + avg);


    }
}
