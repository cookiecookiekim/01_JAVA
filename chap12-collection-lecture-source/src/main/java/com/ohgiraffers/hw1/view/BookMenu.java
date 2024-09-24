package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bookManager = new BookManager();

    public BookMenu () { // 개본 생성자

    }

    public void mainMenu () {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("==========책 관리 시스템============");
            System.out.println("==============메뉴판===============");
            System.out.println("1. 새 도서 추가하기");
            System.out.println("2. 도서정보 정렬 후 출력하기");
            System.out.println("3. 도서 삭제하기");
            System.out.println("4. 도서 검색 출력하기");
            System.out.println("5. 전체 출력하기");
            System.out.println("6. 끝내기");
            System.out.println("==================================");
            int asd = sc.nextInt();

            switch (asd) {
                case 1 :
                bookManager.addBook(inputBook());
                break;

                case 2 :
                System.out.println("업데이트 예정입니다.");
                break;

                case 3 :
                bookManager.deleteBook(inputBookNo());
                break;

//                case 4 :
//                bookManager.searchBook(inputBookTitle());
//                break;

//                case 5 :
//                bookManager.displayAll();
//                break;

                case 6 :
                return;

                default :
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }

    }

    public BookDTO inputBook() {

        System.out.print("도서 제목을 입력해 주세요 : ");
        String topic = sc.nextLine();
        System.out.print("도서 장르 입력 (1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타) : ");
        int jr = sc.nextInt();
        System.out.print("도서 저자를 입력해 주세요 : ");
        String at = sc.nextLine();

        BookDTO bookDTO = new BookDTO(jr, topic, at);
        return bookDTO;
    }

    public int inputBookNo () {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 도서 번호를 입력하세요 : ");
        int res = sc.nextInt();

        return res;
    }

    public String inputBookTitle () {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 도서 제목을 입력하세요 : ");
        String res = sc.nextLine();

        return res;
    }

//    public List<BookDTO> selectSortedBook () {
//        Scanner sc = new Scanner(System.in);
//
//    }

}
