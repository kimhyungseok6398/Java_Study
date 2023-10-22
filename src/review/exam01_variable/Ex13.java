package review.exam01_variable;

public class Ex13 {
    public static void main(String[] args) {
        int num1 = 1000;
       // 데이터 유실 위험 byte num2 = num1;
        byte num2 = (byte)num1;
        System.out.println(num2);

        double num3 = 100.123;
     // 데이터 유실 위험   int num4 = num3;
        int num4 = (int)num3;
        System.out.println(num4);

        
    }
}
