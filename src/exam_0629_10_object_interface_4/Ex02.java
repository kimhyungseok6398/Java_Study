package exam_0629_10_object_interface_4;

import exam14_object_extends_3.Animal;

public class Ex02 {
    public static void main(String[] args) {
        A a = new A(); // A, B, C
        System.out.println(a instanceof A); // true
        System.out.println(a instanceof B); // true
        System.out.println(a instanceof C); // true

        System.out.println(a instanceof D); // false
    }
}
