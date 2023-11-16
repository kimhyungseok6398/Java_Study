package exam_0629_11_object_extend_6;

public abstract class Calculator {
    int numA = 10;
    // 객체가 되서 값을 할당 받아야하지만
    // 멤버변수 활용
    public abstract int add(int num1, int num2);
    // 우리는 일부러 구현체가 없는 추상메서드를 알려주기에
    // astract 예약어 붙이기, 메서드에 붙여도 에러가 뜸
    // 그러기에 클래스에도 알려줘야함

    public void common(){
        System.out.println();
    }
}
