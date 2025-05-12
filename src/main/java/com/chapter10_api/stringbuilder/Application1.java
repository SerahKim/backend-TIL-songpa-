package com.chapter10_api.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /*
        두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
        두 개의 차이는 스레드 동기화 유무이고, 현재 우리는 스레드를 고려하지 않기 때문에
        StringBuilder를 이용하여 자주 사용되는 메소드의 용법을 볼 예정
        - StringBuilder : 스레드 동기화 기능 제공하지 않음.
                          스레드 동기화처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
        - StringBuffer : 스레드 동기화 기능 제공함
                         성능면에서는 StringBuilder보다 느림
        */

        /*
        클래스	      |  불변/가변	    스레드 안전성	                성능	        주 사용 환경
        -------------------------------------------------------------------------------------
        String	      |  불변	        안전 (불변이라 동시성 걱정 없음)	느림	        문자열 변경이 적을 때
        StringBuilder |	 가변	        ❌ 비동기 (안전 X)	            빠름	        단일 스레드
        StringBuffer  |	 가변	        ✅ 동기화 (안전 O)	            느림	        멀티 스레드 환경

        */

        StringBuilder sb1 = new StringBuilder("javaoracle");

        /*
        delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거한다.
        deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
                         둘 다 원본에 영향을 미친다.
        */

        System.out.println("delete() : " + sb1.delete(2, 5)); // jaracle, 2번째부터 5번째 인덱스전까지 잘라낸 문자열을 반환
        System.out.println("deleteCharAt() : " + sb1.deleteCharAt(0)); // aracle, 원본에 영향을 미치기 때문에 jaracle에서 첫번째 인덱스가 제거된 문자열이 반환됨.
        System.out.println(sb1); // aracle

        /*
        insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
                   원본에 영향을 미친다.
        */
        System.out.println("insert() : " + sb1.insert(1, "vao")); // avaoracle, aracle의 1번째 인덱스부터 시작하여 "vao" 삽입
        System.out.println("insert() : " + sb1.insert(0, "j")); // javaoracle
        System.out.println("insert() : " + sb1.insert(sb1.length(), "jdbc")); // javaoraclejdbc

        System.out.println(sb1);

        /*
        reverse() : 문자열 인덱스 순번을 역순으로 재배열한다.
                    원본에 영향을 미친다.
        */
        System.out.println(sb1.reverse());
        System.out.println(sb1);
    }
}
