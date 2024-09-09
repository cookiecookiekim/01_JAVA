package com.ohgiraffers.section04.dto;

import java.time.LocalDateTime;

public class Application { // 24-09-09 (월) 3교시, 클래스와 객체 (DTO 클래스의 규칙과 틀)

    public static void main(String[] args) {

        /* title. 생성자를 이용한 초기화와 설정자를 이용한 초기화의 장단점 */

        /* index. 1. 생성자를 이용한 초기화 */
        /* comment.
        *   장 점 : setter 메서드를 단 한 번의 호출로 인스턴스를 생성 및 초기화할 수 있다.
        *   단 점 : 매개변수의 개수를 경우의 수만큼 만들어 줘야 한다.
        *        만약 호출 시 인자가 많아지는 경우, 어떤 필드를 의미하는지 헷갈림 */
        UserDTO user1 = new UserDTO("user01", "pass01", "김규남", LocalDateTime.now());
        System.out.println("user01 정보 : " + user1.toString());

        /* index. 2. 기본 생성자와 설정자를 이용한 초기화 */
        /* comment.
         *   장 점 : 필드를 초기화하는 값들이 어떤 필드를 지칭하는데 명확히 알 수 있다.
         *   단 점 : 하나의 인스턴스를 생성할 때, 한 번의 호출로 끝나지 않는다. */
        UserDTO user2 = new UserDTO(); // 기본 생성자
        user2.setId("user02");
        user2.setPwd("pass02");
        user2.setName("김규순");
        user2.setEnrollDate(LocalDateTime.now());
        System.out.println("user02 정보 : " + user2.toString());
    }

}
