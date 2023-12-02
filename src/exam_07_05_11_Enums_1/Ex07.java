package exam_07_05_11_Enums_1;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {


    Transportation taxi = Transportation.valueOf("TAXI");
    System.out.println(taxi); // taxi.toString()

        Transportation[] trans = Transportation.values();
        System.out.println(Arrays.toString(trans));

        // 이 두가지 방식은 많이 쓰일거니 일단 참고만
}
}