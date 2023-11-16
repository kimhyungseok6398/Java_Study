package exam_0629_11_object_interface_Calculator;

public class Ex01 {
    public static void main(String[] args) {
        //SimpleCalculator cal = new SimpleCalculator();
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
