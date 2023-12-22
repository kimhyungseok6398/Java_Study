package exam_07_10_12_Collention_Framwork_4;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exo4 {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("이름2", "이름2", "이름3", "이름4");
        Collections.shuffle(names);

        System.out.println("Before : " + names);
        Collections.sort(names);

        System.out.println("A : " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("A : " + names);


    }
}