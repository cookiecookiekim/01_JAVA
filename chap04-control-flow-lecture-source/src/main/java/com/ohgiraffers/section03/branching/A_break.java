package com.ohgiraffers.section03.branching;

public class A_break {

    public void testBreakStatement () { // 24-09-03 (화) 5교사 while 이어서 (break;)

        /* title. break에 대해서 이해할 수 있다. */
        /* comment.
        *   break문은 반복문 내에서 사용하게 된다.
        *   break는 반복문을 빠져 나올 때 사용하게 되며, 반복문의 조건문 판단 결과와 상관없이 반복문을 탈출하기 위해 사용된다.
        *   일반적이로 if(조건식) { break;} 처럼 사용이 된다.
        *   단, switch문은 반복문이 아니지만 예외적으로 사용이 된다. */

        /* index. 1 ~ 100 합계를 구할건데, 조건절을 무한루프로 만들어 보자. */
        int sum = 0; // 합계를 담을 변수 선언
        int i = 1;
        while (true) { // true를 넣어, 반복문을 일부러 무한하게 돌게 만들었음
            sum += i;
            if (i == 100) {
                break;
            }
            i++;
        }
        System.out.println("1부터 100까지의 합은 " + sum + " 입니다");

    }

    public void breakGugudan () {// 24-09-03 (화) 5교사 while 이어서 (break;) 다른 예제
        /* index. 구구단 2 ~ 9단까지 출력
        *   단, 각 단의 수가 5보다 큰 경우에는 출력 생략
        *   ex) 2 * 1, 2 * 2 ~~~ 2 * 5 끝 */

        for (int dan = 2; dan < 10; dan++) {
            /* comment. break문은 모든 반복문을 종료 시키는 게 아닌, 자신에게 가장 인접한 반복문을 종료시킨다. */
            for (int su = 1; su < 10; su++) {

                if (su > 5) {
                    break;
                }

                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println(); // 띄어쓰기

        }
    }

}
