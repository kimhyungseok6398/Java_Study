package exam_0629_10_object_interface_5;

public class Human extends Animal{
    @Override //  컴파일시 재정의된  알려주는 어노테이션
    public void move(){
        System.out.println("두발로 직립보행");

    }
    public void readBook(){
        System.out.println("독서를 한다!");

    }
}
