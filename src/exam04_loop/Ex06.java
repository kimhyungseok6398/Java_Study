package exam04_loop;

public class Ex06 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++){
         if(i % 2 == 0){ // 짝수

             continue; // 건너뛰기
         }
         total += i;

          /**
            if (i % 2 == 1){    // 홀수
                total +=i;
            }
           **/
        }
        System.out.println(total);
    }
}
