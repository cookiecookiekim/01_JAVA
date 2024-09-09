package com.ohgiraffers.section05.parameter;

public class Application { // 24-09-09 (월) 5~6교시 클래스와 메서드 파라미터

    public static void main(String[] args) {

        /* title. 메서드의 파라미터에 대해 이해할 수 있다. */
        /* comment. 매개변수(parameter)로 사용 가능한 자료형
        *   1. 기본자료형
        *   2. 기본자료형 배열
        *   3. 클래스 자료형
        *   4. 클래스 자료형 배열
        *   5. 가변인자 */

        ParameterTest pt = new ParameterTest();

        /* index. 1. 기본 자료형 매개변수 전달 */
        int num = 20;
        pt.testPrimaryParameter(num);

        /* index. 2. 기본 자료형 배열을 매개변수로 전달받는 메서드 호출 */
        int[] iarr = {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);

        pt.testPrimaryArrayParameter(iarr);

        System.out.print("메서드 전달 후 원본 배열의 값 확인 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* index. 3. 클래스 자료형 매개변수 전달 */

        RectAngle r1 = new RectAngle(12.5, 22.5); // 생성자에 값 넣을 때에는 바로


        System.out.println("인자로 전달하는 클래스 자료형 값 : " + r1);
        pt.testClassParameter(r1);

        /* index. 5. 가변인자 */
        /* comment. 가변인자 : 인자로 전달하는 값의 개수가 정해지지
        *                   않는 경우에 사용하는 배열이다. */
        /* comment. 가변인자는 매개변수가 여러 개일 때, 반드시 뒤에 작성해야 한다.
        *   → 가변인자의 끝을 알 수 없기 떄문에 */
        pt.testVariableLengthParameter("조평훈"); // 받는 게 두 개인데 하나만 보내도 오류가 안 난다.
        //                                             가변인자는 전달하지 않아도 된다. (String...hobbies)
        pt.testVariableLengthParameter("김규남", "야구");
        pt.testVariableLengthParameter("김규남", "야구", "볼링", "축구");
        pt.testVariableLengthParameter("김규남", "테니스", "볼링", "야구", "축구");

    }

}
