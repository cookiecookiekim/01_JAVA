package com.ohgiraffers.section02.copy;

public class Application1 { // 24-09-05 (목) 1교시, 배열 - 얕은 복사

    public static void main(String[] args) {

        /* title. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */
        /* comment.
        *   배열의 복사에는 크게 두 가지 종류가 있음.
        *   1. 얕은 복사(shallow copy) : stack의 주소값만 복사
        *   2. 깊은 복사(deep copy) : heap의 배열에 저장된 값 복사 */

        /* comment.
        *   얕은 복사란 stack에 저장되어있는 배열의 주소값만 복사하는 것이다. 따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값 소유.
        *   하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게되면,
        *   다른 레퍼런스 변수로 배열에 접근했을때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있음. */

        /* index. 1. 얕은 복사 확인을 위한 원본 배열 만들기 */
        int[] originArr = {1, 2, 3, 4, 5};

        /* index. 2. 새로운 배열 만들어서 주소 복사하기 */
        int[] copyArr = originArr;

        /* index. 3. hashcode()를 사용해서 진짜로 같은지 비교 */
        System.out.println("원본 배열의 주소값 : " + originArr.hashCode());
        System.out.println("복제 배열의 주소값 : " + copyArr.hashCode());

        /* index. 4. 원본 배열과 복제 배열의 값을 반복문을 통해 출력 */
        for (int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        /* index. 5. 복제한 배열의 값을 수정하고, 원본도 반영되었는지 확인 */
        copyArr[0] = 99;

        System.out.println();

        for (int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        
    }
}
