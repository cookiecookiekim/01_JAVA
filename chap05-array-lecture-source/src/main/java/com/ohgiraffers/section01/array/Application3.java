package com.ohgiraffers.section01.array;

public class Application3 { // 24-09-04 (수) 3교시 배열 이어서....

    public static void main(String[] args) {

        /* title. 배열에 초기화 되는 자료형 별 기본값을 알 수 있다. */
        /* comment. 
        *    정수 : 0
        *   실수 : 0.0
        *   논리 : false
        *   문자 : \
        *   참조 : void */
        
        int[] iarr = new int[5];
        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);

//        iarr[0] = 10; 이렇게 값을 넣을 수 있지만 다른 방식으로 넣어 보자.
        /* comment. 자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우에는 블럭 ({})을 이용한다.
        *   블럭을 사용하는 경우에는 new를 사용하지 않아도 되며, 값의 개수만큼 자동으로 크기가 설정된다. */
        int[] iarr2 = {11, 22, 33, 44, 55}; // 위 값과 동일

        int[] iarr3 = new int[] {11, 22, 33, 44, 55}; // 위 값과 동일

        /* index. 들어있는 값 반복으로 출력해보기 */
        for (int i = 0; i < iarr2.length; i++) {
            System.out.println("iarr2[" + i + "] : " + iarr2[i]);
        }

        String[] sarr = {"apple", "banana", "orange", "3"};
        for (int i = 0; i < sarr.length; i++)
            System.out.println(sarr[i]);
    }
   
   
}
