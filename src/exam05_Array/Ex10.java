package exam05_Array;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        // 2차원 배열
        /**   int [][] nums = new int [2][3];
       nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 20;

        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;
       **/
      int[][] nums = { {10,20,30},{40,50,60} };
        System.out.println("형의 갯수 " + nums.length);
        System.out.println("0행의 열의 갯수 " + nums[0].toString());
        System.out.println("1행의 열의 갯수 " + nums[1].toString());

        System.out.println(Arrays.deepToString(nums));
        // 중첩 for문과 많이 쓰임

       /** for (int i = 0; i < nums.length;i++){
        // 0행 , 1행
            System.out.println(i + "행 ---------");
         for (int j = 0;j < nums[i].length;j++){
             System.out.println(nums[i][j]);
         }
       **/

    }
    }

