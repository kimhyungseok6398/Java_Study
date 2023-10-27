package exam08_object;

public class Student {
    int id;

    String name;

    String subject;

    public Student(){
        // 객체 생성이후 처리할 작업
        // 멤버 변수의 초기화
        id = 1000;
        name = "학생1";
        subject = "과목1";
        // 객체가 생성된 이후 실행되는 코드
        }
        public Student(int _id,String _name, String _subject){
        id = _id;
        name = _name;
        subject = _subject;
        }

    void showInfo(){
        System.out.println("id = " + id + ", name = " + name + ", subject = " + subject);
    }
}
