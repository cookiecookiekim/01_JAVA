package com.ohgiraffers.section01.method;

public class Application4 { // 24-08-29 (목) 2교시 메소드 이어서

    public static void main(String[] args) {

        /* title. 여러개의 전달 인자를 이용한 매소드 호출 테스트 */
        /* index. 2. 여러 개 매개 변수를 가진 메소드 호출하기. */
        Application4 app4 = new Application4();
        app4.testArgsMethod("김규남", 30, '남');
//        app4.testArgsMethod(30, '남', "김규남"); // 값의 개수는 맞지만, 순서가 다르게 전달되면 작동하지 않음. (컴퓨터는 단순하다)

    }
    /* index. 1. 여러 개 전달인자를 받을 수 있는 메소드 만들기. */
    public void testArgsMethod (String name, int age, final char gender) {
        /* comment. 매개변수도 일종의 지역변수로 분류된다.
        *   매개변수 역시 상수의 의미를 가지를 final 키워드를 사용할 수 있다. (지역변수에 final 키워드를 붙이는 것과 동일) */
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + " 입니다.");

    }
}
