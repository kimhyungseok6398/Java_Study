package exam_0704_11_String.class_1;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        System.out.println(str1 == str2);
    }
}
