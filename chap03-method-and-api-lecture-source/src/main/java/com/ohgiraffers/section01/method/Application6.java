package com.ohgiraffers.section01.method;

public class Application6 { // 24-08-29 (목) 3교시 자료형 메소드 return 이어서. ★이해 필요★

    public static void main(String[] args) {

        /* title. 메소드의 리턴값에 대해 이해하고 활용할 수 있다.*/
        /* comment. 메소드의 리턴값 테스트
        *   메소드는 항상 마지막에 돌아가야 한다 → return이 존재한다.
        *   where? → 자신을 부른(호출한) 쪽으로 가야 한다.
        *   복귀를 할 때, 그냥 복귀할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        *   이때 가지고 가는 값을 '리턴값' 이라고 한다. */

        /* comment.
        *   return 값을 반환받기 위해서는 메소드 선언부에 리턴 타입을 명시해 주어야 한다.
        *   void는 아무 반환값도 가지지 않겠다는 키워드이고, return 구문을 생략해도 컴파일러가 자동으로 추가해 주지만,
        *   반환값이 있는 경우(void가 아닌 int , String 등)는 return 구문을 반드시 명시적으로 작성을 해주어야 한다.
        *   또한, 리턴타입의 반환값의 자료형은 반! 드! 시! 일치해야 한다. (자바는 자료형이 정말 중요하다.) */

        System.out.println("main 시작됨...");
        Application6 app6 = new Application6();
        /* comment.
        *   메소드를 호출 했을 때 main 시작과 끝 출력문만 나온다. 그러나 호출은 된 상태이다.
        *   "안녕하세요" 값이 출력이 안 되는 이유는 '값 = 리터럴' 값을 출력하는 구문이 없기 때문이다.
        *   호출한 메소드가 종료되면서 호출구문 [(app6.testMethod();] 자체가 반환값이 된 것. (반환값 : return 구문에 작성한 값) */
        app6.testMethod(); // 이 구문 자체가 리터럴 즉 "안녕하세요" → app6.testMethod(); = "안녕하세요"

        System.out.println(app6.testMethod());
        String hi = app6.testMethod(); // 변수에 담을 수 있다.
        System.out.println("hi = " + hi);

        System.out.println("main 종료됨...");

    }
    // void가 아닌 자료형(ex String)을 사용함 → return 반드시 써야 함.
    public String testMethod() {

        return "안녕하세요";
    }
}
