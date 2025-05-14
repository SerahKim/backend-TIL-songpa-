package com.chapter14_io.filterStream;

import com.chapter14_io.filterStream.dto.MemberDTO;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        /* 객체 단위 입출력 보조스트림 */

        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong@email.com", 23, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "yoo@email.com", 16, '여', 1210.7),
                new MemberDTO("user03", "pass03", "이순신", "lee@email.com", 23, '남', 1253.7),
        };

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/chapter14_io/filterStream/testObjectStream.txt")));

            for (int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        /*
        직렬화?
        자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할 수 있도록
        바이트(byte) 형태로 데이터를 변환하는 기술을 말한다.
        반대로 바이트로 변환된 데이터를 다시 객체로 변화하는 기술을 역직렬화라고 한다.
        */

        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/chapter14_io/filterStream/testObjectStream.txt")));

            while (true) {
                System.out.println(objIn.readObject());
            }

        } catch (EOFException e) {
            System.out.println("끝!");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
