package com.ohgiraffers.section02.stringbuilder;

public class Application2 { // 24-09-12 (목) 5교시 StringBuilder

    public static void main(String[] args) {

        /* title. Stringbuilder의 특징을 확인해 보자. */

        StringBuilder sb = new StringBuilder("javamysql");

        /* comment.
        *   delete() : 시작 인덱스와 종료 인덱스를 이용해서 제거
        *   deletecharAt() : 문자열 인덱스를 이용해서 문자 하나 제거
        *   - 중요 !! 둘 다 하나의 인스턴스이기 때문에,
        *            원본에 영향을 미친다!! */

        System.out.println("delete() : " + sb.delete(2,5)); // jaysql jaaysql
        System.out.println("sb = " + sb); // jaysql → 원본이 변했다.
        System.out.println("deletecharAt() = " + sb.deleteCharAt(2)); // jasql
        System.out.println("sb = " + sb); // jasql → 원본이 또 변했다.

        /* comment.
        *   insert() : 인자로 전달한 값을 문자열로 변환 후 지정한 위치에 삽입
        *   reverse() : 문자열 인덱스 순번을 역순으로 재배치 */

        System.out.println("insert() : " + sb.insert(1,"avamy"));
        // 첫번째 인덱스를 밀어내고 avamy가 들어옴, 첫번째 인덱스인 a 는 그 뒤로

        System.out.println("reverse() : " + sb.reverse()); // 딱히 쓸 데가 없다.
    }

}
