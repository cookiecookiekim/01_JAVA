package com.ohgiraffers.practice.looping;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int total = scr.nextInt();
        System.out.print("상품 가격을 입력하세요 : ");
        int price = scr.nextInt();

        int change = total - price;

        if (price < total) {
            if (change >= 50000) {

                System.out.println("50,000권 지폐 " + a + "장");

            } else if (change >= 10000) {
                System.out.println("10,000권 지폐 " + a + "장");

            } else if (change >= 5000) {
                System.out.println("5,000권 지폐 " + a + "장");

            } else if (change >= 1000) {
                System.out.println("1,000권 지폐 " + a + "장");

            } else if (change >= 500) {
                System.out.println("500권 지폐 " + a + "장");

            } else if (change >= 100) {
                System.out.println("100권 지폐 " + a + "장");

            } else if (change >= 50) {
                System.out.println("50권 지폐 " + a + "장");

            } else if (change >= 10) {
                System.out.println("10권 지폐 " + a + "장");
            }
        }

    }

}
/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
 *
 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고, 지폐외 동전을 구분하여 단위를 표기하세요.
 *
 * -- 입력 예시 --
 * 받으신 금액을 입력하세요 : 100000
 * 상품 가격을 입력하세요 : 22340
 *
 * -- 출력 예시 --
 * ============================
 * 50000원권 지폐 1장
 * 10000원권 지폐 2장
 * 5000원권 지폐 1장
 * 1000원권 지폐 2장
 * 500원권 동전 1개
 * 100원권 동전 1개
 * 50원권 동전 1개
 * 10원권 동전 1개
 * ============================
 * 거스름돈 : 77660원
 * */