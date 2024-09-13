package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

// 24-09-13 (금) 4교시 제네릭 app2
public class Application2 { // 헷갈리다.. 복잡하다... 흐름 파악하자.

    public static void main(String[] args) {

        /* title. 와일드카드에 대해 이해할 수 있다. */
        /* comment. 와일드카드 (WildCard)
        *   제네릭 클래스 타입의 객체를 메서드의 매개변수로 받을 때
        *   그 객체의 타입 변수를 제한할 수 있다.
        *   <?> : 제한 없음 (다 가능)
        *   <? extends Type> : 와일드 카드 상한 제한
        *   (Type과 Type의 후손을 이용한 인스턴스만 사용 가능)
        *   <? super Type> : 와일드카드 하한 제한
        *   (Type과 Type의 부모를 이용한 인스턴스만 인자로 사용 가능) */

        WildCardFarm wildCardFarm = new WildCardFarm();

        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        /* comment
        *   Bunny 이거나 Bunny의 후손 토끼 농장만 매개변수로 사용 가능하고
        *   상위 타입인 Rabbit은 매개변수로 사용 불가능. */
//        wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny()));
    }
}
