package exam_06_29_09_object_interface_2;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy();
        order.sell();

        Buyer buyer = order;
        Seller seller = order;
        // 가능! 왜냐하면 다형성으로써 다 하위클래스가 포함을 하고 있기 때문에

        buyer.buy();
        seller.sell();

        order.order();
        // 여기선 본인만 접근 가능
        // 디폴트와 관련 접근


    }
}
