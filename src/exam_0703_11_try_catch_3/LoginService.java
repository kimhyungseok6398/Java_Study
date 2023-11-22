package exam_0703_11_try_catch_3;

public class LoginService {
    // 예외처리 미루기 매개변수 뒤에다 생성
    // 호출한 쪽에서 소유하게 전가
    public void login(String userId, String userPw)
    //throws UserIdIncorrectException,UserPwIncorrectException {
    //없어도 에러가 안뜸
    {
        // userId - user01, userpw - 1234
        //try {
            if (!userId.equals("user01")) {
                // 보통 이렇게 많이 쓰임
                // 아이디 불일치
                throw new UserIdIncorrectException("아이디가 일치하지 않습니다");
                // 처음에 오류가 뜨는 이유는 Exception에 상속을 받았기에 예외에 대한 처리를 해줘야함
            }
            if (!userPw.equals("1234")) {
                throw new UserPwIncorrectException("비밀번호가 일치하지 않습니다");
                // 비밀번호 불일치
            }
            System.out.println("로그인 성공!");
       // }catch (UserIdIncorrectException | UserPwIncorrectException e){
          //  String message = e.getMessage();
          //  System.out.println(message);
        }
    }
