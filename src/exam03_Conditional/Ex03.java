package exam03_Conditional;

public class Ex03 {
    public static void main(String[] args) {
        int rank = 1;
        switch (rank) {
            case 1 :
                System.out.println("금메달");
                break;
            case 2 :
                System.out.println("은메달");
                break;
            case 3 :
                System.out.println("동메달");
                break;
            default:
                System.out.println("입상");
                // 키워드가 모든 값에 매칭 x -> 수행되는 코드
        }
    }
}
