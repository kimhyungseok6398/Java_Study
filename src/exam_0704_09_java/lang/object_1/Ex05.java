package exam_0704_09_java.lang.object_1;

public class Ex05 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        // 힙과 메모리

        System.out.println("str1 == str2 : " + (str1 == str2));
        // 각각 다른 주소이기 떄문에 fales
        //System.out.println("str1 주소 : " + System.identityHashCode(str1));
        System.out.println("str1 주소 : " + str1.hashCode());
        System.out.println("str2 주소 : " + str2.hashCode());
        //System.out.println("str2 주소 : " + System.identityHashCode(str2));

    }
}
