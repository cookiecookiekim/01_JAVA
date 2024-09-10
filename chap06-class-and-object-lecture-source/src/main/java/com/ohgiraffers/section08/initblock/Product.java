package com.ohgiraffers.section08.initblock;

public class Product { // 24-09-10 (화) 3~4교시 클래스 - 초기화 블럭

    /* index. 1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체 만들어짐. */
//    private String name;         // 제품 이름
//    private int price;           // 제품 가격
//    private static String brand; //제품 브랜드

    /* index. 2. 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 2000000;
    private static String brand = "삼성";

    /* index. 3. 인스턴스 초기화 블럭 */
    {
        name = "애플";
        price = 10000000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함...");
    }

    public Product () {
        System.out.println("기본생성자 동작함...");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");

    }

    static { // 4교시 - 스태틱 초기화
        /* comment.
        *   static 초기화 블럭은 non-static 필드를 초기화 할 수 없다.
        *   static 초기화 블럭은 클래스 로드 시에 동작하기 때문에 */
//        name = "화웨이"; // 에러 발생
//        price = 2000;  // 에러 발생
        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함..."); // 가장 먼저 동작 (static)
    }


    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price + ", brand = " + Product.brand + // Product 쓴 이유는 static인 거 확인하려고
                '}';
    }
}
