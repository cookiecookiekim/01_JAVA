package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest { // 24-09-10 (화) 1교시 클래스 - static keyword

    private int count;

    public void nonStaticMethod() {
        this.count++;
        System.out.println("nonStatic 메서드 호출됨...");
    }

    public static void staticMethod(){
        // this.count; // 오류 발생. 메서드가 static이므로
        // static 메서드는 인스턴스를 생성하지 않고 사용하는 메서드이기 때문에
        // this에는 인스턴스의 주소가 들어갈 수 없다.
        System.out.println("static 메서드 호출됨...");

    }

}
