package com.ohgiraffers.section07.kindofvariable;
                    // 24-09-10 (화) 3교시 클래스 - 변수의 종류
public class kindsOfVariable { // 클래스 영역의 시작

    /* title. 다양한 변수들을 이해하고 사용할 수 있다. */
    /* comment.
    *   클래스 영역 내부에 작성하는 변수를 '필드'라고 한다.
    *   필드를 '멤버변수(클래스가 가진 멤버)' 라고도 하고, '전역 변수' 라고도 한다. */

    /* comment. non-static 필드를 인스턴스 변수라고도 한다.
    *   인스턴스 생성 시점에 사용 가능한 변수의 의미 */

    private int globalNum;

    /* comment. static 필드는 정적필드(클래스 변수) 라고도 한다. */
    private static int staticNum; // 인스턴스 변수 아니다.

    public void testMethod(int num) { // 메서드 영역의 시작

        /* comment.
        *   메서드 영역 내에서 작성하는 변수를 지역변수라고 한다.
        *   매개변수도 일종의 지역변수이다.
        *   지역변수와 매개변수는 모두 메서드 호출 시 stack 영역에 생성됨. */

        int localNum;

        System.out.println(num); // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화 필요 없음.
//        System.out.println(localNum); // 하지만 지역변수는 선언 외에 다시 사용하기 위해 반드시 초기화 필요
        System.out.println(globalNum);
        System.out.println(staticNum);

    } // 메서드 영역의 끝

    public void testMethod2() {
        System.out.println(globalNum); // 전역 변수이므로 사용 가능
        System.out.println(staticNum); // 전역 변수이므로 사용 가능
//        System.out.println(localNum); // 지역 변수이므로 사용 불가능
    }

} // 클래스 영역의 시작
