package com.ohgiraffers.section03.sort;

public class Application1 { // 24-09-05 (목) 6교시 <정렬 of 배열>

    public static void main(String[] args) {
        /* title. 변수의 두 값을 변경하는 방법 */

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

//        num1 = num2; // 10이 20이 되어 둘다 20 출력.
//        num2 = num1;
        /* comment. 임시 공간을 만들어 보자. */
        int temp;
        temp = num1; // temp에 10 저장
        num1 = num2;
        num2 = temp;

        System.out.println("수정 후 num1 = " + num1);
        System.out.println("수정 후 num2 = " + num2);

        /* comment. 배열의 값 변경하기 */
        int[] arr = {2, 1, 3};
        int temp2;
        temp2 = arr[0]; // 2를 임시 공간에 저장
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i : arr) {
            System.out.println(i + " ");
        }



    }
}
