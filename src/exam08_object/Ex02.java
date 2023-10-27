package exam08_object;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showInfo();
        System.out.println(System.identityHashCode(s1));

        Student s2 = new Student();
        s2.showInfo();
        System.out.println(System.identityHashCode(s2));

    }
}
