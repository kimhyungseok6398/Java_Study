package exam_0629_11_object_interface_Order_1;

public interface Buyer {
    void buy(); // public abstract 컴파일러가 없어도 자동으로 추가

    default void order(){
        System.out.println("Buyer 주문!");
    }
}
