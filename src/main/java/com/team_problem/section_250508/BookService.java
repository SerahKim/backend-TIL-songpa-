package com.team_problem.section_250508;

public class BookService {
    Comics comics = new Comics();

    public Comics[] registeredComics() {

        // 만화 카테고리에 책 등록
        Comics[] registeredComics = {
                new Comics(101, "드래곤 소년", "이무기 작가", "불꽃 출판", "판타지"),
                new Comics(102, "학교 괴담 클럽", "고요한밤 작가", "불꽃 출판", "공포"),
                new Comics(103, "럭키 스쿨", "최강고딩 작가", "불꽃 출판", "학원물"),
                new Comics(104, "좀비 고양이의 하루", "냥작가 작가", "유쾌한 책방", "코미디"),
                new Comics(105, "달빛 검사", "한밤검 작가", "무협마당", "무협"),
        };

        return registeredComics;
    }

    public void registeredComicsInfo() {
        // 만화 카테고리에 등록된 책 정보 출력
        for (Comics comics1 : this.registeredComics()) {
            System.out.println(comics1.bookInfo());
        }
    }

    // 만화 카테고리에 등록된 만화책의 수
    public int registeredComicsCount() {
        int comicsCounts = comics.bookCounts(this.registeredComics());
        return comicsCounts;
    }

    // 도서관에 등록되어 있는 모든 책의 정보
    public void registeredAllBooksInfo() {
        this.registeredComicsInfo();
    }

    // 도서관에 등록되어 있는 모든 책의 수
    public void registeredAllBooksCount() {
        int allCount = this.registeredComicsCount() + 2;

        System.out.println("도서관에는 총 " + allCount + "개의 책이 등록되어 있습니다.");
    }



}
