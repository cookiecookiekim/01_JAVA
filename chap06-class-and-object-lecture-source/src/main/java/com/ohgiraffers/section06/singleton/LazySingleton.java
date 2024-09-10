package com.ohgiraffers.section06.singleton;

public class LazySingleton { // 24-09-10 (화) 2교시 클래스 - 게으른 초기화
                            // 게으른 초기화의 장점 : 조건문을 쓸 수 있고, 이것저것 추가할 수 있다.
    // 클래스가 초기화 되는 시점에는 정적 필드로 선언
    private static LazySingleton lazy;

    // 마찬가지로 생성자를 통한 인스턴스 생성 제한.
    private LazySingleton () {}

    public static LazySingleton getInstance() {
        if (lazy == null) {
            //인스턴스가 생성된적 없으면, 한 번이라도 생성 되었다면
            // 바로 return
            lazy = new LazySingleton();
        }
        return lazy;
    }

}
