package exam_06_29_09_object_interface_2;

public interface Seller {
    void sell();
    // pullic abstract를 컴파일러가 추가

    default void order(){
        System.out.println("Seller - 주문!");
    }
}
