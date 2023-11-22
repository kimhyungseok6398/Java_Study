package exam_0703_11_try_catch_3;

public class UserPwIncorrectException extends RuntimeException{//Exception{
    public UserPwIncorrectException(String message){
        super(message);
    }
}
