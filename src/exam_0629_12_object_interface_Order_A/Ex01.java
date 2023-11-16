package exam_0629_12_object_interface_Order_A;

public class Ex01 implements A,B{

    @Override
    public void method1() {
        System.out.println();

    }

    @Override
    public void method2() {
    System.out.println("실행!");
    // 어차피 구현체는 하위 클래스가
    // 구현을 하기 때문에 하위클래스에 구현을 해주면
    // 메서드가 중복이 되도 괜찮다
    }

    @Override
    public void method3() {

    }
}
