package exam_11_11_object_interface_2;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy();
        order.sell();

        Buyer buyer = order;
        buyer.buy();
        // 내용물 자체는 order객체이지만
        // 다형성 틀이 buyer로 한정되어 있기 떄문에


        Seller seller = order;
        seller.sell();

        order.order();
    }

}
