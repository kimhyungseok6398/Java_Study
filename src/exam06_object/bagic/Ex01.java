package exam06_object.bagic;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1 지역변수
        s1.Id = 1000;
        s1.name = "김형석1";
        s1.subject = "과목1";

        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
        // 실제 힙에 있는 객체의 주소를 알수 있다
        s1.study();
    }
}
