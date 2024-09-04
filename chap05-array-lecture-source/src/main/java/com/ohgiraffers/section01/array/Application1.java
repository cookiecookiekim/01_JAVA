package com.ohgiraffers.section01.array;

public class Application1 { // 24-09-04 (수) 1교시, 배열 기초
    public static void main(String[] args) {

       /* title. 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */
        /* comment. 배열이란?
        *   동일한 자료형의 묶음 (연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도.
        *   배열은 heap 영역에 new 연산자를 이용해서 할당을 하게 된다.
        *   - new : 할당 연산자 */

        /* comment. 배열의 사용 이유는?
        *   만약 배열을 사용하지 않게 된다면, 필요한 값을 일일이 변수에 담아 주어야 한다. → 변수는 값 한 개만을 저장할 수 있기 때문에.
        *   1. 연속된 메모리 공간으로 관리할 수 없다.
        *   2. 규칙이 없기 때문에 반복문을 통한 연속 처리가 불가능하다. */

        // 5개의 변수 만들기
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0; // 결과를 저장할 변수 만들기
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println(sum); // 변수가 지금은 5개지만 100개라고 가정해보면 끔찍하다. 배열이 필요하다.

        /* index. 배열의 선언 및 할당 */
        //자료형[] 변수 = new 자료형[공간크기]; (공식)
        int[] arr = new int[5];
        System.out.println("arr = " + arr);

        /* comment. 값 할당 해보기 
        *   arr 이름을 가진 연속된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인덱스)를 이용해서 접근할 수 있다. */
        arr[0] = 10; // 0번째 공간에 10을 대입하겠다.
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 배열은 일정한 규칙(인덱스)을 가지고 있기 때문에 반복문을 통해 값을 대입할 수 있다.
        for (int i = 0, value = 0; i < 5; i++) { // int i = 0, value = 0; 나열 연산자라고 하는데 ,를 찍으면 뒤에도 자료형이 붙는다 
            arr[i] = value += 10; // 이렇게도 된다라는 걸 설명, 실제 이렇게 사용 안 함.
        }

        // 합산 결과를 담을 변수
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println("sum2 = " + sum2);
        
    }

}
