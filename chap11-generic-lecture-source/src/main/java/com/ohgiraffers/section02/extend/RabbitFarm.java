package com.ohgiraffers.section02.extend;
// 24-09-13 (금) 3교시 제네릭 (Snake 같은 다른 애들 못들오게 제한 걸기)

// 토끼를 위한 농장 생성
public class RabbitFarm <T extends Rabbit> {//Rabbit 상속받는 애들만
    /* <T extends Rabbit>의 의미
    * 타입변수(T)가 뭐가 될 지 모른다.
    * 하지만 extends Rabbit이라고 설정을 하게 되면
    * 토끼이거나, 토끼를 상속받는 애들은 다 가능하다. */

    // 전역 변수 설정
    private T animal;

    // 기본 생성자
    public RabbitFarm () {
    }

    // 모든 필드 초기화 하는 메서드
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    // getter, setter
    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
