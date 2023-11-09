package exam11_object_private_5_2;

public class JoinService {
    private static JoinService instance;
    private JoinService(){
        // 외부에서 접근금지, 내부에 객체 생성가능

    }
    public static JoinService getInstance(){
        if (instance == null){
            instance = new JoinService();
            // 인스턴스 호출했을때만 객체 만들고
            // 필요할때만 만들어서 사용 용이
        }
        return instance;
    }

}
