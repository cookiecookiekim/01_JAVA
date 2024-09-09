package com.ohgiraffers.section05.parameter;

public class RectAngle {  // 24-09-09 (월) 5~6교시 클래스와 메서드 파라미터

    private double width; // 너비
    private double height; // 높이

    public RectAngle(double width, double height) { // 생성자
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void calcArea() {

        double area = width * height;

        System.out.println("이 사각형의 넓이는 " + area + " 입니다.");

    }

    public void calcRound () {

        double round = (width + height) * 2;

        System.out.println("이 사각형의 둘레는 " + round + " 입니다.");

    }

    public void setHeight(int i) {

    }
}
