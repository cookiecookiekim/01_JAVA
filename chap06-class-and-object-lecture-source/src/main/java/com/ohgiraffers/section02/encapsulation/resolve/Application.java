package com.ohgiraffers.section02.encapsulation.resolve;

public class Application { // 24-09-06 4교시 클래스 (문제 해결 코드)
    /* title. 접근 제한자를 이해하고 지금까지 발생한 문제를 해결할 수 있다. */
    /* index. 1. private필드에 직접 접근했을 때 */
    Monster monster1 = new Monster();
    // monster1.kinds = "시진핑"; Application에서 private으로 설정했기 때문에 사용할 수 없다.

    /* comment. ☆ 캡슐화(encapsulation)이란? ☆
    *   우리가 클래스에 만들어둔 필드(전역변수 == 인스턴스 변수)대로 공간은 생성되어 있지만,
    *   private을 이용하여 직접적으로 접근은 막아두고, public으로 만들어둔 메서드를 통해서만
    *   필드의 값을 대입할 수 있도럭 해 놓은 것이다. */

}
