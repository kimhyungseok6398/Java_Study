package exam_0704_12_wrapper_class_1;

public class Ex04 {
    //  이 방식을 더 선호함
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(10);
        Integer num2 = Integer.valueOf(10);


        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(num2));

        Integer num3 = Integer.valueOf(1000000);
        Integer num4 = Integer.valueOf(1000000);


        System.out.println(System.identityHashCode(num3));
        System.out.println(System.identityHashCode(num4));
    }
}
