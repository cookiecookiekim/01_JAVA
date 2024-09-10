package com.ohgiraffers.section06.singleton;

public class EagerSingleton { // 24-09-10 (화) 2교시 클래스 - 이른 초기화

    // 클래스가 초기화 되는 시점에 인스턴스를 생성한다.
    private static EagerSingleton eager = new EagerSingleton(); // 이른 초기화 (선언과 동시에 초기화)

    // singleton 패턴은 외부에서 생성자를 통해 인스턴스 생성을 못하게 제한.
    private EagerSingleton () {
    }

    public static EagerSingleton getInstance() {
        return eager;
    }

}
