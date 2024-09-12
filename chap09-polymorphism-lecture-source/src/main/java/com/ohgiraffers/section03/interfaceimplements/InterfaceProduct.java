package com.ohgiraffers.section03.interfaceimplements;

public interface InterfaceProduct { // 24-09-12 (목) 2교시 인터페이스

    /* comment. 인터페이스의 특징
    *   상수 필드만 작성이 가능하다.
    *   public static final 키워드 조합이 상수 필드
    *   '반드시' 선언과 동시에 초기화 해줘야 함. */

    public static final int MAX_NUM = 100;
    // public static final을 생략해도 묵시적으로 적용됨.
    // int MAX_NUM = 100;

    /* comment.
    *   인터페이스는 추상 메서드만 작성 가능.
    *   인터페이스 내부에 작성된 메서드는 묵시적으로
    *   public abstract의 의미를 가진다.
    *   인터페이스는 생성자를 가질 수 없다. */

    /* index. 1. 인터페이스는 생성자를 가질 수 없다. */
//    public InterfaceProduct () {}
    /* index. 2. 인터페이스는 구현부( { } )가 있는 메서드를 가질 수 없다. */
//    public void nonStaticMethod() {}

    /* index. 3. 추상클래스에서 작성해본 추상 메서드만 작성할 수 있다. */
    /* comment.
    *   인터페이스 내부의 메서드는 묵시적으로 public abstract의 의미를 가지고 있다.
    *   다른 접근제한자는 사용이 불가능하다. */
    void nonStaticMethod();

    /* static 메서드는 작성 가능 */ // 그냥 읽어보고 넘어가자~
    static void staticMethod() {
        System.out.println("InterProduct의 staticMethod() 호출...");
    }

}
