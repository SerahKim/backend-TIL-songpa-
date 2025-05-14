package com.chapter14_io.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /* File 클래스 */
        // 해당 경로에 파일 생성
        File file = new File("src/main/java/com/chapter14_io/file/test.txt");

        try {
            /* 파일 생성 후 성공 실패 여부를 boolean으로 리턴 */
            // 파일 생성 성공하면 true 리턴
            // 한번 파일을 만들었으면 다시 만들려고 할 때 false 리턴
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess = " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        // 생성된 파일 삭제
//        boolean deleteSuccess = file.delete();
//        System.out.println("deleteSuccess = " + deleteSuccess);
    }
}
