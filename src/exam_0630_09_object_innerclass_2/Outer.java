package exam_0630_09_object_innerclass_2;

public class Outer {
    int num1 = 10;
    static int num2 = 20;
    static class Inner{ // static을 붙이면 정적 내부 클래스
        void method(){
            System.out.println("정적 내부 클래스!");
            // num = 20;
        }
    }
}
