package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BookManager;
import com.ohgiraffers.hw2.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu () {

    }

    public void mainMenu () {

        while (true) {

            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 프로그램 종료");

            System.out.print("항목을 입력하세요 : ");
            int result = sc.nextInt();

            switch (result) {
                case 1 :
                    bm.addBook(inputBook());
                    break;
                case 2 :
                    System.out.println("추후 예정");
                    return;
                case 3 :
                    bm.deleteBook(inputBookNo());
                    break;
                case 4 :
                    bm.searchBook(inputBookTitle());
                    break;
                case 5 :
                    bm.displayAll();
                    break;
                case 6 :
                    System.out.println("프로그램을 종료합니다");
                    return;
                default :
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }

    public BookDTO inputBook () {
        System.out.print("도서 제목 : ");
        String ti = sc.nextLine();
        sc.nextLine();
        System.out.print("도서 장르 (1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타) : ");
        int ja = sc.nextInt();
        System.out.print("도서 저자 : ");
        sc.nextLine();
        String at = sc.nextLine();

        BookDTO boko = new BookDTO(ti, ja, at);

        return boko;
    }

    public int inputBookNo () {

        System.out.print("도서 번호 입력 : ");
        int as = sc.nextInt();

        return as;
    }

    public String inputBookTitle () {

        System.out.print("도서 제목 입력 : ");
        String as = sc.nextLine();

        return as;

    }

}
