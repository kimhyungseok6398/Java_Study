package exam06_object.bagic;

public class Student {

        int id; // 학번

        String name; // 학생명

        String subject; // 전공과목

        public Student(){
         // 객체 생성 이후 진행될 작업을 정의
         // 주로 멤버변수의 초기화
            id = 1000;
            name = "학생1";
            subject = "과목1";

        }
        public Student(int _id,String _name, String _subject) {
        id = _id;
        name = _name;
        subject = _subject;
        }

        // 변수가 아님 주의
        // 변수 정의만 함
        void study() {
            System.out.println(name + "이" + subject + "를 공부한다");
        }
        void showInfo() {
            System.out.println("id=" + id + ", name=" + name + ", subject="+ subject);
        }
    }

