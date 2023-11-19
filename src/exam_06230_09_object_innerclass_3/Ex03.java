package exam_06230_09_object_innerclass_3;

public class Ex03 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal = out.method3(10);
        int result = cal.add(20,30);
        System.out.println(result);
    }
}
