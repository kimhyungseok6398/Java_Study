package exam_07_05_09_Class_class_2;
import static java.lang.Math.*;
// Math에 있는 모든 메서드를 사용가능

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("절대값(abs()) : " + Math.abs(-10));
        System.out.println("반올림(round()) : " + Math.round(10.678));
        System.out.println("반올림(round()) 소수점 2번쨰 자리 : " + (Math.round(10.678 * 10) / 10.0));
        System.out.println("올림 (ceil()): " + Math.ceil(10.23));
        System.out.println("버림(round()) : " + Math.floor(10.6));
        System.out.println("2의 3승(pow()) : " + Math.pow(2, 3));
    }
}
