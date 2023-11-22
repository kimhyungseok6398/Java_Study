package exam_0703_09_try_catch_1;

public class Ex05 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // 무슨 예외가 발생할지 모르는 경우...
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // 무슨 예외가 발생할지 모르는경우..
            // 소문자를 대문자로 변경해주는 메서드
            // NullPointExcetion
            System.out.println(str);

        }catch (ArithmeticException e) {
            String message = e.getMessage();
            // 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.
            System.out.println(message);

        }catch (Exception e ){ // 상위 클래스로 다형성 이용, new NullPointException(...);
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

