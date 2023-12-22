package exam_07_07_10_Collention_Framwork_1;

import java.util.Set;
import java.util.TreeSet;

public class Ex06 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("이름2");
        names.add("이름1");
        names.add("이름2");
        names.add("이름5");
        names.add("이름3");
        names.add("이름4");
        System.out.println(names);
        // 값이 섞여있어도 정렬
        }
    }

