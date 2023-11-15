package exam_06_29_09_object_interface_2;

public class Order implements Buyer,Seller{

    @Override
    public void buy() {
        System.out.println("구매!");
    }

    @Override
    public void order() {
       // Buyer.super.order();
        // 앞에 Seller로도 가능
        System.out.println("주문!");
        // 이렇게도 가능 
    }

    /** @Override
    public void order() {
        System.out.println();
    }
    **/
   // 완전히 구현형태로도 구현 디폴트 메서드
    @Override
    public void sell() {
    System.out.println("판매!");
    }
}
// 추상 클래스보다 인터페이스에서 더 많이 사용

