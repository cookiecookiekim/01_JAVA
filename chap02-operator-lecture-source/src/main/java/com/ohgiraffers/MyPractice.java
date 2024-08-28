package com.ohgiraffers;

public class MyPractice {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte)i;
        ch = (char)b;
        System.out.println(ch);
        System.out.println(b);
        short s = (short)ch;
        float f = (float)l;
        i = (int)ch;


    }
}
