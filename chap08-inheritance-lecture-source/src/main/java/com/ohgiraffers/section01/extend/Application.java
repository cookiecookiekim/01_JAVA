package com.ohgiraffers.section01.extend;

public class Application { // 24-09-11 (수) 1~2교시 상속.

    public static void main(String[] args) {

        /* title. 상속에 대해 이해할 수 있다. */
        /* comment. 상속이란?
        *   현실세계의 상속과 비슷한 개념으로 부모가 가지고 있는
        *   멤버(필드, 메서드)를 자식이 물려받는 의미를 가지고 있다.
        *   클래스 또한 부모 클래스와 자식 클래스로 나뉘어, 부모가 가지는
        *   멤버를 자식이 물려받아 마치 자신의 것처럼 사용하는 것을 의미
        *   또한 물려받은 멤버를 확장하거나, 추가적인 멤버 작성도 가능하다.
        *   특히 메서드 재정의(overiding)라는 기술을 통해
        *   부모가 가진 메서드를 자식이 다시 정의하는 것이 가능하다.*/

        /* comment. Overriding이란? → 메소드를 재정의
        *   부모가 가지는 메서드 선언부를 그대로 사용하면서 자식 클래스가 정의한
        *   메서드대로 동작할 수 있도록 후년 몸체(영역)을 새롭게 다시 작성한 것
        *   메서드를 재정의 한다면 재정의 한 메서드가 우선 동작 한다.*/

        /* index. 1. Car 인스턴스 생성 후 메서드 호출 */
        Car car = new Car(); // Car 기본 생성자 호출

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println("================================");

        /* index. 2. FireCar 인스턴스 생성 */
        FireCar fireCar = new FireCar(); // FireCar 기본 생성자 호출
// 하지만 부모 클래스인 Car 기본생성자를 먼저 호출하고 자식(FireCar)기본생성자 호출
        fireCar.soundHorn();    // Car(부모) 클래스의 메서드 사용 가능
        fireCar.run();          // Car(부모) 클래스의 메서드 사용 가능
        fireCar.soundHorn();    // Car(부모) 클래스의 메서드 사용 가능
        fireCar.stop();         // Car(부모) 클래스의 메서드 사용 가능
        fireCar.soundHorn();    // Car(부모) 클래스의 메서드 사용 가능

//        fireCar.isRunning ();

        /* index. 3. 소방차가 너무 재미없게 경적을 울린다..(FireCar에 index 2로)
        *   그리고 소방차는 물을 뿌리는 기능도 있으면 좋겠다.(FireCar index3) */
        /* comment. 상속은 물려받는 것 뿐 아니라 확장도 가능하다. */
        fireCar.sprayWater();
//        car.sprayWater(); // 부모가 자식 클래스 사용은 불가하다.

        System.out.println("====================================");

        /* index. 4. 경운기 만들기. (경적이 없는 차라고 가정) */
        FarmCar farmCar = new FarmCar();

        /* comment. 이와 같이, 상속 기술 사용 시 장점
        *   1. 새로운 클래스 작성 시 기존 클래스 재사용 가능
        *   1-1. 재사용 시 생산성 향상 (새롭게 작성 안 해도 됨)
        *   1-2. 공통적으로 사용하는 코드가 부모 클래스에 존재하면
        *   수정사항이 생길 시, 부모 클래스만 수정해도 전체 사용 가능(유지보수성 증가)
        *   2. 클래스간의 계층 관계가 생기며 다형성 문법의 토대가 된다. */

        /* comment. 상속으로 인한 단점은?
        *   1. 부모 클래스의 기능을 추가,변경 시 자식 클래스가 정상 작동하는지 예측 어려움
        *      상속구조가 복잡해 질수록 그 영향에 대한 예측 힘들어짐.
        *   → 이런 복잡한 구조는 오히려 유지보수성 악화시킬 수 있음
        *   2. 부모 클래스의 변경이 쉽지 않고, 부모의 메서드 수정 시
        *      자식 클래스에 모두 영향을 미침.
        *   3. 부모 클래스에서 의이밌는 기능이 자식에겐 무의미 할 수도 있음.*/
    }

}
