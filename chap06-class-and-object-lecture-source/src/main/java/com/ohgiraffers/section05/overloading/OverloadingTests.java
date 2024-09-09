package com.ohgiraffers.section05.overloading;

public class OverloadingTests { // 24-09-09 (월) 4교시, 클래스와 객체 (☆ 오버로딩 ★)

    /* title. 오버로딩에 대해 이해할 수 있다. */

    /* comment. 오버로딩 사용 이유
    *   매개변수의 종류별로 메서드 내용을 다르게 작성해야 하는 경우가 종종 있다.
    *   이 때, 동일한 기능의 메서드를 매개변수에 따라 다르게 이름 붙이게 되면,
    *   메서드의 이름을 다 외우고 관리하기 힘들 것.
    *   동일한 이름으로 다양한 종류의 매개변수에 따라서 처리해야하는 여러 메서드를
    *   관리하는 기술을 오버로딩(overloading)이라고 한다. */

    /* comment. 오버로딩의 조건
    *   동일한 이름을 가진 메서드의 파라미터 선언부에 매개변수의 타입, 개수, 순서를
    *   다르게 작성해서 한 클래스 내에 동일한 이름의 메서드를 여러개 작성할 수 있도록 한다.
    *   → 메서드의 시그니쳐가 다르면 다른 메서드로 인식하게 된다. */

    /* comment. 메서드의 시그니처란?
    *   public void test(int num) {}이라는 메서드가 있다면,
    *   test(int num) ← 이 부분이 메서드의 시그니쳐이다. */

    public void test() {}
//    public void test() {} 메서드의 시그니처가 같기 때문에 컴파일 에러 발생
//    private void test() {} 접근제한자를 바꾸어도 메서드 시그니처가 같기 때문에 에러 발생
//    public int test() {return 0;} 반환형을 바꾸더라도 메서드의 시그니처가 같기 때문에 오류 발생
    public void test(int num) {} // 드디어 에러 발생되지 않음.
//    public void test(int num1) {} 매개변수의 이름은 메서드 시그니처에 영향 주지 않는다.
    public void test(int num, int num2) {} // 매개변수 개수에 따라, 오버로딩 성립 확인
    public void test(int num, String num1) {} // 매개변수 타입 변화에 따른 오버로딩 성립 확인
    public void test(String num1, int num) {} // 매개변수 순서에 따른 오버로딩 성립 확인

}
