package exam13_object_extends_2;

public class C extends B{
    int numC = 30;

    public C(){
        super(); // 상위 클래스
        System.out.println("C 생성자!!");
    }
}
