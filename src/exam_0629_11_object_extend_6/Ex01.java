package exam_0629_11_object_extend_6;

public class Ex01 {
    public static void main(String[] args) {

       //Calculator calculator = new Calculator();
       // 객체생성이 안됨
       // 왜냐하면 구현체가 없기 때문에 add메서드로
        // 어떤걸 구현할지 모르기에
        //SimpleCalculator cal = new SimpleCalculator();
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10,20);

        System.out.println(result);

        System.out.println(cal.numA);
    }
}
