package exam_0629_11_object_interface_Calculator;

public interface Calculator {
    int add(int num1, int num2);
    // public abatract을 컴파일러가 자동
    // 추가해줌  설계 목적
    /** int minus(int num1, int num2){
        return num1 + num2;
    }   오류 왜냐면 인터페이스클래스이기에
        구현체가 있으면 안됨
     */
}
