package exam08_object;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // new Student 메서드가 있어야 객체를 생성할수 있음

        s1.id = 1000;
        s1.name= "학생1";
        s1.subject = "과목1";

        s1.showInfo();
    }
}
