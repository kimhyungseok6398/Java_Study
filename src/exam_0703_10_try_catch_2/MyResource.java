package exam_0703_10_try_catch_2;

// 자원 해제가 필요한 클래스라고 가정
public class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
      // close 메서드 자동 호출
        System.out.println("자원해제!!");
    }
}
