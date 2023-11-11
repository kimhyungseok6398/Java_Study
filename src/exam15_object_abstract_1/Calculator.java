package exam15_object_abstract_1;

public abstract class Calculator {
     int num = 10;
    public abstract int add(int num1 ,int num2);
    // 객체가 되야함

    public void commonMethod(){
        System.out.println("공통기능!");
    }

}

