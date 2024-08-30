package com.ohgiraffers.section03.math;

public class Application2 {// 24-08-30 (금) 3교시 메서드 남들이 만들어 놓은 Math 메서드를 호출, 이어서

    public static void main(String[] args) {

        /* title. random() 사용해서 사용자 지정 범위의 난수 발생 */

        /* comment. 난수의 활용
        *   math.random()을 이용하게되면 0부터 1전까지의 실수 값을 반환해 준다. */

        /* comment. 원하는 범위의 난수를 구하는 공식 (int)(Math.random() * 구하려는 난수의 개수) + 구하려는 난수의 최소값 */
        /* index. 1. 0 ~ 9까지의 난수 발생 */
        int random1 = (int)(Math.random() * 10) + 0;
        System.out.println("random1 = " + random1);

        // 1 ~ 10
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        // 10 ~ 15
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        // -128 ~ 127
        int random4 = (int)(Math.random() * 256) - 128;
        System.out.println("random4 = " + random4);

    }
}
