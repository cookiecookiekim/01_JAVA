package com.ohgiraffers.section04.overflow;

public class Application { // 24-08-27 (화) 오전

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */

        /* 필기.
        자료형 별 최대 범위를 벗어나는 경우를 오버플로우라고 한다.
         */

        /* 목차. 1. 오버플로우 */
        byte num1 = 127;
        System.out.println("num1 = " + num1); // 127 : byte의 최대 저장 범위

        num1++; // num1 + 1;  → 1 증가

        System.out.println("num1 overflow 확인하기 : " + num1); // 127에 +1이 됐는데 왜 - 128이 나올까? → notion 필기 확인 127 초과된 순간 signbit에 추가되어 반전 (그냥 int 쓰면 된다~)

        /* 목차. 2. 언더플로우 */
        byte num2 = -128; // byte 자료형의 최소값
        System.out.println("num2 = " + num2);

        num2--; // num2 - 1; → 1 감소

        System.out.println("num2 overflow 확인하기 : " + num2); // -129가 나올 수 없다 → 지정한 범위까지만 저장 가능하다.

        /* 오버플로우와 언더플로우가 발생 했으나, 컴파일에러나 런타임 에러가 발생하지 않았다. 그렇기 때문에 최대값 또는 최소값의 범위를 고려해서 코드를 작성해야 한다는 의미이다. */

        int firstNum = 1000000; // 100만
        int secondNum = 700000; // 70만

        int multi = firstNum * secondNum; // 예상값이 7천억.
        System.out.println("multi = " + multi); // 하지만 이상한 값이 출력 (-79669248), 허용 가능한 21억을 넘어섰기 때문.

        long longMulti = firstNum * secondNum; // 그렇다면 거의 모든 숫자가 가능한 double에 담아보자.
        System.out.println("longMulti = " + longMulti); /* double에 담았는대도 값이 이상하게 나오는 이유는, 이미 오버플로우 된 값을(int형으로 출력된 값을)담은 것 뿐이어서.
                                                          → */
        // 그렇다면 어떻게 해야할까?

        long result = (long) firstNum * secondNum; // long Type으로 강제 형변환
        System.out.println("result = " + result);

    }
}
