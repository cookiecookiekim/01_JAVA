package com.ofgiraffers.section01.method;

public class Application5 { // 24-08-29 (목) 3교시 메소드 return 연산의 값을 다시 가지고 온다.

    public static void main(String[] args) {

        /* title. 메소드 리턴에 대해 이해할 수 있다. */
        /* comment. return이란?
        *   모든 메소드 내부에는 return;이 존재한다.
        *   void 형의 메소드는 return;을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동 추가 해준다.
        *   **중요** return은 현재 메소드를 강제종료하고 호출한 구문으로 돌아가는 명령어이다. **중요** */

        System.out.println("main 시작함...");

        Application5 app5 = new Application5 ();
        app5.testMethod();

        System.out.println("main 종료됨...");

    }

    public void testMethod () {
        System.out.println("testMethod() 호출됨...");
        System.out.println("testMethod() 종료됨...");
        return; // 회식으로 표기되면 [안 써도 되는 것 or 안 쓰고 있는 것]
        /* comment. return 키워드는 컴파일러에 의해 자동으로 가장 마지막 줄에 추가된다.
        *   만약 가장 마지막 줄에 쓰지 않게 되면 도달할 수 없는 코드가 되어 컴파일 에러를 발생 시킨다. */

        // System.out.println("종료됐나?"); // return;으로 강제 종료 후, 출력했으므로 'unreachable statement 도달할 수 없는 코드' 오류 발생
    }
}
