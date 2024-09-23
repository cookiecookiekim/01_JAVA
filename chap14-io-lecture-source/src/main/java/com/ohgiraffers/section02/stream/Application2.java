package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 { // 24-09-23 (월) 2교시 입출력 (파일 읽기2)
                            // (파일 안 깨지게 읽는 거 연습)

    public static void main(String[] args) {

        /* title. FileReader를 이해하고 사용할 수 있다. */

        /* comment. FileInputStream과 사용법은 거의 동일하다.
        *   하지만 큰 차이점은 byte 단위가 아닌 character 단위로 읽어 들이는 부분이
        *   가장 큰 차이점이다. */

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

            int value;
            while ((value = fr.read()) != -1) {
                System.out.println((char)value); // 깨지지 않고 안^녕^하^세^요 출력
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr != null) { // 만약 통로가 열려 있다면
                try {
                    fr.close(); // 메모리 효율을 위해 닫아주기 습관화 해야한다.
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

        }


    }
}
