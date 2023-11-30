package exam_0704_12_wrapper_class_1;

public class Ex05 {
        public static void main(String[] args) {
        double result = add(10, 123.123f);
        System.out.println(result);

        double result2 = add(10.1234, 10L);
        System.out.println(result2);

        double result3 = add(10,20L);
        System.out.println(result3);
    }
    public static double add(Number num1, Number  num2){
        // 정수와 실수에 상위 클래스
        // 어떤값이 좋을지 모를때
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }
}
