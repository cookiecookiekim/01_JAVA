package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 { // 24-09-23 (월) 2교시 입출력 (파일 읽기1)
                            // (한글 읽어올 때 깨지는 거 확인하기)

    public static void main(String[] args) {

        /* title. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 inputStream에 대해 알 수 있다. */

        /* comment. 입출력 스트림 개요
        *   프로젝트를 만들거나, 프로그래밍 할 때, 많은 종류의 데이터를 다뤄야 한다.
        *   하지만 데이터는 프로그램 내부에 있을 수도 있지만, 외부에서 가져와 사용할 때도 있다.
        *   또한 프로그램에서 만든 데이터를 외부 파일로 출력할 경우도 존재한다. */

        /* comment. 외부 데이터란?
        *   프로그램 외부에 존재하는 모든 데이터를 의미한다.
        *   하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수도 있다.
        *   따라서 해당하는 데이터를 가져오거나 내보낼 때 가장 먼저 해야할 일은
        *   ★ 자바 프로그램과 외부 데이터를 연결하는 것 ★
        *   따라서 연결하는 길을 스트림(Stream)이라고 한다.
        *   또한 스트림은 단 방향이다.
        *   즉 데이터를 읽어오기 위한 통로는 입력 스트림
        *   데이터를 내보내기 위한 통로는 출력 스트림
        *   --
        *   그 중 InputStream과 Reader는 데이터를 읽어오기 위한 스트림
        *   OutputStream과 Writer는 데이터를 출력하기 위한 스트림 */

        // 파일을 읽어오는 객체
        FileInputStream fin = null; // FileInputStream import

        try {

            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            // read() : 파일에 기록된 값을 순차적으로 읽어오고 더이상 읽을 데이터가 없으면 -1 값을 반환

            int value;

            // 한글 1글자는 3byte 이기 때문에 1byte씩 읽어오면 글자가 깨지게 된다.
            while ((value = fin.read()) != -1) { // 읽을 데이터가 있으면 반복문을 실행하겠다.
                System.out.println(value);
                System.out.println((char) value); // 깨져서 출력 1byte씩 읽기 때문
            }

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            /* comment.
            *   finally → try/catch 블럭에서 오류를 잡더라도 실행시키는 영역
            *   finally 블럭에서 사용한 자원을 닫아준다. */

            // 생성된 파일을 닫아주기
            if (fin != null) { // 통로가 만들어 졌다면
                /* comment.
                *   사용한 연결통로를 닫아주는 메서드 → close()
                *   닫아주는 이유는?
                *   1. 장기간 실행중인 프로그램에서 스트림을 닫지 않으면
                *   리소스에서 메모리 누수(leak)가 발생하게 된다.
                *   2. close는 반드시 마지막에 작성해야 한다.*/
                try {
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
