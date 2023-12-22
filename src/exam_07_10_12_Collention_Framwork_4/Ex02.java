package exam_07_10_12_Collention_Framwork_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
       // Ex01에 비해 코드가 간단한 방식
        List<String> names = Arrays.asList("이름1","이름2","이름3","이름4","이름5");
        Collections.shuffle(names); // 무작위로 바낌

        // 무작위로 셔플기능 메서드
        System.out.println(names);

        String max = Collections.max(names);
        String min = Collections.min(names);
        System.out.printf("max=%s, min=%s%n",max,min);
    }
}
