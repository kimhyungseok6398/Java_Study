package exam_0703_10_try_catch_2;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // 예외가 발생하던 안하돈 출력되는 부분
            if (fis != null) {
                try {
                    fis.close();
                }catch (IOException e2){
                    e2.printStackTrace();
                }

            }
        }
    }
}