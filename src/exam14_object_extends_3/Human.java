package exam14_object_extends_3;

public class Human extends Animal {
    @Override
    public void move(){ // protect도 가능함
        System.out.println("두발로 직립보행!");
    }
    public void readBook(){
        System.out.println("독서를 한다!");
    }
}
