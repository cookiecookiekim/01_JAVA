package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testContinueStatement () { // 24-09-03 5~6교시 continue
        /* title. continue 문 사용에 대한 흐름을 이해할 수 있다. */
        /* comment. continue 문도 break와 마찬가지로 반복문 내에서 사용한다.
        *   break → 반복문을 탈출(종료) 하지만,
        *   continue는 중간에 멈추고 다시 증감식으로 넘어가게 된다.
        *   일반적으로 if(조건식) {continue;]처럼 사용하게 된다.
        *   보통 반복문 내에서 특정조건에 대한 예외를 처리할 때 사용 된다. */

        /* index. 1부터 100사이의 3의 배수이면서 4의배수인 값 출력 */

        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            } else {
                break; // 이렇게 되면 출력이 아예 안 된다, 이유는 1부터 시작이고 else로 바로 넘어갔는데 break; 를 만나서 반복문이 종료되기 때문이다.
            }

        }
    }

    public void testContinueStatement2 () { // 24-09-03 6교시 continue 사용 예시
        /* index. 2 ~ 9 단의 구구단을 출력할 것이다.
        *   단, 수가 5인 경우는 출력하지 않을 것이다. */

        for (int dan = 2; dan < 10; dan++) {

            for (int su = 1; su < 10; su++) {

                if (su == 5) {
                    continue; // break;를 쓰면 5 이상부터 출력이 안 된다. 하지만 continue를 쓰니 해당하는 수만 제외하고 모두 출력이 된다.
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println(); // 한 줄 띄어쓰기

        }

    }

    public void test1 () { // continue 연습 문제

        /* index. 구구단 2 ~ 9단을 출력할 것이다.
        *   단, 각 단의 수(su)가 짝수인 경우에는 출력을 생략
        *   ex) 2 * 1 = 2 , 2 * 3 = 6*/

        for (int dan = 2; dan < 10; dan++) {

            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();

        }

    }

    public void test2 () { // 예진씨의 변형 문제 (위에 걸 continue 쓰지 않고 풀어봐라.)
        for (int dan = 2; dan < 10; dan++) {

            for (int su = 1; su < 10; su++) {

                if (su % 2 != 0) {
                    System.out.println(dan + " * " + su + " = " + (dan * su));
                }

            }

            System.out.println();

        }
    }

}
