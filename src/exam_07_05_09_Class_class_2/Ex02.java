package exam_07_05_09_Class_class_2;

import java.util.Objects;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5,6};
        boolean isSame = Objects.deepEquals(nums1,nums2);
        System.out.println(isSame);
        /*
        boolean isSame = true;
        try {
            for (int i = 0; i < nums1.length; i++) {
                if (nums2[i] != nums1[i]) {
                    isSame = false;
                    break;
                }
            }
        }catch (Exception e){
            isSame = false;
        } */ // 코드 복장 비효율성
    }

}
