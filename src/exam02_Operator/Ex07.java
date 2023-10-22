package exam02_Operator;

public class Ex07 {
    public static void main(String[] args) {
        boolean result = true && true; // true
        // true 두조건이 참
        System.out.println("result : " + result);

        boolean result2 = true || false; // true
        // 두조건중 하나만 참이여도 참
        System.out.println("result2 : " + result2);

        boolean result3 = !true; //false
        System.out.println("result3 : " + result3);

    }
}
