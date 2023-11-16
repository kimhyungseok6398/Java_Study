package exam_0629_10_object_extend_4;

public class Ex01 {
    public static void main(String[] args) {
       //C c = new C(); // 생성자 ( 객체를 만들수 있는 것 )
       // A a = new C();
       // D d = new D();
       // B b = new C();
       // 하위 클래스가 상위 클래스로 바뀌는것

        A ac = new C(); // C 객체로 분류된 A = c안에 b안에 a
        A ad = new D(); // D 객체로 분류된 A

        // 명시적 형변환
        if (ad instanceof C){
            C c1 = (C) ad;
        }
        if (ac instanceof C){
            C c2 = (C) ac;
            System.out.println("numA = " + c2.numA + " , numB = " + c2.numC);
        }

    }
}
