package exam_0704_09_java.lang.object_1;

import java.util.Arrays;

public class Ex09 {
    public static void main(String[] args) {
        int result = add(10,20,30,40,50,60);
        System.out.println(result);
    }
    public static int add(int...nums){
        int total = 0;
        for (int num : nums){
            total += num;
        }


        // 가변적 매개변수
        System.out.println(Arrays.toString(nums));
        return total;

    }
}
