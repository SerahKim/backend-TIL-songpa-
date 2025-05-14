package com.chapter14_io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /*
        FileOutputStream
        프로그램의 데이터를 파일로 내보내기 위한 용동의 스트림이다.
        1바이트 단위로 데이터를 처리한다.
        */

        FileOutputStream fout = null;

        try {
            // 해당 경로에 파일이 없는 경우 자동으로 생성해준다.
            fout = new FileOutputStream("src/main/java/com/chapter14_io/stream/testOutputStream.txt");
            fout.write(97);

            // 10 : 아스키코드 상에서 개행 문자 (엔터)
            byte[] bar = new byte[] {98, 99, 100, 101, 10};
            fout.write(bar);

            // bar의 1번째 인덱스부터 3번째 인덱스까지 내보낸다.
            fout.write(bar, 1, 3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
