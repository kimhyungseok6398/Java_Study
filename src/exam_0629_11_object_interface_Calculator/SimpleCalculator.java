package exam_0629_11_object_interface_Calculator;

public class SimpleCalculator implements Calculator{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
