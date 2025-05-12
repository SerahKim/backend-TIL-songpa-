package com.team_problem.section_250508;

public class BookService {
    /*
    문제점 1 : 카테고리별 책 개수를 세고 싶은데, 실제로는 전체 배열의 길이를 세는 문제
    해결책 1 :
        조건문에서 아무리 만화책만 골라내더라도, 부모 클래스에서 반환해오는 bookCounts는 전체 배열의 길이만 계속 대입
        bookCounts를 오버라이딩 할 때 해당 타입으로 객체가 생성된 것만 카운트하도록 조건식 부여

    문제점 2 : Book[] 객체 배열에 여러 가지 객체 타입을 넣고 싶을 때
    해결책 2 :
        다형성 적용
        각 하위 클래스들은 부모 클래스의 형태를 가지고 있기 때문에 고유의 필드 변수가 있어도 부모 클래스의 객체 타입을 가지고 있는 객체 배열에 넣어줄 수 있다.

    문제점 3 : comics.bookInfo()가 book에 있는 개별 객체에 대해 호출되지 않고, 그냥 comics라는 빈 객체에서 호출
    해결책 3 : 객체 타입의 형변환(Book -> Comics)을 통해 값을 불러옴

    문제점 4 : 공통된 함수가 자주 반복됨
    */

    // TODO : 중복되는 코드 줄이기

    Novel novel = new Novel();
    Comics comics = new Comics();
    Essay essay = new Essay();

    // 책 등록
    // TODO : 오름차순 정렬하기
    public Book[] registerBook () {
        Book[] books = {
                new Novel(112, "달빛 아래의 약속", "김하늘", "은하수 출판사", "로맨스"),
                new Novel(113, "검은 숲의 주인", "박진수", "푸른나무", "스릴러"),
                new Novel(114, "시간을 걷는 아이", "이서연", "미래북스", "SF"),
                new Comics(201, "드래곤 소년", "이무기 작가", "불꽃 출판", true),
                new Comics(202, "학교 괴담 클럽", "고요한밤 작가", "불꽃 출판", false),
                new Comics(203, "럭키 스쿨", "최강고딩 작가", "불꽃 출판", true),
                new Comics(204, "좀비 고양이의 하루", "냥작가 작가", "유쾌한 책방", true),
                new Comics(205, "달빛 검사", "한밤검 작가", "무협마당", false),
                new Essay(301, "조용한 순간들", "이서윤", "느린출판사", "삶의 여유"),
                new Essay(302, "매일이 여행", "김다빈", "여행자의 글", "일상과 여행"),
                new Essay(303, "커피 한 잔의 철학", "정우성", "한빛에세이", "소확행"),
                new Essay(304, "마음의 온도", "한지원", "따뜻한책방", "감정과 치유"),
        };

        return books;
    }

    // 소설 카테고리의 책 정보 출력
    public void registeredNovelBooksInfo() {
        for (Book book : this.registerBook()) {
            if (book.getNum() >= 100 && book.getNum() <= 199) {
                Novel novelBook = (Novel) book; // 형변환 (Book -> Comics)
                System.out.println(novelBook.bookInfo());
            }
        }
    }

    // 만화 카테고리의 책 정보 출력
    public void registeredComicsBooksInfo() {
        for (Book book : this.registerBook()) {
            if (book.getNum() >= 200 && book.getNum() <= 299) {
                Comics comicsBook = (Comics) book; // 형변환 (Book -> Comics)
                System.out.println(comicsBook.bookInfo());
            }
        }
    }

    // 에세이 카테고리의 책 정보 출력
    public void registeredEssayBooksInfo() {
        for (Book book : this.registerBook()) {
            if (book.getNum() >= 300 && book.getNum() <= 399) {
                Essay essayBook = (Essay) book; // 형변환 (Book -> Comics)
                System.out.println(essayBook.bookInfo());
            }
        }
    }

    // 전체 책 정보 출력
    public void registeredAllBooksInfo() {
        registeredNovelBooksInfo();
        registeredComicsBooksInfo();
        registeredEssayBooksInfo();
    }

    // 소설 카테고리에 등록된 책의 수
    public int registeredNovelBooksCounts() {
        int counts = 0;

        for (Book book : this.registerBook()) {
            if (book.getNum() >= 100 && book.getNum() <= 199) {
                counts = novel.bookCounts(this.registerBook());
            }
        }

        System.out.println(novel.CATEGORY_NOVEL + " 카테고리에 등록된 책의 개수는 " +  counts + "개 입니다.");

        return counts;

    }

    // 만화 카테고리에 등록된 책의 수
    public int registeredComicsBooksCounts() {
        int counts = 0;

        for (Book book : this.registerBook()) {
            if (book.getNum() >= 200 && book.getNum() <= 299) {
                counts = comics.bookCounts(this.registerBook());
            }
        }

        System.out.println(comics.CATEGORY_COMICS + " 카테고리에 등록된 책의 개수는 " +  counts + "개 입니다.");

        return  counts;
    }

    // 에세이 카테고리에 등록된 책의 수
    public int registeredEssayBooksCounts() {
        int counts = 0;

        for (Book book : this.registerBook()) {
                counts = essay.bookCounts(this.registerBook());
        }

        System.out.println(essay.CATEGORY_ESSAY + " 카테고리에 등록된 책의 개수는 " +  counts + "개 입니다.");

        return  counts;
    }

    // 등록된 책의 전체 개수 출력
    public void registeredAllBooksCounts() {
        int totalCounts = 0;

        totalCounts = registeredNovelBooksCounts() + registeredComicsBooksCounts() + registeredEssayBooksCounts();

        System.out.println("도서관에 등록된 책의 총 개수는 " + totalCounts + "개 입니다.");
    }
}
