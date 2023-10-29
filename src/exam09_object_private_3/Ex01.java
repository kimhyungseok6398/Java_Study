package exam09_object_private_3;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        /**
        s1.year = 2023;
        s1.month = 2;
        s1.day = 31;
        **/

        // 변수의 값을 직접 대입 하는 방식은 부적합
       /*
        s1.setYear(2023);
        s1.setMonth(2);
        s1. setDay(31);
       */
        int month = s1.getMonth();
        System.out.println(month);
        s1.ShowInfo();
        System.out.println(s1);
    }
}
