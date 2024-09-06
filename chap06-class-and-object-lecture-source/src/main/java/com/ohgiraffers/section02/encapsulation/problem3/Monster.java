package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster { // 24-09-06 3교시 클래스 이어서 (여기서 헷갈림. 다시 복습)
    /* index. 1. name hp */
//    String name; // index 2를 위해 주석
//    int hp; // index 2를 위해 주석

    /* index. 2. 몬스터 이름이 아니라 종류로 바꿔보자. name을 kinds로만 바꿔주면 오류수정 끝 */
    String kinds;
    int hp;

    public void setName (String name) {
        this.kinds = name;
    }

    public void setHp (int hp) {
        if (hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }

    }

    public String getInfo () { // 이 메서드의 역할은 몬스터의 정보(이름, 체력)을 알려주는 기능

        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }
}
