package com.ohgiraffers.section03.overriding;

public class SuperClass { // 24-09-11 (수) 4교시 상속 / 오버라이딩
    /* title. 오버 라이딩에 대해 이해할 수 있다.*/
    /* comment. 오버라이딩의 성립요건
    *   1. 메서드의 이름이 동일해야함
    *   2. 메서드의 리턴타입이 동일해야 함.
    *   3. 매개변수의 타입, 개수, 순서가 동일해야 함.
    *   4. private 메서드는 접근이 불가능하기 때문에 오버라이딩 불가능.
    *   5. final 키워드가 사용된 메서드는 오버라이딩 불가능.
    *   6. ★ 접근제한자는 부모 메서드와 같거나 더 넓은 범위여야 함.★
    *   7. ★ 예외 처리는 같은 예외이거나, 더 구체적(하위)인 예외를 다뤄야 함.★ */

    public void method (int num) {}

    private void privateMethod () {}

    public final void finalMethod() {}

    protected void protectedMethod () {}

    public SuperClass () {
        System.out.println("기본 생성자 호출됨");
    }

}
