package exam06_object.bagic;

public class Ex05 {
    public static void main(String[] args) {
        Student s1  = new Student(1000, "학생", "과목1");
        Student s2 = new Student(1001, "학생2","과목2");

        s1.showInfo();
        s2.showInfo();
    }
}
