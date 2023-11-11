package exam_11_11_object_interface_1;

public interface Calculator {
   public int add(int num1, int num2);

   int num = 10;
   // 상수이기에 무조건 초기화를 해줘야함
   // public static final 자동 컴파일러 추가
   // 객체와 상관없이 접근 가능하게 해야되기에

    // 추상클래스일경우는 오류가 뜨는데
    // 인터페이스는 오류가 안뜸
    // 구현체가 있으면 오류 발생

    // public abstract 컴파일러가 자동 추가

}
