package com.ohgiraffers.section02.copy;

public class Application2 { // 24-09-05 (목) 2교시 배열 (얕은 복사 심화)

    public static void main(String[] args) { // 복습하면서 흐름을 이해해보자 (하브루타 해보자)
        /* title. 얕은 복사를 활용해서 매개변수와 리턴값으로 활용할 수 있다. */
        /* comment. 얕은 복사의 활용
        *   얕은 복사를 활용하는 것은 주로 메서드 호출 시 인자로 사용하는 경우와,
        *   리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다. */

        String[] names = {"푸바오", "러바오", "아이바오"};
        // 얕은 복사 확인을 위한 hashcode() 구문
        System.out.println("names 배열의 hashcode() : " + names.hashCode());

        /* index. 1. 인자와 매개변수로 활용하는 얕은 복사 */
        print(names); // 우리가 만든 배열을 출력하는 기능을 가진 메서드에 전달

        /* index. 2. 리턴값으로 활용 */
        String[] animals = getAnimals(); // 흐름 이해 필요
        System.out.println("리턴받은 animals의 hashcode() : " + animals.hashCode());

        print(animals);

    }
    /* comment. print() 메서드의 역할은 우리가 전달한 배열을 출력하는 역할이다. */
    public static void print (String[] baoFamily) {

        System.out.println("baoFamily.hashCode() = " + baoFamily.hashCode());
        for (int i = 0; i < baoFamily.length; i++) {
            System.out.print(baoFamily[i] + " ");
        }
        System.out.println();

    }

    public static String[] getAnimals() {
        String[] ani = {"후이바오", "루이바오"};
        System.out.println("새로 만든 animals의 hashcode() : " + ani.hashCode());

        return ani;
    }

}
