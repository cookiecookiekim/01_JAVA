package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application1 { // 24-08-30 (금) 1교시 메서드 패키지 (많은 메서드들 중 이름이 같을 경우 구분하기)

    public static void main(String[] args) {

        /* title. 패키지에 대해 이해할 수 있다. */
        /* comment. 패키지란? 서로 관련있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것을 의미.
        *   같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르다면 동일한 이름을 가진 클래스를 만들 수 있다. */

        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30, 20);

        System.out.println("30과 20중 더 작은 값 : " + min);

        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf (30 , 20);

        System.out.println("30과 20중 더 작은 값 : " + max);


    }
}
