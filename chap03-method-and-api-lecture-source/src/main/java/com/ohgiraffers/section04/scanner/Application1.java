package com.ohgiraffers.section04.scanner;

import java.util.Scanner; // 24-08-30 (금) 4교시 메서드의 응용, 스캐너 기본

public class Application1 {

    public static void main(String[] args) {

        /* title. Scanner를 이요해서 값 입력 해보기 */

        /* index. 1. Scanner 클래스 사용할 준비 */
        Scanner sc = new Scanner(System.in);

        System.out.println("안녕");
        System.out.print("나는 ");
        System.out.println("김규남이야");

        /* index. 2-1. 문자열 입력 받기 */
        System.out.print("이름을 입력해 주세요 : ");
        String name = sc.nextLine();
        System.out.println("제 이름은 " + name + " 입니다.");

        /* index. 2-2. 정수형 값 입력 받기 */
        /* comment. nextInt() : 입력 받은 값을 int형으로 반환해 준다. */
        System.out.print("나이를 입력해 주세요 : ");
        int age = sc.nextInt();
        System.out.println("제 이름은 " + name + " 이고, 입력하신 나이는 " + age + " 세 입니다.");

        /* index. 2-3. 실수형 값 입력 받기 */
        System.out.print("키를 입력해 주세요 : ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는 " + height + " (cm) 입니다");

        /* index. 2-4. 논리형 값 입력 받기 */
        System.out.println("참과 거짓 둘 중 하나를 true of false로 입력해 주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력한 논리 값은 " + isTrue + " 입니다.");

        /* index. 2-5. 문자형 값 입력 받기 */
        /* comment. 아쉽게도 문자를 직접 입력받는 기능은 없다. 따라서 문자열로 입력을 받은 후 입력받은 문자에서
        *   원하는 순번의 문자를 분리해서 사용을 해야한다.
        *   charAt(int index)를 사용해서문자열을 분리할 수 있다.
            정수형으로 값을 넘기게 되면 문자열에서 해당하는 번호를 가진, 문자를 반환해주는 기능을 한다.
            * index 숫자 체계는 컴퓨터에서 많이 쓰이므로 0부터 시작함을 인지하고 적응해 두자 */
        sc.nextLine();
        System.out.print("아무 문자나 입력해 주세요 : ");
        char ch = sc.nextLine().charAt(1);
        System.out.println("입력하신 문자는 " + ch + " 입니다.");


    }
}
