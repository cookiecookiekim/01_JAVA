package com.ohgiraffers.section05.typecasting;

public class Application1 { //24-08-27 (화) 2교시

    public static void main(String[] args) {

        /* comment. 자동 형변환 규칙에 대해 이해할 수 있다.
        데이터 형변환
        데이터 형변환이 필요한 이유
        - 자바에서 다른 타입끼리의 연산은 모두 같은 타입인 경우 실행 가능
        - ex) int - int , char - char 등등
        - *즉, 같은 데이터 타입끼리만 연산이 가능하다.*/

        /* comment.
        *   형변환의 종류와 규칙
        * 1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 변환
        * 1-1. 작은 자료형에서 큰 자료형으로는 자동으로 형변환 된다.
        * 1-2. 정수는 실수로 자동 형변환 된다.
        * 1-3. 문자형은 int 형으로 자동 형변환 된다.
        * 1-4. 논리형은 형변환 규칙에서 제외된다.
        *
        * 2. 강제 형변환(명시적 형변환) : 형변환 연산자 ex) (long), (int)를 이용한 강제적으로 수행하는 변환
        * 자동이 안 된다? → 강제로 해야한다. */

        /* index. 1. 자동 형변환 규칙 테스트 */
        // index. 1-1. 작은 자료형에서 큰 자료형으로는 자동현변환 된다.
        // comment. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 [데이터의 유실]은 발생하지 않기 때문에 컴파일러가 자동으로 해준다.

        /* index. 1-1-1. 정수끼리의 자동 형변환 */
        byte bnum = 1; //1 -
        short snum = bnum; // 2 - short snum = (short)bnum; (short)가 생략 돼있다는 뜻
        int inum = snum; // 4 - int inum = (int) snum; (int)가 생략 돼있다는 뜻
        long lnum = inum; // 8 - long lnum = (long) inum; (long)이 생략 돼있다는 뜻.

        // comment. 연산 시에도 자동으로 큰 쪽 자료형에 맞춰 계산해 준다.
        int num1 = 10;
        long num2 = 20;
//        int result1 = num1 + num2; → 자동으로 큰 쪽인 long으로 변경 후 계산되기 때문에 int형 변수 공간에 값을 담을 수 없으므로 연산 자체가 안 됨.
        long result = num1 + num2; // int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int → long으로 변환을 자동으로 수행한 후 연산을 진행한다.

        /* index. 1-1-2. 실수끼리의 자동 형변환 */
        float fnum = 4.0f; // 4
        double dnum = fnum; // 8
//        float result2 = fnum + dnum; → double을 float에 담으려고 하니 연산이 안 됨.

        /* index. 1-2. 정수는 실수로 자동 형변환이 된다. */
        /* comment. 정수에서 실수로(int → float) 변경할 때 소수점이 없어도 실수 형태로 표현 가능하다.
        *   why? 그냥 소수점만 추가되는 것이기 때문 (30 & 30.0) */

        long eight = 8; //8
        float four = eight; //4 → 큰 범위의 long을 작은 범위인 float에 담았는데 연산이 가능하다, 이유는 정수를 실수로 넣었기 때문.

        // 정수와 실수의 연산은 항상 실수로 결과가 반환된다. (ex) 30 + 30.0 = 60.0

        float result3 = eight + four;
        System.out.println("result3 = " + result3);

        /* index. 1-3. 문자형은 int 형으로 자동 형변환 된다. */
        char ch = 'a';
        int charNum = ch;
        System.out.println("charNum = " + charNum); // 아스키 코드 상에 'a'가 97이므로 97 출력

        /* index. 1-4. 논리형은 형변환 규칙에서 제외된다. */
        /* comment. 어떠한 자료형이든 boolean은 형 변환해서 담을 수 없다. → 고유값이기 때문 */
        boolean isTure = true; // 1
//        byte b = isTrue;
//        short s = isTure;
//        double d = isTure;
//        char c = isTure;


    }
}
