package exam_0704_12_wrapper_class_1;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);

        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(num2));
    }
}
