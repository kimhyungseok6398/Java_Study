package exam06_object.bagic;

public class Ex04 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // 힙 메모리 생성
        s1.showInfo();
        System.out.println("s1=" + System.identityHashCode(s1));

        Student s2 = new Student();
        s2.showInfo();
        System.out.println("s2=" + System.identityHashCode(s2));
        System.out.println(s1==s2);
    }
}
