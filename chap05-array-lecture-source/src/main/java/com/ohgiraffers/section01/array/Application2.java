package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 { // 24-09-04 (수) 2교시 배열 이어서... (배열은 이해가 넘 안 된다.)

    public static void main(String[] args) {

        /* title. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
        /* comment. 배열의 사용 방법
        *   1. 배열의 선언
        *   2. 배열의 할당
        *   3. 배열 인덱스 공간에 값 대입 */

        /* index. 1. 배열의 선언 */
        /* comment.
        *   자료형[] 변수명; ← 이걸 더 많이 씀!
        *   자료형 변수명[]; */

        /* comment. 선언 stack 영역에 배열의 주소를 보관할 수 있는 공간을 만드는 것. */
        int[] iarr; // '주소' 값에 담을 준비
        char carr[]; // '주소' 값에 담을 준비
        /* index. 2. 할당 */
        /* comment.
        *   우리가 위에서 선언한 래퍼런스변수(참조형변수)(주소 변수)에 배열을 할당하여 대입할 수 있다.
        *   new 할당 연산자는 heap 영역에 공간을 할당하고, 발생한 주소값을 반환해주는 연산자이다.
        *   발생한 주소를 레퍼런스 변수에 저장하고 이것을 참조하여 사용하기 때문에 참조자료형(reference type)이라고 한다. */

        // 배열 할당 시 반드시 배열의 크기를 지정해 주어야 한다.
        iarr = new int[5];
        carr = new char[10];

        /* 이렇게 선언과 동시에 할당을 할 수도 있다. */
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];

        /* comment. heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근을 하는 것이다.
            stack에 저장된 주소로 heap에 할당이 된 배열을 찾아갈 수 있다. */
        System.out.println("iarr2 = " + iarr2); // iarr2 = [I@1bc1ae4 ← 16진수로 출력 (알아먹기 힘드므로 10진수로 바꿔줘야 한다.)
        System.out.println("carr2 = " + carr2); // carr2 = [C@11d7fff ← 16진수로 출력 (알아먹기 힘드므로 10진수로 바꿔줘야 한다.)

        /* comment.
            hashcode() : 일반적으로 객체의 주소값을 10진수 → 우리가 알고있는 정수로 바꿔주는 메서드 동일 객체인지 비교할 때 주로 쓰인다. */

        System.out.println("iarr2의 hashcode : " + iarr2.hashCode()); // iarr2의 hashcode : 29104868 (고유값) (우리가 아는 10진수로 출력)
        System.out.println("carr2의 hashcode : " + carr2.hashCode()); // carr2의 hashcode : 18710527 (고유값) (우리가 아는 10진수로 출력)

        /* comment.
        *   배열의 길이를 알 수 있는 기능을 필드로 제공하고 있따.
        *   length
        *   - 필드는 뒤에서 다룰거지만, 일종의 변수라고 생각하면 된다. */

        System.out.println("iarr2의 길이 : " + iarr2.length); // iarr2의 길이 : 5
        System.out.println("carr2의 길이 : " + carr2.length); // carr2의 길이 : 10

        /* index. 3. 변수를 사용해서 배열의 길이 지정해보기. */
        Scanner scr = new Scanner(System.in);
        System.out.print("새로 할당할 배열의 길이를 입력해 주세요 : ");
        int size = scr.nextInt(); // ex) 5
        double[] darr = new double[size];
        System.out.println("darr의 hashcode : " + darr.hashCode()); //수정 후 darr의 hashcode : 6384802
        System.out.println("darr의 길이 : " + darr.length); // 수정 후 darr의 길이 : 10

        /* comment. 하지만, 한 번 지정한 뱌열의 크기는 변경하지 못한다.
        *   배열의 사이즈를 5에서 10으로 쪼개는 게 아닌 새로운 공간을 할당해서 주소값을 레퍼런스 변수에 덮어쓴 것이다. */

        darr = new double[10]; // new 키워드가 있을 때 마다 새로운 공간을 만들어서 바꿔치기해준다.
        System.out.println("수정 후 darr의 hashcode : " + darr.hashCode()); // 수정 후 darr의 hashcode : 6384802
        System.out.println("수정 후 darr의 길이 : " + darr.length); //수정 후 darr의 길이 : 10

        /* comment.
        *   한 번 할당된 배열은 지울 수 없다.
        *   다만 레퍼런스 변수를 null로 변경하여 더이상 주소를 참조할 수 없게된 배열은 일정 시간이 지나면
        *   heap의 old 영역으로 이동하여 GC(가비지 컬렉터)(temurin 깔 때 깔림)가 삭제를 해준다. */

        darr = null; // 해당하는 주소를 null로 바꿨다는 뜻
        /* comment. NullPointerException
        *   아무것도 참조하지 않고, null이라는 특수한 값을 참조하고 있는 경우에 참조연산자(.)을 사용하게 될 때 발생하는 에러
        *   가장 많이볼 에러 중 1개이다. */
        // System.out.println("삭제 후 darr의 길이 : " + darr.length); → 출력시 NullPointerException 에러 발생

    }
}
