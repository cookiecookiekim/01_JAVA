package com.ohgiraffers.practice.looping;

public class Application5 {

    public static void main(String[] args) {

        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */
        Application5 app5 = new Application5();
        app5.test5();
    }

    public void test5 () { // 아스키 코드 이용, 이거 복습 더 해야함.

        for (int i = 97; i < 123; i++) {
        char ch = (char) i;
            System.out.print(ch);
        }
        System.out.println(); // 줄 띄기
    }

}
