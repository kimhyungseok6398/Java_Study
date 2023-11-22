package exam_0703_09_try_catch_1;

public class Ex02 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;   // throw new AritheticException(...);
            System.out.println(result);
            System.out.println("실행코드!");
        } catch (ArithmeticException e){
            //System.out.println("예외처리");
            //String message = e.getMessage();
            //System.out.println(message);
            e.printStackTrace();
            // 더 자세한 정보를 알 수 있도록!
        }
        System.out.println("매우 중요한 코드!!!");

    }
}
