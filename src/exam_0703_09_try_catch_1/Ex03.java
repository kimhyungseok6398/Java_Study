package exam_0703_09_try_catch_1;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // ArithmethicExcetion
            System.out.println(result);

            String str = null;
            str = str.toUpperCase();
            // 소문자를 대문자로 변경해주는 메서드
            // NullPointExcetion

            System.out.println(str);
        }catch (ArithmeticException e) {
            String message = e.getMessage();
            // 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.

        }catch (NullPointerException e ){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
