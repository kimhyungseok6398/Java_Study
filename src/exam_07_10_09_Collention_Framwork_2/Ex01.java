package exam_07_10_09_Collention_Framwork_2;

import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("이름3");
        names.add("이름4");
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름5");
        System.out.println(names);
    }
}
