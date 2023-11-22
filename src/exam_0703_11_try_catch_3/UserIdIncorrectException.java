package exam_0703_11_try_catch_3;

// 예외클래스는 명칭쓰고 예외 Exception을 씀
public class UserIdIncorrectException extends RuntimeException {//Exception{
    public UserIdIncorrectException (String message){
        super(message);
    }

}

