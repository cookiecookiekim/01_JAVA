package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;
// 다행인건 우리가 제네릭 클래스를 만들 일은 없을 거다..!
// 24-09-13 (금) 3교시 제네릭 app1
public class Application1 {

    public static void main(String[] args) {

        /* title. extends 키워드를 사용해서 특정 타입만
        *   사용할 수 있도록 범위를 제한할 수 있다. */

        // Animal은 Rabbit이거나 Rabbit의 후손이 아니다.
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();

        /* comment. extends 키워드로 Rabbit 후손들은 인스턴스 생성 가능. */
        RabbitFarm<Rabbit> farm3 = new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>();

        farm3.setAnimal(new Rabbit()); // type이 클래스이므로, 객체를 넣어줘야함.
        farm3.getAnimal().cry(); // 꺼내어고, 울어라라고 명령을 내린 것.
        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();
        farm5.setAnimal((new DrunkenBunny()));
        farm5.getAnimal().cry();



    }
}
