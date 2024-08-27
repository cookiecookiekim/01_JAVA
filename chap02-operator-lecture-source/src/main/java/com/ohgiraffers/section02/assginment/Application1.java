package com.ohgiraffers.section02.assginment;

public class Application1 { // 24-08-27 (화) 5교시 - 대입연산자

    public static void main(String[] args) { // 외울 필요는 없고 이해만 하면 된다. 나중에 코드 짤 때 기억 안 나면 여기 와서 보는걸로.

        /* title. ☆대입연산자와 산술 복합 대입 연산자를 이해할 수 있다. */

        /* comment.
            '=' : 오른쪽의 피연산자를 왼쪽의 피연산자에 대입함
            '+=' : 오른쪽의 피연산자를 더한 결과를 왼쪽의피 연산자에 대입
            '-=' :
            '*=' :
            '/=' :
            '%=' :
         */

        int num = 12;
        System.out.println("num = " + num);
        num = num + 3;
        System.out.println("num = " + num);
        num += 3; // num = num + 3;
        System.out.println("num = " + num);
        num -= 5; // num = num - 5;
        System.out.println("num = " + num);
        num *= 2;
        System.out.println("num = " + num);
        num /= 2;
        System.out.println("num = " + num);
        num =- 5;
        System.out.println("num = " + num); // (-= o) , (=- x) 주의사항, 작성 순서가 바뀌게 되면 -5 숫자를 num 공간에 대입.
    }
}
