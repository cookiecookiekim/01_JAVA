package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    ArrayList<BookDTO> bookList;
    Scanner sc = new Scanner(System.in);

    public BookManager () {

    }

    public void addBook (BookDTO bookDTO) {


    }

    public void deleteBook (int index) {
        System.out.println("bookNo = " + index);

        bookList.remove(index- 1);

        System.out.println(index + "번 책을 삭제했습니다.");
    }

    public void searchBook (String bTitle) {
    }

    public void displayAll () {}
}

