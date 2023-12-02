package exam_07_05_11_Enums_1;

public class Ex05 {
    public static void main(String[] args) {
       //Transportation trans = new Transportation();
       // 객체를 여러개 만들면 상수에 대한 개념이 없어진다
    int fare = Transportation.BUS.getFare();
    System.out.println(fare);

    System.out.println(Transportation.BUS);
    }
}
