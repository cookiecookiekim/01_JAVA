package com.ohgiraffers.section03.increment;

public class Application1 { // 24-08-27 (화) 5교시 - 증감연산자

    public static void main(String[] args) {

        /* title. 증감연산자에 대해 이해할 수 있다. */

        /* comment. 증감연산자
        *   피연산자 앞 or 뒤에 사용이 가능하다.
        *   '++' : 1 증가
        *   '--' : 1 감소 */

        /* index. 1. 증감연산자를 단항으로만 사용 */
        /* comment. 단항으로 사용될 때는 1 증가, 1 감소의 의미 */

        int num = 20;
        System.out.println("num = " + num);
        num++;
        System.out.println("num = " + num);
        ++num;
        System.out.println("num = " + num);
        num--;
        System.out.println("num = " + num);
        --num;
        System.out.println("num = " + num); // 값들이 1씩 증가하거나 감소함 (동일)

        /* index. 2. 증감연산자를 다른 연산자와 함께 사용 */
        /* comment. 주의사항
        *   ++, -- 증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다.
        *   다른 연산자와 함께 사용할 때 증감 연산자의 의미
        *   '++num' : 피연산자의 값을 먼저 1 증가시킨 후 다른 연산 진행
        *   'num++' : 다른 연산을 먼저 진행한 후 마지막에 피연산자 값을 1 증가*/
        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println("result1 = " + result1); //63이 나올거라 생각했지만 60이 나온다. 왜? 위에 코멘드 참고
        System.out.println("firstNum = " + firstNum); // ++ * 연산자와 연산자가 만남 → 곱하기 연산 수행 후 1 증가

        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println("result2 = " + result2); // 생각했던대로 63이 출력된다.
        System.out.println("secondNum = " + secondNum);

        int thirdNum = 20;
        int result3 = thirdNum++;
        System.out.println("result3 = " + result3); // = 도 연산자이므로 21이 아닌 20이 출력된다.
        System.out.println("thirdNum = " + thirdNum); // 대입 연산자가 선순위이므로 먼저 출력 된 후 1 증가한다.
    }
}
