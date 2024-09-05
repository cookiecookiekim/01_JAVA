package com.ohgiraffers.section03.sort;

public class Application2 { // 24-09-05 (목) 6교시 순차 정렬

    public static void main(String[] args) { // 이해만 하고 넘어가라고는 하니 넘어가자.. (나중에 데이터 베이스에서 한 줄이면 끝난다)

        /* title. 순사 정렬에 대해 이해할 수 있다. */
        /* comment. 순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로,
        *   배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘. */

        int[] iarr = {2, 5, 4, 6, 1, 3};

        for (int i = 1; i < iarr.length; i++) { // 첫 번째 인덱스(0)는 비교할 필요가 없어서 1번부터 비교 시작
            // 인덱스가 증가할 때마다 처음부터 해당 인덱스까지 값을 비교
            for (int j = 0; j < i; j++) {

                if (iarr[i] > iarr[j]) { // 코드가 길어서 헷갈리면 일일이 다 대입해보자.
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }
        for (int i : iarr) {
            System.out.print(i + " ");
        }
    }
}
