package exam_11_11_object_interface_2;

import exam14_object_extends_3.Bird;

public class Order implements Buyer,Seller {

    @Override
    public void buy() {
        System.out.println("구매!");
    }

    @Override
    public void sell() {
        System.out.println("판매!");

    }
}
