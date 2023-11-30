package exam_0704_12_wrapper_class_1;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;
        Integer num2 = num1;
        // integer num2 = Integer.valueOf(num1);

        /**
         *
         * 컴파일러
         * int num3 = num1 + num2.intValue();
         **/
        int num3 = num1 + num2;
        System.out.println(num3);
    }
}
