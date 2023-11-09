package exam13_object_extends_2;

public class B extends A{
    int numB = 20;

    public B(){
        super();// 상위 클래스
        System.out.println("B 생성자!!");
    }
}
