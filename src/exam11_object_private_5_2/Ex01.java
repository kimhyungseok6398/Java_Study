package exam11_object_private_5_2;

public class Ex01 {
    public static void main(String[] args) {
        //JoinService s1 = new JoinService();
        //JoinService s2 = new JoinService();
        // 다른 객체

        JoinService s1 =  JoinService.getInstance();
        JoinService s2 = JoinService.getInstance();

        System.out.println(s1 == s2);

        System.out.println(s1 == s2);
    }
}
