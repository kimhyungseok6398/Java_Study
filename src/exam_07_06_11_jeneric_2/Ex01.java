package exam_07_06_11_jeneric_2;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        // 투입할 자료형을 명시
        appleBox.put(new Apple());

        Apple apple = appleBox.get();
        System.out.println(apple.get());
    }
}
