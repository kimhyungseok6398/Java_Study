package exam04_loop;

public class Ex07 {
    public  static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            if (i % 2 == 1) {
                /**
                 * 또는 if (i % 2 == 0) {
                 * continue 로 해서
                 * 짝수를 건너뛰게함
                 * }
                 *
                 *
                 */
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        } 
    }
}
