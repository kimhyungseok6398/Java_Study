package exam_07_06_10_jeneric_1;

public class Ex01 {
    public static void main(String[] args) {
        Box box = new Box();
        box.put(new Apple()); // Object item = new item;

        //Apple apple = (Apple) box.get();
        Object obj = box.get();
        if (obj instanceof Melon) {
            Melon apple = (Melon) obj;
            System.out.println(apple.get());
        }
    }
}