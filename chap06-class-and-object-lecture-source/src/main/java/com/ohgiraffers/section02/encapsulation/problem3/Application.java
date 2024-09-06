package com.ohgiraffers.section02.encapsulation.problem3;

public class Application { // 24-09-06 3교시 클래스 이어서 (여기서 헷갈림. 다시 복습)

    public static void main(String[] args) {
        /* title. 필드에 직접 접근 시 발생하는 문제 (3)
            (값이 변경 되더라도 오류 수정을 조금만 해도 되므로 거의 해결) */

        Monster monster1 = new Monster();
        monster1.setName("하츄핑");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setName("시진핑");
        monster2.setHp(-200);

        Monster monster3 = new Monster();
        monster3.setName("티니핑");
        monster3.setHp(300);

        Monster monster4 = new Monster();
        monster4.setName("핑");
        monster4.setHp(400);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        /* title. ↓ 아직 완벽히 해결된 게 아니다. ↓ */
        Monster monster5 = new Monster();
        monster5.kinds = "";
        monster5.hp = -1315131531;
        // comment. 아직도 필드에 직접 값을 넣을 수 있다. resolve package를 통해 알아보자.

    }
}
