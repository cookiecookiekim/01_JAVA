package com.ohgiraffers.section01.polymorphism;

public class Application3 { // 24-09-11 (수) 6교시 클래스 - 다형성 예시 추가

    public static void main(String[] args) {

        /* title. 다형성을 적용하여 리턴 타입에 활용할 수 있다. */
        /* comment. 랜덤한 동물 인스턴스를 반환받아 울부짖게 만들기
        *                (개구리와 너구리는 동물) */
        Application3 app3 = new Application3();
        Animal random = app3.getRandomAnimal();

        random.울부짖기(); // 출력할때마다 너구리, 개구리 번갈아가며 나옴

    }
    public Animal getRandomAnimal() {
        int random = (int)(Math.random()*2 + 0); // 개구리, 너구리 2개

        return random == 0 ? new Raccoon() : new Frog(); // new 앞에 (동물) 생략
    }

}
