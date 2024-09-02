package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for { // 24-09-02 월 for문 기초

    public void testSimpleForStatement () {

        /* title. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* comment. [for문 표현식]
        *   for(초기식; 조건식; 증감식;) {
        *   조건을 만족하는 경우 수행할 구문(반복구문);
        *    }*/
        /* index. 문제
        *   1부터 10까지 1씩 증가시키면서 i값을 출력하는 반복문 */
        // 초기식 : int 1 = 1;
        // 조건식 : i <= 10;
        // 증감식 : i++
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testForExample1 () { // for문의 사용 이유는 아래 코드와 같다. 코드가 길어지고 비효율 적이다
        /* title. 무엇을 반복하는지를 확인해서 반복문으로 개선할 수 있다. */
        /* comment. 10명의 학생 이름을 입력받아 이름을 출력해보자. */
        Scanner scr = new Scanner(System.in);
        System.out.print("1 번째 학생의 이름을 입력해 주세요 : ");
        String student1 = scr.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + " 입니다.");

        System.out.print("2 번째 학생의 이름을 입력해 주세요 : ");
        String student2 = scr.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + " 입니다.");

        System.out.print("3 번째 학생의 이름을 입력해 주세요 : ");
        String student3 = scr.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + " 입니다.");

        System.out.print("4 번째 학생의 이름을 입력해 주세요 : ");
        String student4 = scr.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + " 입니다.");

        System.out.print("5 번째 학생의 이름을 입력해 주세요 : ");
        String student5 = scr.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + " 입니다.");

        System.out.print("6 번째 학생의 이름을 입력해 주세요 : ");
        String student6 = scr.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + " 입니다.");

        System.out.print("7 번째 학생의 이름을 입력해 주세요 : ");
        String student7 = scr.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + " 입니다.");

        System.out.print("8 번째 학생의 이름을 입력해 주세요 : ");
        String student8 = scr.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + " 입니다.");

        System.out.print("9 번째 학생의 이름을 입력해 주세요 : ");
        String student9 = scr.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + " 입니다.");

        System.out.print("10 번째 학생의 이름을 입력해 주세요 : ");
        String student10 = scr.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + " 입니다.");

        /* comment. 반복해야 하는 내용
        *   1. 안내문구
        *   2. 학생의 이름 입력 받아, 변수에 저장
        *   3. 저장된 이름을 출력 */

        System.out.println("===================== 위의 코드와 아래 코드가 동일하게 작동 ======================)");

        /* comment. 둘 중 어떤 코드가 좋을까?
        *   둘 다 요구사항을 만족했기 때문에 좋은 코드다.
        *   하지만 반복문을 사용하는 것이 더 좋은 코드이다.
        *   첫 번째 코드보다 간결하게 작성 되었다 (가독성 상승)
        *   학생 이름 뿐 아니라 성적 등등 기능이 추가돼야 한다면?  → 코드 하나만 추가하면 끝. (유지보수성 상승) */

        for (int i = 1; i <= 10; i++) { // 위의 코드와 비교해서 정말 간단해졌다.
            System.out.print(i + " 번째 학생의 이름을 입력해 주세요 : ");
            String student = scr.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + " 입니다.");
        }

    }

    public void testForExample2 () {
        /* index. 2. 1부터 10까지의 합계를 구하시오. */
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 = sum2 + i; // sum2 += i;

        }
        System.out.println(sum2);

    }

    public void testForExample3 () {
        /* index. 1. 문제
        *   5 ~ 10 사이의 난수를 발생시켜서 1부터 발생한 난수까지의 합계를 구해보자. */
        System.out.println("============↓ 내가 푼 값 ↓=================");
        Random rd = new Random();
        int nan = rd.nextInt(6) + 5;
        int sum1 = 0;
        for (int i = 1; i <= nan; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("1부터 " + nan + "까지의 합은 : " + sum1);
        
        System.out.println("=================↓ 선생님 풀이 ↓===============");

        int random = (int)(Math.random() * 6) + 5;
        int sum = 0;
        for (int i = 1; i <= random; i++) {
            sum = sum + i;
        }
        System.out.println("1부터 " +random + "까지의 합은 : " + sum);
    }

}
