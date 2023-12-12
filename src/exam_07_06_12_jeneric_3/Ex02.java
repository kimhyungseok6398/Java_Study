package exam_07_06_12_jeneric_3;

public class Ex02 {
    public static void main(String[] args) {
        FruitBasket<Melon> MelonBasket = new FruitBasket<>();
        MelonBasket.add(new Melon());
        MelonBasket.add(new Melon());
    }
}
