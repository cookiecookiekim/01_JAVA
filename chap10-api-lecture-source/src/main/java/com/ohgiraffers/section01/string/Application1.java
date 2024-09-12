package com.ohgiraffers.section01.string;

public class Application1 { // 24-09-12 (목) 3교시 API - String 클래스

    public static void main(String[] args) {

        /* title. String 클래스의 자주 사용하는 메서드에 대해 숙지할 수 있다. */
        /* comment.
        *   charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환 */

        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) { // ();는 스트링 클래스에서 제공하는 메서드이다~
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }
        /* comment.
        *   concat() : 문자열에 인자로 전달된 문자열을 합쳐서
        *   새로운 문자열로 반환한다.
        *   단 원본 문자열에는 영향을 주지 않는다. */

        String str2 = "java";
        String str3 = "mysql";

        System.out.println("concat() 메서드 활용 : " + (str2.concat(str3))); // javamysql
        System.out.println("concat() 동작 후 str2의 값 : " + str2); // java

        /* comment.
        *   trim() : 앞 뒤에 공백을 제거한 문자열을 반환한다. */

        String trimStr = "   java   ";
        System.out.println("trimStr : @" + trimStr + "@"); // @는 공백 확인용
        System.out.println("trim() : @" + trimStr.trim() + "@"); //@java@
        System.out.println("trimStr = " + trimStr); // 원본은 영향 받지 않음.

        /* comment.
        *   toLowerCase() : 모든 문자를 소문자로 바꿔줌
        *   toUpperCase() : 모든 문자를 대문자로 바꿔줌
        *   원본에 영향 미치지 않음 */

        String caseStr = "JavaMySQL";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        /* comment.
        *   substring() : 문자열의 일부를 잘라내어 새로운 문자열 반환 */
        String str4 = "javaMySQL";
        //3번재 열부터 시작하여 6번쨰 열 전까지 출력
        System.out.println("substring(3,6) : " + str4.substring(3,6)); // aMy
        //3번재 열부터 시작
        System.out.println("substring(3) : " + str4.substring(3)); // aMySQL

        /* comment.
        *   replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 사용한다. */
        System.out.println("replace() : " + str4.replace("java", "python"));
        // pythonMySQL 출력 (java를 python으로 대체하겠다.)

    }
}
