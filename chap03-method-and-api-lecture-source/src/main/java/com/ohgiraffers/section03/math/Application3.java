package com.ohgiraffers.section03.math;

import java.util.Random; // 24-08-30 (금) 3교시 메서드 이전 클래스와 같이 난수 생성 연습인데 이번 클래스는 조금 더 특화된 클래스.
                            // '(int)(Math.random() * 구하려는 난수의 개수) + 구하려는 난수의 최소값' 보다 'random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최소값'가 더 간소

public class Application3 {

    public static void main(String[] args) {

        /* title. java.util.random 클래스를 사용해서 난수 발생 */

        Random random = new Random();
        /* comment. random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최소값; */
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        // 1 ~ 10
        int randomNumber2 = random.nextInt(10);
        System.out.println("randomNumber2 = " + randomNumber2);
        // 10 ~ 15
        int randomNumber3 = random.nextInt(6);
        System.out.println("randomNumber3 = " + randomNumber3);
        // -127 ~ 128
        int randomNumber4 = random.nextInt(256);
        System.out.println("randomNumber4 = " + randomNumber4);


    }
}
