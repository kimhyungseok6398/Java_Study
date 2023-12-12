package exam_07_06_12_jeneric_3;

import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        FruitBasket<Fruit> appleBasket = new FruitBasket<>(); // Apple, Melon, Fruit
        // Fruit fruit = new Apple();

        appleBasket.add(new Apple());
       // appleBasket.add(new Melon());
        appleBasket.add(new Apple());

        Juicier.make(appleBasket);
        Juicier.make3(appleBasket);
    }

}
