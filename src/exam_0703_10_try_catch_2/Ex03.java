package exam_0703_10_try_catch_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    // 이 코드를 더 참고 가독성 있게 변경함
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")){
            System.out.println(fis instanceof AutoCloseable);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
