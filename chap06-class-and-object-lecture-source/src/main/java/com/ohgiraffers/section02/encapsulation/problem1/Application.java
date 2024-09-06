package com.ohgiraffers.section02.encapsulation.problem1; // encapsulation 캡슐화 (감싼다라는 의미)

public class Application { // 24-09-06 2교시 클래스 , 문제 상황을 4가지 만들어서 이 기능을 왜 써야 하는지 스스로 깨닫는 시간.

    public static void main(String[] args) {

        /* title. 필드에 직접 접근했을 때 발생할 수 있는 문제를 이해할 수 있다. (1) */
        /* comment. 필드에 올바르지 않은 값이 들어가게 되어도 통제가 불가능하다. */

        Monster monster1 = new Monster(); // 1번 몬스터 생성
        monster1.name = "하츄핑";
        monster1.hp = 200;
        System.out.println("monster1.name = " + monster1.name); // 하츄핑 출력
        System.out.println("monster1.hp = " + monster1.hp); // 200 출력

        Monster monster2 = new Monster(); // 2번 몬스터 생성
        monster2.name = "시진핑";
        monster2.hp = -20;
        System.out.println("monster2.name = " + monster2.name); // 시진핑
        System.out.println("monster2.hp = " + monster2.hp); // -20 (잘 출력되나 hp가 -20인 건 말이 안 된다, 조취가 필요하다.).
        /* comment. (문제점)
                    이렇게 변수에 직접 값을 넣게 되면 검증되지 않는 값을 넣어도 막을 방법이 없다. */

        Monster monster3 = new Monster(); // 3번 몬스터 생성
        monster3.name = "티니핑";
        monster3.setHp(-200); // 값을 바로 넣는 게 아니라 메서드(조건)을 이용해 사용한다.

        System.out.println("monster3.name = " + monster3.name); //
        System.out.println("monster3.hp = " + monster3.hp);

        Monster monster4 = new Monster(); // 4번 몬스터 생성
        /* comment. 우리는 검증되지 않은 값을 처리하는 메서드를 만들었다.(monster3.setHp)
        *   하지만 아직도 필드에 직접적으로 접근할 수 있다. 조취가 필요하다. */
        monster4.name = "핑";
        monster4.hp = -1000;

        System.out.println("monster4.name = " + monster4.name); // 핑
        System.out.println("monster4.hp = " + monster4.hp); // -1000 (여전히 이상한 값이 출력된다)
    }

}
