package com.ohgiraffers.level02.normal;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 10까지 중 첫 번째 값을 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("1부터 10까지 중 두 번째 값을 입력하세요 : ");
        int second = sc.nextInt();

        RandomMaker rm = new RandomMaker(); // 부를 클래스 준비 상태

        int random = rm.randomNumber(first, second);
        System.out.println("반환 할 수는 " + random + " 입니다.");

        System.out.print("Scissors, rock, Paper 중 한 가지를 반환하세요 : ");
        sc.nextLine();
        String str = sc.nextLine();

        String rps = rm.rockPaperScissors("Scissors", "rock", "Paper");
        System.out.println("반환 값은 " + rps + " 입니다.");

        String result = rm.tossCoin();
        System.out.println("동전의 앞 면, 뒷 면 중 반환 될 면은 : " + result);

    }

}
