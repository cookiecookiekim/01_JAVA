package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application { // 24-09-23 (월) 1교시 입출력 (중요하진 않으나 참고용으로 알아두자)

    public static void main(String[] args) {

        /* title. File 클래스의 사용 용법을 이해할 수 있다. */

        /* comment. 파일 처리를 수행하는 대표적인 클래스
        *   대상 파일에 대한 정보로 인스턴스를 생성하고
        *   파일의 생성, 삭제 등등을 처리하는 기능을 제고하고 있다. */

        File file = new File("src/main/java/com/ohgiraffers/section01/file/testInputStream.txt"); // 경로

        try {
            // 파일 생성이 완료되면 boolean타입으로 true/false 반환
            boolean createSuccess = file.createNewFile(); // test.txt 파일 생성
            System.out.println("createSuccess = " + createSuccess); // true반환 → test.txt 파일이 생성 되어있다~
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
        // 영문 1글자 = 1byte , 한글 1글자 = 3byte
        System.out.println("파일의 크기 : " + file.length() + "byte"); // 5 byte 출력 (txt파일에 hello 작성)
        System.out.println("파일의 경로 : " + file.getPath());
        // src\main\java\com\ohgiraffers\section01\file\test.txt 출력

        System.out.println("파일의 상위 경로 : " + file.getParent());
        // src\main\java\com\ohgiraffers\section01\file 출력

        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
        // C:\Lecture-source\01_Java\01-lecture-source\chap14-io-lecture-source\src\main\java\com\ohgiraffers\section01\file\test.txt

        // 파일의 삭제
        boolean isDelete = file.delete();
        System.out.println("isDelete = " + isDelete); // true 출력 → 프로젝트 reload 시, 삭제가 되었다.

    }

}
