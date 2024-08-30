package com.ohgiraffers.section01.method;

public class Application9 { // 24-08-29 (목) 5교시 static 메서드 (static은 그렇게 많이 사용하지 않음, 이해만 하자)

    public static void main(String[] args) {

        /* title. 다른 클래스에 작성한 메서드를 호출할 수 있다. */
        /* comment. 우리는 Application에서 2개의 정수를 전달할 것이고, Calculator 클래스는 2개의 정수를 전달 받아,
         *   최소값을 구하는 메서드 (기능)
         *   최대값을 구하는 메서드 (기능)
         *   실행 후 Application에게 2개의 정수 중 큰 값과 작은 값이 무엇인지 알려줄 것이다. */

        int first = 20;
        int second = 5;

        Calculator calc = new Calculator();

        /* comment. non-static method 호출 방식 */
        calc.minNumberOf(first, second); // 삭제 가능한 코드 (min에 넣어 놨으니)

        int min = calc.minNumberOf(first, second);
        System.out.println("min = " + min);

        /* comment. static method 호출 방식 */
        /* comment. static 메서드도 non-static 메서드처럼 호출은 가능하나, 권장하지 않는다. → 노란 줄
        *   이미 메모리에 로딩이 되어있는 static 메서드는 여러 객체가 공유하게 된다.
        *   new 키워드로 접근하게 된다면, 공유된 값에 예상치 못한 동작을 유발할 수 있이 때문에 사용을 제한해 달라는 컴퓨터의 주의 문구. → 노란 줄 */
        Calculator.maxNumberOf(first, second); // 삭제 가능한 코드 (max에 넣어 놨으니)

        int max = Calculator.maxNumberOf(first, second); // static은 [클래스명.메서드명] 형식으로만 부르자. (노란 줄 뜬다..)
        System.out.println("max = " + max);

    }
}
