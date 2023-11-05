package exam11.object_private_5;

public class Ex01 {
    public static void main(String[] args) {
        //JoinService s1 = new JoinService();
        //JoinService s2 = new JoinService();
        // private로 했기 때문에 객체 접근 생성불가
        //System.out.println(s1==s2);
        JoinService s1 = JoinService.getInstance();
        // 객체랑 상관없이 접근방법
        JoinService s2 = JoinService.getInstance();
        System.out.println(s1==s2);

    }
}
