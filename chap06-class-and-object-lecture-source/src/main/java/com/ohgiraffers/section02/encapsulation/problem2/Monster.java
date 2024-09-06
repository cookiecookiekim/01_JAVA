package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster { // 24-09-06 3교시 클래스 이어서

    /* index. 1. name과 hp에 대한 값을 저장할 필드 선언 */
//    String name; // 전역변수(필드) 선언
//    int hp; // 전역변수(필드) 선언

    /* index. 2. 기획 의도가 바뀐 경우 가정, 이름 대신에 몬스터 종류로 */
    /* comment. 단 한 단어(name → kinds)만 바꿨을 뿐인데 Application 내에 8줄 수정이 필요하다. */
    String kinds; // → Application 내에 다 수정해야한다. 귀찮다. 고로 조건을 다시 잡야아 한다는 것이다.
    int hp;
    /* comment. 문제 수정을 위해 problem3을 만들어서 다시 해보자. */



}
