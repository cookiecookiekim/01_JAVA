package com.ohgiraffers.section03.map;

import java.io.*;
import java.util.Properties;

public class Application2 { // 24-09-20 (금) 2교시 Map - Properties

    public static void main(String[] args) {

        /* title. Properties에 대해 이해할 수 있다. */

        /* comment. Properties란?
        *   HashMap을 구현하여 사용 방법이 거의 유사하지만
        *   차별점은 key와 value 모두 "문자열"만 사용할 수 있다.
        *   사용하는 예시는 대부분 설정 관련 파일의 '값' 을 읽어,
        *   어플리케이션에 적용하기 위해 사용한다. */

        Properties prop = new Properties(); // 제네릭이 없다 → 이미 String으로 고정

        prop.setProperty("driver" , "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url" , "jdbc:mysql://localhost/menu");
        prop.setProperty("username" , "ohgiraffers");
        prop.setProperty("password" , "ohgiraffers");

        System.out.println("prop = " + prop); // 무작위로 출력(순서 저장 X)

        // 나중에 할 내용 에습.... 예외처리 → 파일의 입력과 출력에 대한 것은 예외처리를 강제화
        // 파일 내보내기

        // 식 흐름만 이해하자.
        try {
            prop.store(new FileOutputStream("driver.dat"),("jdbc driver"));
            prop.store(new FileWriter("driver.txt"),("jdbc driver"));
            prop.storeToXML(new FileOutputStream("driver.xml"),("jdbc driver"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* index. 1. OutPut으로 파일을 내보냈다. 이제 내보낸 파일을 읽어보자. */
        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml")); // xml은 이렇게 읽어 와야함.

            // list() → Properties의 모든 키와 값 목록을 내보내기 한다.
            prop2.list(System.out); // 외부에 있는 파일을 읽어 왔다.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
