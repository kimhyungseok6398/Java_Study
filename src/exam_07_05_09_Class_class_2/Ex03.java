package exam_07_05_09_Class_class_2;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random rand = new Random();
       // int num1 = rand.nextInt();
        //int num2 = rand.nextInt();

        //System.out.println("num1 : " + num1);
        //System.out.println("num2 : " + num2);

        rand.ints().limit(6).forEach(System.out::println);

    }
}
