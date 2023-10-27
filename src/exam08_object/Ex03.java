package exam08_object;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생", "과목1");
        s1.showInfo();
        System.out.println(System.identityHashCode(s1));

        Student s2 = new Student(1001, "학생2", "과목2");
        s2.showInfo();
        System.out.println(System.identityHashCode(s2));

        System.out.println(s1==s2);

        Student s3 = s2;
        s3.id = 1002;
        s3.name = "학생3";
        s3.subject = "과목3";

        s2.showInfo();
        s3.showInfo();
    }
}
