package exam11.object_private_5;

    public class JoinService {
     //private  static JoinService instance = new JoinService();
     private  static JoinService instance;


     // 내부에서 생성할 수 있음

    private JoinService(){}

    public static JoinService getInstance(){
        if (instance == null){
            instance = new JoinService();
        }
        return instance;
    }
    }
