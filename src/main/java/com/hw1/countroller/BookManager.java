package com.ohgiraffers.hw1.countroller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;


public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        // bookList 인스턴스 생성
        this.bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        // bookList에 도서 추가
        bookList.add(book);
    }

    public void deleteBook(int index) {
        // 전달받은 index로 삭제
        bookList.remove(index);
    }

    public int searchBook(String title) {
        // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook (int index) {
        // index에 해당하는 객체 출력
        System.out.println(bookList.get(index));
    }

    public void displayAll() {
        for(BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        switch (select) {
            case 1 :
                bookList.sort(new AscCategory());
                break;
            case 2 :
                bookList.sort(new DescCategory());
                break;
            default:
                System.out.println("번호를 잘못 입력하였습니다");
                break;
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        // 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
        for(BookDTO bookDTO : br) {
            System.out.println(bookDTO);
        }
    }

    public ArrayList<BookDTO> getBookList() {
        return bookList;
    }
}
