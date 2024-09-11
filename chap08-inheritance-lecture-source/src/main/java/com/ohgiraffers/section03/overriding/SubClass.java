package com.ohgiraffers.section03.overriding;
// 그냥 알아두면 좋은 것 : class에 final 키워드 붙으면 상속을 제한하는 의미.
public class SubClass extends SuperClass { // 24-09-11 (수) 4교시 상속 / 오버라이딩
    /* index. 1. 메서드 이름 변경하면 오류 발생 */
//    @Override
//    public void method2(int num) {} // Superclass에 있는 method와 이름이 달라서 사용 불가

    /* index. 2. 메서드의 리턴타입 변경하면 오류 발생 */
//    @Override
//    public int method(int num) {return 0;} // Superclass에 있는 method는 void형 이므로 사용 불가

    /* index. 3. 매개변수의 개수, 타입 변경 시 오류 발생 */
//    @Override
//    public void method(String num){} // Superclass에 있는 method는 매개변수가 int 형

    /* index. 4. 메서드 이름, 리턴타입, 매개변수 개수, 타입, 순서 모두 일치해야 가능 */
    @Override
    public void method (int num) {}

    /* index. 5. private 메서드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod() {}  // private은 어떤 방식이든 사용 불가

    /* index. 6. final 메서드 오버라이딩 불가 */
//    @Override
//    public final void finalMethod() {}

    /* index. 7. 부모 메서드의 접근제한자와 같거나 더 넓은 범위로 해야 가능. */
//    @Override
//    void protectedMethod() {} // Superclass(부모) 보다 범위가 더 좁아서 불가능.

//    @Override
//    protected void protectedMethod() {} // Superclass(부모)와 같은 범위는 가능.

    @Override
    public void protectedMethod() {} // Superclass(부모)(protected) 보다 범위가 더 넓으(public)므로 가능하다.

}
