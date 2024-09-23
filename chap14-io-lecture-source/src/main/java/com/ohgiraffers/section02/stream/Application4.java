package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 { // 24-09-23 (월) 3교시 입출력 (파일 내보내기 char 단위)

    public static void main(String[] args) {

        /* title. FileWriter를 이해하고 사용할 수 있다. */

        /* comment. 프로그램의 데이터를 내보내기 위한 스트림
        *   FileOutputStream과 다른 점은 글자(Character)
        *   단위로 데이터를 처리한다. */

        FileWriter fw = null;

        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
            fw.write(97);
            fw.write('A');
            fw.write(new char[]{'a','p','p','l','e'});
            fw.write("하이미디어아카데미");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { // 자원 닫아주기
            if (fw != null) { // 만약 열려 있다면
                try {
                    /* comment. close()메서드는 닫기 전에
                    *   flush()라는 메서드를 실행시키고 닫게 된다.
                    *   flush란 통로에 남아있는 잔류 데이터를 밀어주는 역할. */
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
