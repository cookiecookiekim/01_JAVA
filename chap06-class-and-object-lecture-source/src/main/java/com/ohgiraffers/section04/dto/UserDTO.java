package com.ohgiraffers.section04.dto;

import java.time.LocalDateTime;

public class UserDTO { // 24-09-09 (월) 3교시, 클래스와 객체 (DTO 클래스의 규칙과 틀)

    /* title. 앞으로 사용할 DTO 클래스의 규칙과 틀에 대해 이해할 수 있다. */
    /* comment.
    *   1. 모든 필드는 private으로 캡슐화 적용하여 작성해야 한다.
    *   2. 기본 생성자는 명시적으로 존재해야 한다.
    *   3. 매개변수가 있는 생성자는 선택사항이다.
    *   4. 모든 필드에 접근할 수 있는 setter와 getter는 public으로 작성해야 한다. */

    /* index. 1. 필드 작성 */ // 이걸 보면 기계적으로 쭉쭉 나와야 한다.
    private String id;
    private String pwd;
    private String name;
    private LocalDateTime enrollDate;

    /* index. 2. (명시적으로) 기본 생성자 작성 */
    public UserDTO() {} // 언제 추가할지 모르기 때문

    /* index. 3. 매개변수가 있는 생성자는 선택이다.
        하지만 모든 필드를 초기화하는 생성자를 만드는 경우가 많다.*/

    public UserDTO(String id, String pwd, String name, LocalDateTime enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /* index. 4. private인 필드에 접근할 수 있는 getter 와 setter */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDateTime enrollDate) {
        this.enrollDate = enrollDate;
    }

    /* index. 5. toString() 메서드 오버라이딩 */
    /* comment. 접근자로 값을 출력하는 구문이 번거롭기 때문에
    *   모든 필드의 값을 하나의 문자열로 반환해주는 메서드 */

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
