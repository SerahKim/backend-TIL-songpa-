package com.chapter12_collection.list.comparator;

import com.chapter12_collection.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {
            // 순서를 바꿔야하는 경우 양수를 반환
            result = 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            // 순서를 바꾸지 않아도 되는 경우에는 음수 반환 (이미 정렬 완료)
            result = -1;
        } else {
            // 두 값이 같을 경우
            result = 0;
        }
        return result;
    }
}
