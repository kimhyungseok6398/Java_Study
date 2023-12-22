package exam_07_10_12_Collention_Framwork_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"이름1","이름2","이름3");
        System.out.println(names);
    }
}
