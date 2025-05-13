package com.chapter12_collection.list.run;

import com.chapter12_collection.list.comparator.AscendingPrice;
import com.chapter12_collection.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* ArrayList의 정렬 */
        List<BookDTO> bookDTOList = new ArrayList<>();

        bookDTOList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookDTOList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookDTOList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookDTOList.add(new BookDTO(5, "삼국유서", "일연", 58000));

//        Collections.sort(bookDTOList); // 무슨 기준으로 정렬할지 모르기 때문에 컴파일 에러 발생
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }

        /* 가격 순으로 오름차순 */
        bookDTOList.sort(new AscendingPrice());

        System.out.println("++++가격 오름차순++++");
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }

        /* 가격 순으로 내림차순 */
        // 익명 클래스를 사용하여 정의 가능하다
        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                // 순서를 바꾸는 경우 양수, 바꾸지 않는 경우에는 음수 변환
                return o1.getPrice() >= o2.getPrice()? -1 : 1;
            }
        });

        System.out.println("++++가격 내림차순 정렬++++");
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }

        /* 제목 순 오름 차순 정렬 */
        // 앞의 값이 더 작은 경우 음수 반환 : 자리 안 바꿈
        // 같으면 0 반환
        // 앞의 값이 더 큰 경우 양수 반환 : 자리 바꿈
        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("++++책 제목 순으로 오름차순 정렬++++");
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }

        /* 제목 순으로 내림차순 정렬 */
        // 람다식
        bookDTOList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));

        System.out.println("++++책 제목 순으로 오름차순 정렬++++");
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }

        /* 저자 순으로 오름차순 정렬 */
        bookDTOList.sort((BookDTO b1, BookDTO b2) -> b1.getAutor().compareTo(b2.getAutor()));

        System.out.println("++++저자 순으로 오름차순 정렬++++");
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }

        /* 저자 순으로 내림차순 정렬 */
        //
        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getAutor().compareTo(o1.getAutor());
            }
        });

        System.out.println("++++저자 순으로 내림차순 정렬++++");
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }
    }
}
