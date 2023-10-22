package exam02_Operator;

public class Ex05 {
    public static void main(String[] args) {
        int num = 10;
       // int num2 = num++;
       // int num2 = ++num;
       // int num2 = num--; // num = 10 , 그다음 연산되고 9
        int num2 = --num; // num = 9 , 대입도 9
        System.out.println(num2);
        System.out.println(num);
        // num++ 이면 ++가 뒤에있으므로 대입이 된 뒤 그다음 연산
        // ++num 이면 연산이 먼저 됨
    }
}
