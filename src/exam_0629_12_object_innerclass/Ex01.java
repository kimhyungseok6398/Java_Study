package exam_0629_12_object_innerclass;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.method();

    }
}
