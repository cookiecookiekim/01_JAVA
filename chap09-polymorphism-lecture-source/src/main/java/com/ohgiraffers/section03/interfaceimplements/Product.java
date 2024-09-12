package com.ohgiraffers.section03.interfaceimplements;
// interface 상속 받을 때엔 implements 키워드 사용
public class Product extends Object implements InterfaceProduct, java.io.Serializable {
    // 24-09-12 (목) 2교시 인터페이스, 다중 상속

    /* comment.
    *   클래스에서 인터페이스를 상속 받을 때에는 implements 키워드를 사용.
    *   또한 인터페이스는 여러개를 상송받을 수 있고,
    *   extends로 다른 클래스를 상속 받는 경우에도 별개로 추가 상속 가능.
    *   단, extends 키워드가 implements 보다 앞에 작성 돼야 함! */

    @Override
    public void nonStaticMethod() {
        System.out.println("InterfaceProduct의 nonStaticMethod 호출...");
    }
}
