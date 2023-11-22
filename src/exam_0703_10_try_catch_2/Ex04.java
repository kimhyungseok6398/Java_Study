package exam_0703_10_try_catch_2;

public class Ex04 {
    public static void main(String[] args) {
        try(MyResource my = new MyResource()){

        }catch (Exception e){
            e.printStackTrace();
        } // 트라이 안에서 예외가 발생하던 안하던
          // 항상 close메서드 호출
    }
}
