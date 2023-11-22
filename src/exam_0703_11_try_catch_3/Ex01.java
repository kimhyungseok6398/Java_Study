package exam_0703_11_try_catch_3;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        //try {
            service.login("user01", "1234");
        //}catch (UserIdIncorrectException | UserPwIncorrectException e){
            // 호출한 쪽에서 예외 전가
            //System.out.println(e.getMessage());

        }
    }
