package com.ohgiraffers.section05.typecasting;

public class Application4 { // 24-08-27 (화) 3교시 이어서

    public static void main(String[] args) {

        /* title. 형변환 시 주의점을 이해하고 사용할 수 있다. */

        /* comment. 형변환 시 주의점은 데이터 손실이다! */

        /* index. 1. 의도하지 않은 데이터 손실 */
        int inum = 290; // 1bybe = -128 ~ 127
        byte bnum = (byte) inum;
        System.out.println("bnum = " + bnum);

        /* index. 2. 의도한 데이터 손실 */
        double height = 175.5;
        int floorHeight = (int) height;
        System.out.println("floorHeight = " + floorHeight);
    }
}
