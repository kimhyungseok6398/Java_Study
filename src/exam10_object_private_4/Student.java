package exam10_object_private_4;

public class Student {
   static int id;

    String name;

    String subject;

        public Student(int id, String name, String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;
        }

   /* void showInfo(){
        System.out.println("id = " + id + ", name = " + name + ", subject = " + subject);
    }
     */
    public static void staticMethod(){
        System.out.println("정적메서드!!");
        // this.name = "이름" 접근안됨
    }
        public void instanceMethod(){
        id = 1000;
        staticMethod();
        // 이건 접근 가능
        }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
