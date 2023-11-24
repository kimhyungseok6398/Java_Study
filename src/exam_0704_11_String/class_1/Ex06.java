package exam_0704_11_String.class_1;

public class Ex06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);

        String str = sb.append("ABC")
                        .append("DEF")
                        .append("GHI")
                        .toString();
        // 연달아 붙힐 수 있다.
        // 메서드 체이닝
        System.out.println(str);
    }
}
