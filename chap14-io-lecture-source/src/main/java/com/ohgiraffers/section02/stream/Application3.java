package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 { // 24-09-23 (월) 2교시 입출력 (파일 내보내기 byte 단위)

    public static void main(String[] args) { // 처음에 testOutputStream.txt 파일에 입력하지 않고 시작

        /* title. FileOutputStream을 이해할 수 있다. */

        /* comment. FileOutputStream이란?
        *   프로그램에서 발생한 데이터를 외부 파일로 보내기 위한 용도의 스트림.
        *   바이트(byte) 단위로 데이터를 처리한다. */

        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
            // write(); 메서드 : 전달인자로 넣은 값을 해당하는 파일에 전달함.
            fout.write(97); // 유니 코드로 97은 a
                               // → 이 상태로 run 돌리면 testOutputStream에 a가 자동 입력됨.
            byte[] barr = new byte[] {98, 99, 100, 101, 10, 103}; // b c d e 개행 g
            fout.write(barr); // 아까 a 옆에 차례료 bcde 입력되고, 줄바꿔서 g 입력
                             // 10은 개행(줄바꿈)을 의미한다.
            fout.write(barr, 1, 3); // 출력 시, testOutputStream에 2번째열 g 옆에 cde 입력됨
                        // off : 1 → 배열의 1번 인덱스 / len 3 : 길이 3만큼 출력

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally { // 자원 닫아줌
            if (fout != null) { // 만약 통로가 열려 있다면
                try {
                    fout.close(); // 닫아주겠다.
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
