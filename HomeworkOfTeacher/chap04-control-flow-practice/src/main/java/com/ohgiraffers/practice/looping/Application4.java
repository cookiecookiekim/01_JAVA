package com.ohgiraffers.practice.looping;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */
        Application4 app4 = new Application4();
        app4.test4();
    }

    public void test4 () { // 보고 배꼈3. 복습 3번 해야 함. 몰겠3....
        Scanner scr = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scr.nextLine();

        for (int i = 0; i < str.length(); i++) { // String의 길이(개수)를 파악해줌.
            char ch = str.charAt(i); // i 위치에 있는 글자를 ch 형태로 반환
            System.out.println(ch);

        }
    }

}
