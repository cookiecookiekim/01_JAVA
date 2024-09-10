package com.ohgiraffers.section06.singleton;

public class Application { // 24-09-10 (화) 2교시 클래스 - 지금까지 필드와 메서드만 스태틱으로 만들어 봤는데 이번에는.....!
                           // 이른 초기화와 게으른 초기화

    public static void main(String[] args) { // 많이 쓰지는 않으나 알아두면 좋다~

        /* title. 싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다. */
        /* comment. singleton 패턴이란
        *   어플리케이션이 시작될 때 어떠한 클래스가 최초 한 번만 메모리를 할당하고,
        *   그 메모리에 인스턴스를 만들고 하나의 인스턴스를 공유 및 사용하며
        *   메모리 낭비를 방지할 수 있게 한다.
        *   (즉, 매번 new 키워드를 사용해서 인스턴스를 생성하지 않는다.) */
        /* comment. 장점
        *   - 첫 번째 이용 시에는 인스턴스를 생성해야 하기 때문에 속도 차이가 나지만,
        *   - 두 번째 이용 시에는 인스턴스 생성 기간 없이 사용 가능.
        *   - 인스턴스가 절대적으로 한 개만 존재하는 것을 보장할 수 있다. */
        /* comment. 단점
        *   - 싱글톤 인스터늣가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아짐
        *   (결합도가 높아진다 → 한 곳 수정 시 다른 곳도 수정 필요)
        *   - 동시성 문제를 고려해야하기 때문에 난이도가 있다. */
        /* comment. 싱글톤 구현 방법
        *   - 1. 이른 초기화(Eager)
        *   - 2. 게이른 초기화(Lazy) */

        /* index. 1. 이른 초기화 구현 */
        // 기본 생성자가 private이기 때문에 인스턴스 생성할 수 없다.
//        EagerSingleton eagerSingleton = new EagerSingleton();

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("eager1의 hashcode() : " + eager1.hashCode()); //27381079
        System.out.println("eager2의 hashcode() : " + eager2.hashCode()); //27381079

        /* index. 2. 게으른 초기화 구현 */
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("lazy1의 hashcode() : " + lazy1.hashCode()); //24581131
        System.out.println("lazy2의 hashcode() : " + lazy2.hashCode()); //24581131

        /* comment. 이른 & 게으른 초기화의 장점
        *   이른 : 클래스를 로드하는 속도는 느리지만, 처음 인스턴스 반환 속도가 빠름.
        *   게으른 : 클래스 로드 속도는 빠르지만, 메서드를 통해 인스턴스를 생성하고 넘기기
        *           때문에 첫 번째 요청의 속도가 느리다는 특징을 가지고 있다. */
    }
}
