package exam_06_29_09_object_interface_2;

public interface Buyer {
    void buy();
    // pullic abstract를 컴파일러가 추가

   default void order(){
       System.out.println("Buyer - 주문!");
       // default 키워드로 일부러 구현한 인스턴스 메서드로 확인
   };
    // 이것만 작성하면 에러가 뜨기 때문에
    // 하위클래스에서 구현을 해야하기에

}
