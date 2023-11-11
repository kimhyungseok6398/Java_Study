package exam_11_11_object_interface_2;

public interface Buyer {
    void buy();

    default void order(){ // public와 같은 제어자
        System.out.println("주문!");
        // default 없으면 오류
    }
}
