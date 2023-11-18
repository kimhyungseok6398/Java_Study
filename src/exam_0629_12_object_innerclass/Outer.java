package exam_0629_12_object_innerclass;

public class Outer {
    int num1 = 10;
    // 바로 접근가능
    class Inner {
        int num1 = 20;
        // 클래스 안에 클래스가 있어야 실행가능
        // outer에 객체가 있어야 접근이 가능
        static int num2 =20; // jdk15 오류, jdk16 오류X
        void method(){
            System.out.println(this.num1);
            System.out.println(Outer.this.num1);
            //outerMethod();


        }
    }
    public void outerMethod(){
        System.out.println("outerMethod()");
    }
}
