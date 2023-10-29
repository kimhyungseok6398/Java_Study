package exam09_object_private_3;

public class Ex03 {
    public static void main(String[] args) {
    int result1 = add(10,20);
    int result2 = add(20,30);
    }
    public static int add(int num1 , int num2){
        int result = num1 + num2;
        return result;
        // 이메서드는 바뀌지 않기 때문에
        // 상수개념 그 위에 메서드만 값만 바뀜
    }
}
