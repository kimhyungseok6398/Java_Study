package exam_07_07_10_Collention_Framwork_1;

import java.util.Vector;

public class Ex02 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(3);
        System.out.println("현재 공간 : " + names.capacity());
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        System.out.println("현재공간 : " + names.capacity());
        names.add("이름4");
        System.out.println("현재공간 : " + names.capacity());
    }
}
