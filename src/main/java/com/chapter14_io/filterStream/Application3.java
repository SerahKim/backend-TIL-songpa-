package com.chapter14_io.filterStream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /* 데이터 입출력 보조스트림 */
        /*
        외부 데이터로부터 읽어오는 데이터를 바이트형, 정수, 문자, 문자열로만 읽어오면
        여러 데이터 타입을 취급하는 경우 별도로 처리를 해주어야 한다.
        데이터 자료형 별로 처리하는 기능을 추가한 보조스프림을 제공하고 있다.
        */

        /*
        DataInputStream / DataOutputStream
        */

        DataOutputStream dout = null;

        try {
            // 해당 경로에 파일이 없으면 자동으로 파일 생성
            dout = new DataOutputStream(new FileOutputStream("src/main/java/com/chapter14_io/filterStream/score.txt"));

            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        DataInputStream din = null;
        try {
            din = new DataInputStream(new FileInputStream("src/main/java/com/chapter14_io/filterStream/score.txt"));

            while (true) {
                System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
                // 기록한 순서대로 읽어들이지 않는 경우 에러 발생
//                System.out.println(din.readInt() + ", " + din.readChar() + din.readUTF());

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) {
            System.out.println("파일 읽기 완료!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
