package exam12_object_extends;

public class C extends B{
    int numC = 30;

    public C(){
        super(); // 컴파일러가 자동으로 생성
                 // 이 super은 상위 클래스에 B 생성자를 의미
        System.out.println("C 생성자!");
    }
}
