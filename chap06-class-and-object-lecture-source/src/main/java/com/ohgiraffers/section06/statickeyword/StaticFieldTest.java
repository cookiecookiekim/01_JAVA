package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest { // 24-09-10 (화) 1교시 클래스 - static keyword

    // ① non-static 필드, static 필드를 만들어 보자.
    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest() {} // 기본 생성자

    // ② 저장된 값을 가져오기 위한 getter 메서드 생성
    public int getNonStatiCount() {
        return this.nonStaticCount;
    }

    public int getStaticCount() {
        /* comment.
        *   static 필드에 접근하기 위해서는 메서드와 마찬가지로 클래스명.필드명 으로 접근
        *   this.도 가능하지만 사용하지 않는 것이 좋다. */
        return StaticFieldTest.staticCount; // static으로 만들었으니 class명.변수명
    }

    // 두 필드의 값을 1씩 증가시키기 위한 메서드 생성
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }
    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }

}
