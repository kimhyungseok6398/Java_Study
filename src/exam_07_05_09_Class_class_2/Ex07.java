package exam_07_05_09_Class_class_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("data.txt"));
        int total = 0;
        while (sc.hasNext()){
            int score = sc.nextInt();
            total += score;
        }
        System.out.println(total);
    }
}
