package exam_0703_09_try_catch_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            fis.close();
            // throw new FileNotFoundException(...)
            // 파일이 없다면!!
            // }catch (FileNotFoundException e){
            // 다형성을 이용해서 두개다 대응가능

        }catch (IOException e){
            // FileNotFoundException e = new FileNotException(...)
            //System.out.println("예외처리");
            //String message = e.getMessage();
            //System.out.println(message);

            e.printStackTrace();
            // 현재 파일위치 있는지 정보확인 메서드
        }
    }
}