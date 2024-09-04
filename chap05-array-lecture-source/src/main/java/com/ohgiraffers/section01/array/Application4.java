package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 { // 24-09-04 4교시 배열 이어서... 예시 문제 풀이..

    public static void main(String[] args) {

        /* title. 배열을 사용한 예시 (1) */
        /* index.
            문제. 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램 제작 */

        Scanner scr = new Scanner(System.in);
        int[] scores = new int[5]; // 5개의 공간 크기

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + " 번 째 학생의 자바 점수를 입력해 주세요 : "); // 개발자가 아닌 사람은 0부터 시작하는 숫자가 어색하기 때문에
            scores[i] = scr.nextInt();
        }
        double sum = 0.0;
        double avg = 0.0;
        // 합계는 모든 배열의 인덱스 공간에 들어있는 값을 더해주면 된다.
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

        }
            avg = sum / scores.length; // 분모에 5를 쓰기 보다는 배열의 길이를 사용해야 한다.

        System.out.println("5명 점수의 합계 : " + sum);
        System.out.println("5명 점수의 평균 : " + avg);
    }

}
