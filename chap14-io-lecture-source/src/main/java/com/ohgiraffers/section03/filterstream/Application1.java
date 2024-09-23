package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 { // 24-09-23 (월) 3교시 입출력 (기능이 추가된 입출력)

    public static void main(String[] args) { // 보조(필터) 스트림 (성능 향상)

        /* title. BufferedWriter와 BufferedReader에 대해 이해할 수 있다. */

        /* comment. io(입출력) 챕터에서 스트림은 기본 스트림(section01, section02)과
        *   필터 스트림으로 분류할 수 있다.
        *   기본 스트림은 외부 데이터에 직접 연결하는 스트림이고,
        *   필터 스트림은 외부 데이터에 직접 연결하는 것이 아닌,
        *   기본 스트림에 추가로 사용할 수 있는 스트림이다.
        *   - 사용 목적 : 성능 향상
        *   - 사용 방법 : 생성자 쪽에 매개변수로 다른 스트림을 전달한다. */

        BufferedWriter bw = null; // testBuffered.txt파일에 데이터를 전달하겠다. (내보내겠다)
        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            // 기본 스트림 사용할건데 보조(필터)스트림에 전달 → 기존 통로는 유지하되 성능이 추가된다.

            bw.write("안녕하세요\n"); // \n → 개행 문자
            bw.write("반갑습니다ㅎㅎ\n");
            // 데이터가 가득 차지 않아서, 출력 시 testBuffered.txt에 해당 문구 생성이 안 됨

            /* comment. 보조 스트림 사용 시 주의할 점
            *   데이터가 가득 차지 않은 상태에서는 강제로 내보내기(flush)를 해줘야 한다. */
            bw.flush(); // flush로 강제로 밀어주고 출력하니 그제서야 출력이 됨.
            // 근데 finally(닫을 때) 알아서 강제로 밀어주므로 중간중간 활용하는 용도로 사용하면 된다.

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) { // 통로가 존재한다면
                try {
                    bw.close(); // 닫아 주겠다~
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* comment. 입력한 데이터 BufferedReader로 읽어 들이기 */
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            /* comment. 읽어 들일 때 좋은 메서드 소개
            *   readLine() : 버퍼의 한 줄을 읽어와서 문자열로 반환해준다.
            *   한줄 단위로 읽기 때문에 기존 스트림보다 성능면에서 우수하다. */
            String temp; // 값 단위 변수

            while ((temp = br.readLine()) != null) { // 값이 존재하지 않을때까지 읽어 들일 거다.
                System.out.println("temp = " + temp); // 안녕하세요 / 반갑습니다ㅎㅎ 출력
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) { // 통로가 존재한다면
                try {
                    br.close(); // 닫아 주겠다~
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
