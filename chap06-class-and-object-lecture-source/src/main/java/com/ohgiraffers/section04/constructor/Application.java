package com.ohgiraffers.section04.constructor;

import java.time.LocalDateTime; // 래퍼런스 = 인스턴스 = 객체 같은말

public class Application { // 24-09-09 (월) 2교시, 클래스와 객체 (생성자에 대해)

    public static void main(String[] args) {

        /* title. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */
        /* comment. 생성자란?
        *   우리가 지금까지 클래스명 래퍼런스변수명 = new 클래스명(); 이런식으로 객체를 만들어 왔음.
        *   new 뒤에 클래스명은 사실 생성자(constructor)라고 불리는 메서드를 호출하는 구문이다.
        *   하지만, 우리는 지금까지 생성자를 만든적이 없는데 매개변수가 없는 생성자는 compiler에 의해
        *   자동으로 추가되기 때문에 작성하지 않고소 사용할 수 있었다. */

        UserDTO user = new UserDTO(); // 출력시 호출됨 : UserDTO(); ← 생성자라 불리는 메서드기 때문
        System.out.println("user의 초기값 : " + user.toString());

        /* comment.
        *   기본 생성자로 인스턴스(객체)를 생성하게되면 jvm이 제공하는 기본값들로 값이 초기화 된다.
        *   하지만 우리가 초기값을 원하는대로 생성하자마자 넣고 싶으면
        *   매개변수가 있는 생성자로 값을 인자로 전달하면 된다.
        *   주의점 : 만약 매개변수가 있는 생성자가 존재한다면 기본생성자는 ~~~~
        *   */

        UserDTO user2 = new UserDTO("user01", "pass01", "김규남");
        System.out.println("user2의 초기값 :" + user2.toString());


        UserDTO user3 = new UserDTO("user03", "pass03", "김규순", LocalDateTime.now());
        System.out.println("user3의 초기값 : " + user3.toString());
    }
}
