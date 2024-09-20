package com.ohgiraffers.section03.override;

import java.io.FileNotFoundException;

// 자식 역할 클래스
public class SubClass extends SuperClass { // 24-09-20 (금) 6교시 override 활용


    // 같은 예외를 던져주는 구문으로는 오버라이딩 가능하다.
//    @Override
//    public void overrideTestMethod() throws IOException {
//
//    // 예외를 제외하고도 오버라이딩 가능
//    public void overrideTestMethod() {
//        }

    // 부모의 예외처리 클래스보다 상위라입 오버라이딩
    // 자식은 항상 부모보다 더 자세하게(구체적인 예외상황) 작성해야 한다.
//        public void overrideTestMethod() throws Exception {}

    // 부모의 예외처리 클래스보다 더 하위에 있는 예외(즉, 구체적)인 경우 오버라이딩 가능
    public void overrideTestMethod() throws FileNotFoundException {}



}
