package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster { // 24-09-06 4교시 클래스 (3번 problem3 Monster 복붙)

    /* comment. 접근 제한자 (public이나 private 같은 용어들)
    *   클래스 혹은 클래스의 멤버(변수 , 메서드)에 참조연산자(.)로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
    *   ☆ 1. public : 모든 패키지에 접근 가능
    *   2. protected : 동일 패키지에서 접근 가능 (단, 상속 관계에 있는 경우 다른 패키지에서 접근 가능)
    *   ☆ 3. private : 해당 클래스 내부에서만 접근 가능.
    *   4. default : 동일 패키지에서만 접근 허용 (쓰지 않는 게 default)  */

    private String kinds; // 해당 클래스에서만 사용 가능
    private int hp; // 해당 클래스에서만 사용 가능

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
