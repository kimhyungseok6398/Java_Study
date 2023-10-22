package exam04_loop;

public class Ex01 {
    public static void main(String[] args) {
        int total = 0 , num= 1;
        while (num <= 50){
            total += num; // total = total + num;
            num++;
        }
        System.out.println(total);

    }
}
