package exam_07_11_10_java.util.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Ex01 {
    public static void main(String[] args) {
        //BiFunction<Integer,Integer,Integer> cal = (a,b) -> a + b;
        BinaryOperator<Integer> cal = (a,b) -> a + b;
        int result = cal.apply(10,20);
        System.out.println(result);
    }

}
