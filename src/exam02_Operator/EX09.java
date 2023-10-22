package exam02_Operator;

public class EX09 {
    public static void main(String[] args) {
        int num = 10;

        boolean result = ++num > 11 || (num = num + 20) > 20;
        // 둘중 하나만 참이면 되기에 앞에 수가 참이기게
        // 뒤에는 연산 X
        System.out.println(num);
    }
}
