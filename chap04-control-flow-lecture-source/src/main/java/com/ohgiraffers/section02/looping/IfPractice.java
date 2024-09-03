package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class IfPractice {

    public void PracticeIf1() {
        Scanner scr = new Scanner(System.in);
        System.out.print("나이가 어떻게 되세요 ? : ");
        int adult = scr.nextInt();

        if (adult > 19) {
            System.out.print(adult + " 세, 판매 가능합니다.");
        } else {
            System.out.println("판매 불가능 합니다. 음료 코너에서 골라 주세요. ");
        }

    }

    public void PracticeIf2() {
        Scanner scr = new Scanner(System.in);
        System.out.print("짝홀, 그 결과는? (1은 짝수, 2는 홀수) : ");
        int number = scr.nextInt();


        if (number == 1) {
            System.out.println("짝수(1) 입니다!!");
        } else if (number == 2) {
            System.out.println("홀수(2) 입니다!!");
        } else {
            System.out.println("입력이 잘못 되었습니다. 다시 진행하세요. ");
        }
    }

    public void PracticeIf3 () {
        Scanner scr = new Scanner(System.in);
        System.out.print("당첨번호가 어떻게 되세요? : ");
        int point = scr.nextInt();

        if (point % 2 == 0 && point <= 10) {
            System.out.println("짝수네요! 모자 선물입니다!");
        } else if (point % 2 != 0 && point <= 10) {
            System.out.println("홀수네요! 인형 선물입니다!");
        } else {
            System.out.println("당첨 번호는 1 ~ 10 사이에만 있어요.");

        }

    }

    public void PracticeIf4 () {
        Scanner scr = new Scanner(System.in);

        System.out.print("체중을 입력하세요(kg) : ");
        double weight = scr.nextDouble();
        System.out.print("신장을 입력하세요(m) : ");
        double height = scr.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("귀하의 BMI는 " + bmi + " 입니다.");

        if (bmi < 20) {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요 !");
        } else if (20 <= bmi && bmi < 25) {
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요 !");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("축제에서 10,000보 걷고 오시면 상품을 드려요~!");
        } else if (bmi >= 30) {
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        } else {
            System.out.println("잘못된 체중입니다 다시 입력하세요.");
        }

    }
    public void PracticeIf5 () {
        Scanner scr = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = scr.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = scr.nextInt();
        System.out.print("연산 기호를 입력하세요 (+, -, *, /, %) : ");
        scr.nextLine();
        String str = scr.nextLine();
        int result = 0;

        switch (str) {
            case "+" :
                result = first + second;
                break;

            case "-" :
                result = first - second;
                break;

            case "*" :
                result = first * second;
                break;

            case "/" :
                result = first / second;
                break;

            case "%" :
                result = first % second;
                break;
        }
        System.out.println(first + " " + str + " " + second + " = " + result);

    }

    public void PracticeIf6 () {
        Scanner scr = new Scanner(System.in);
        System.out.print("어떤 간식을 주문하시겠어요? : ");
        int snack = scr.nextInt();

        int a = 15500; // 도토리 탕후루
        int b = 3000; // 츄로스
        int c = 2000; // 통감자
        int d = 5000; // 카라멜 팝콘

        if (snack == 1) {
            System.out.println("도토리 탕후루의 가격은  " + a + "원 입니다. ");
        } else if (snack == 2) {
            System.out.println("츄로스의 가격은  " + b + "원 입니다.");
        } else if (snack == 3) {
            System.out.println("통감자의 가격은  " + c + "원 입니다.");
        } else if (snack == 4) {
            System.out.println("카라멜 팝콘의 가격은  " + d + "원 입니다.");
        } else {
            System.out.println("해당 상품은 판매하지 않습니다.");
        }
        System.out.println("프로그램을 종료합니다.");

    }

    public void PracticeIf7 () {
        Scanner scr = new Scanner(System.in);
        System.out.print("성실(1) 점수를 입력하세요 : ");
        int a = scr.nextInt();
        System.out.print("서비스(2) 점수를 입력하세요 : ");
        int b = scr.nextInt();
        System.out.print("미소(3) 점수를 입력하세요 : ");
        int c = scr.nextInt();

        int avg = ((a + b + c)/3);

        if (avg >= 60 && a >= 40 && b >= 40 && c >= 40) {
            System.out.println("합격입니다!");
        } else {
        if (avg < 60) {
            System.out.println("평균 점수가 60 미만이므로 불합격 입니다.");
            }
        if (a < 40) {
            System.out.println("성실(1) 점수가 40 미만이므로 불합격 입니다.");
        }
            if (b < 40) {
                System.out.println("서비스(2) 점수가 40 미만이므로 불합격 입니다.");
            }
            if (c < 40) {
                System.out.println("미소(3) 점수가 40 미만이므로 불합격 입니다.");
            }
        }


    }

    public void PracticeIf8 () {
        Scanner scr = new Scanner(System.in);
        int result = scr.nextInt();

        int sum = 0;
        int month = 0;
        int earn = 0;
        int bonus = 0;

    }
}
