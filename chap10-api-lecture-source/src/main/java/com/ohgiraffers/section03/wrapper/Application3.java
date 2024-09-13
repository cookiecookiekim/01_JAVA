package com.ohgiraffers.section03.wrapper;

public class Application3 { // 24-09-13 (금) 1교시 - 기본 자료형을 문자열로

    public static void main(String[] args) {

        /* title. 기본 자료형 값을 문자열로 변경할 수 있다. */
        /* comment.
        *   valueOf() : 기본 자료형 값을 Wrapper 클래스 타입으로 변환
        *   toString() : 필드 값을 문자열로 반환하는 메서드
        *   문자열 합치기 */

        // Byte : Wrapper class
        String b = Byte.valueOf((byte)1).toString(); // byte를 String화 시킨다.
        // valueOf는 많이 사용하지 않는다. 필요하면 구글링~

        /* comment. String 클래스에서 제공하는 valueOf()를 사용할 수 있다. */
        String str = String.valueOf(7); // 원하는 타입의(정수, 문자, boolean 등등)
                                      // 아무거나 넣어도 String Type으로 바꿔줌.
        /* comment. 문자열 합치기를 이용하여 String Type으로 변환
        *   → 문자열 + ~~ = 문자열이기 때문~ (초기에 배웠지~?) */
        String str2 = 123 + "";

    }

}
