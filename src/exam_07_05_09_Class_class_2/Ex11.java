package exam_07_05_09_Class_class_2;

public class Ex11 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Mango,Melon,Apple";
        int pos1 = fruits.indexOf("Apple");
        System.out.println(pos1);

        int pos2 = fruits.lastIndexOf("Apple");
        System.out.println(pos2);

        String fruit1 = fruits.substring(fruits.lastIndexOf("Apple"));
        System.out.println(fruit1);

        String fruit2 = fruits.substring(1,4); // 1,2,3 마지막껀 포함 안됨
        System.out.println(fruit2);

        System.out.println(fruits.length());
        // 비번 검증 할떄 많이 쓰이는 방식
    }
}
