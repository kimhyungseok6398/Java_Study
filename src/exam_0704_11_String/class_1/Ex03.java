package exam_0704_11_String.class_1;

public class Ex03 {
    public static void main(String[] args) {
        boolean result = isSame("ABC","ABC");
        System.out.println(result);

        boolean result2 = isSame("ABC",new String("ABC"));
        System.out.println(result2);



    }
    public static boolean isSame(String str1, String str2){
        //return str1 == str2;
        // 동일성 비교 X
        return str1.equals(str2);
        // 동등성 비교
    }
}
