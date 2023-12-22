package exam_07_07_10_Collention_Framwork_1;

import java.util.LinkedList;
import java.util.Queue;

public class Ex04 {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");

        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        // 먼저 추가한거부터 출력
    }
}
