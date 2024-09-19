package com.ohgiraffers.practice;

public class BookDTO {

    private int bookNumber;
    private String bookName;
    private String bookMaster;
    private int bookPrice;

    public BookDTO () {}

    public BookDTO(int bookNumber, String bookName, String bookMaster, int bookPrice) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookMaster = bookMaster;
        this.bookPrice = bookPrice;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookMaster() {
        return bookMaster;
    }

    public void setBookMaster(String bookMaster) {
        this.bookMaster = bookMaster;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookNumber=" + bookNumber +
                ", bookName='" + bookName + '\'' +
                ", bookMaster='" + bookMaster + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
