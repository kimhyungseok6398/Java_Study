package exam04_loop;

public class Ex02 {
    public static void main(String[] args) {
        int total = 0 , num = 1;

        do {
            total += num;
        }while (num <= 100);
        System.out.println(total);
    }
}
