package com.ohgiraffers.section02.stringbuilder;

public class Application1 { // 24-09-12 (목) 5교시 StringBuilder


    public static void main(String[] args) {

        /* title. String과 StringBuilder의 차이를 알 수 있다. */

        /* comment. String과 StringBuilder의 차이
        *   String : 불변이라는 특성을 가짐
        *   문자열에 + 연산으로 합칠 경우,
        *   기존의 인스턴스를 수정하는 게 아닌 새로운 인스턴스를 반환
        *   따라서 문자열 변경이 많이 일어나는 경우, 성능상 좋지 않음.
        *   반대로 변하지 않는 문자열의 경우, 오히려 좋음. */

        /* comment. String과 StringBuilder의 차이
            StringBuilder : 가변이라는 특성을 가짐
            append()라는 메서드를 이용해서 문자열 합칠 수 있는데
            기존의 인스턴스를 수정할 뿐, 새로운 인스턴스 생성하지 않음.
            잦은 변경이 많다면 String보다 성능이 좋다. */

        String str = "java"; // 이미 toString()이 오버라이딩 돼있음.
        System.out.println("str = " + str); // java 출력.

        // toString() 메서드가 오버라이딩 되어 있음.
        StringBuilder sb = new StringBuilder("java");
        System.out.println("sb = " + sb);
        System.out.println("sb의 hashcode() : " + sb.hashCode());

        // append("합칠문자열")
        sb.append("mysql");
        System.out.println("sb = " + sb);
        /* comment.
        *   hashcode()를 확인했을 때, 인스턴스가 동일한 것을 확인했다.
        *   즉, 문자열을 변경했다고 새로운 인스턴스가 생성된 것이 아니다.*/
        System.out.println("문자열 합치기 후 sb의 hashcode() : " + sb.hashCode());


    }
}
