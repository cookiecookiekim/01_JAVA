package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {

    List<BookManager> booklist;

    ArrayList<BookDTO> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public BookManager () { // 기본 생성자
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        BookMenu bookMenu = new BookMenu();
        bookMenu.inputBook();

    }

    public void deleteBook(int index) { // 전달받은 인덱스 값 제거
        System.out.println("bookNo = " + index);

        bookList.remove(index - 1);

        System.out.println(index + "번 책을 삭제했습니다.");

    }

//    public void searchBook(String title) { //
//        boolean isSearch = false;
//
//        for(BookDTO book : bookList) {
//
//            if(bookTitle.equals(book.getTitle())) {
//                System.out.println(book);
//                isSearch = true;
//            }
//
//    }
//
//    public void displayAll() {

    }

//    public List<BookDTO> sortedBookList(int type) {
//
//    }
//
//    public void printBookList (List<BookDTO> printList) {
//
//    }

//}
