package com.ohgiraffers.section01.polymorphism;

public class Application2 { // 24-09-11 (수) 6교시 클래스 - 다형성 이어서

    public static void main(String[] args) {

        /* title. 다형성을 사용해서 객체배열 만들어, 연속 처리 */
        Animal[] animal = new Animal[5];
        animal[0] = new Frog(); // new 앞에 (동물) 생략, up-casting
        animal[1] = new Raccoon();
        animal[2] = new Frog();
        animal[3] = new Raccoon();
        animal[4] = new Frog();

        for (int i = 0; i < animal.length; i++) {
            animal[i].울부짖기();
        }
        for (int i = 0; i < animal.length; i++) {
            // 동물들아 네가 개구리면 낼름공격을 하고,
            // 네가 너구리면 깨물기를 해라
            if (animal[i] instanceof Frog) {

                ((Frog)animal[i]).낼름공격();

            } else if (animal[i] instanceof Raccoon) {

                ((Raccoon)animal[i]).깨물기();
            }
        }
    }

}
