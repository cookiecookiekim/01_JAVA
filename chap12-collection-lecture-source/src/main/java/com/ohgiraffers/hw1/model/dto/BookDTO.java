package com.ohgiraffers.hw1.model.dto;

import com.ohgiraffers.hw1.controller.BookManager;

public class BookDTO {

    int bNo; // 도서 번호
    int category; // 장르 분류 번호
    String title; // 도서 제목
    String author; // 도서 저자

    public BookDTO () { // 기본 생성자

    }

    public BookDTO(int category, String title, String author) { // 매개 변수가 있는 생성자
        this.category = category;
        this.title = title;
        this.author = author;

    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
