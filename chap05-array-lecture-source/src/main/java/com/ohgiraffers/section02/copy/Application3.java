package com.ohgiraffers.section02.copy;

import java.util.Arrays;

public class Application3 { // 24-09-05 (목) 3교시 배열 (깊은 복사) // 뭔말인지....

    public static void main(String[] args) {

        /* title. 깊은 복사에 대해 이해할 수 있다.*/ // 원본 형태는 유지하되, 그걸 이용해서 뭘 할 때
        /* comment. 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을 또 다른 배열에 복사해둔 것이다.
        *   서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기 때문에 원본 또는 복제본을 수정하더라도
        *   서로 영향을 미치지 않는다. */

        /* comment. 깊은 복사를 하는 4가지 방법.
        *   1. for문을 이용한 동일 인덱스 값 복사
        *   2. Object의 clone() 메서드를 이용한 값 복사
        *   3. System의 arraycopy() 메서드를 이용한 값 복사 // 안 쓰니까 깊게 생각 X
        *   4. Arrays의 copyOf() 메서드를 이용한 값 복사 // 이것만 기억하자.
        *   이 중 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy() 메서드이며,
        *   가장 많이 사용되는 방식은 copyOf() 메서드이다.
        *   clone()은 이전 배열과 같은 배열 밖에 만들지 못하는 특징이 있으며,
        *   그 외 3가지 방법은 복사하는 배열의 길이를 조절할 수 있다는 장점이 있다. */

        int[] originArr = new int[]{1, 2, 3, 4, 5};
        print(originArr);

        /* index. 1. for문을 이용한 인덱스 값 복사 */
        int[] copyArr1 = new int[10];

        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        /* index. 2. Object의 clone()을 이용한 값 복사 */
        int[] copyArr2 = originArr.clone();
        print(copyArr2);

        /* index. 3. System의 arraycopy()를 이용한 복사 */ // 휴.. 이거 안 쓰니까 그냥 버려~~
        int[] copyArr3 = new int[10];
        /* 전달 인자
        * 1. 원본 배열 (originArr)
        * 2. 복사를 시작할 인덱스
        * 3. 복사본 배열(copyArr3)
        * 4. 복사를 시작할 인덱스
        * 5. 복사할 길이 */
        System.arraycopy(originArr,0, copyArr3, 3, originArr.length); // 휴.. 이거 안 쓰니까 그냥 버려~~
        print(copyArr3);

        /* index. 4. Arrays의 copyOf() 메서드를 이용한 복사 */ // 이것만 기억하자.
        /* 전달 인자 1. 복사하고 싶은 배열(originArr), 2. 만들고 싶은 배열의 길이 */
        int[] copyArr4 = Arrays.copyOf(originArr, 8);
        print(copyArr4);

    }

    public static void print(int[] 전달받은배열을저장할매개변수) {

        System.out.println("전달받은 배열의 hasecode() : " + 전달받은배열을저장할매개변수.hashCode());

        for (int i = 0; i < 전달받은배열을저장할매개변수.length; i++) {
            System.out.print(전달받은배열을저장할매개변수[i] + " ");
        }
        System.out.println();

    }
}
