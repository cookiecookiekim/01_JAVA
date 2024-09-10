package com.ohgiraffers.section02.use;

public class MemberManager { // 24-09-10 (화) 5교시 클래스 - 회원 관리 프로그램 만들어 보기

    /* comment.
    *   사용자에게 회원등록 및 회원 조회 요청을 받게 되면 등록 관련 클래스에게 명령
    *   1. 등록 관련 클래스에게 명령
    *   2. 조회 관련 클래스에게 명령 */

    public void signUpMembers () { // 1번 눌렀을때 DTO에 보낼 배열 작성

        MemberDTO[] members = new MemberDTO[5]; // 배열 안에 있는 애들이 하나하나 클래스다..
        members[0] = new MemberDTO(1, "user01", "pass01", "푸바오", 4, '여');
        members[1] = new MemberDTO(2, "user02", "pass02", "아이바오", 7, '여');
        members[2] = new MemberDTO(3, "user03", "pass03", "러바오", 7, '남');
        members[3] = new MemberDTO(4, "user04", "pass04", "후이바오", 1, '여');
        members[4] = new MemberDTO(5, "user05", "pass05", "루이바오", 1, '여');

        MemberInsertManager insertManager = new MemberInsertManager(); // 회원 등록에 특화된 직원 (메서드 생성)
        insertManager.insert(members);
    }

    public void searchAllMembers() {

        MemberSeachManager searchManager = new MemberSeachManager();
        MemberDTO[] result = searchManager.searchAllMembers();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
        for (MemberDTO c : result){
            System.out.println(c);
        }
    }
}
