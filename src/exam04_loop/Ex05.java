package exam04_loop;

public class Ex05 {
    public static void main(String[] args) {
      int total = 0;
      for (int i = 1; i <= 100; i++){
          total += i;

          if (i == 50){
              break;
          }

      }
        System.out.println(total);
    }
}
