package exam_0629_11_object_interface_Order_1;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.sell();
        order.buy();

        Buyer buyer = order;
        buyer.buy();

        Seller seller = order;
        seller.sell();

        order.order();
        // Buyer에도 order메서드가 있고
        // Seller에도 있기에 어느 order를
        // 실행시키는것을 모르기에 에러
        // 어느것을 쓸건지 알려줘야함
        // Order클래스에서 Alt + Enter 해서
        // order 오버라이드 생성 출처를 알려줌
        // 또는 생성 후 자신거만 나오게도 생성가능
        //

    }
}
