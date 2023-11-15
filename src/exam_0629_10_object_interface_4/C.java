package exam_0629_10_object_interface_4;

public class C extends B{
    int numC = 30;

    public C(){
        super(); // 없으면 안되기에 컴파일러가 자동 추가, 없으면 상속이 안됨
                 // B 기본 생성자를 출력해주는 역할
        System.out.println("C 생성자!");
    }
    // 컴파일러가 자동으로 기본생성자를 생성해줌
    // 객체 생성후 실행되는 것
    // 멤버변수의 초기화
}
