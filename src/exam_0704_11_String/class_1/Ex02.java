package exam_0704_11_String.class_1;

public class Ex02 {
    public static void main(String[] args) {
        String str1 ="ABC";
        String str2 = "ABC";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        System.out.println(str1 == str2);
    }
}
