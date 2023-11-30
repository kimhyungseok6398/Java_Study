package exam_07_05_09_Class_class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while (true){
           System.out.print("두수를 입력 (형식 : 숫자 숫자) -> ");
           String str = br.readLine();
           if (str.equals("q")){
               break;
           }
           String[] nums = str.split("\\s+");
           int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
           // 문자열을 숫자형으로 변경
           System.out.print(result);
       }
         // 이렇게 쓰는것만 예시 복잡한 코드방식
        // 다르게 예시 보여줄거임

    }
}
