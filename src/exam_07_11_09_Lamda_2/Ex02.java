package exam_07_11_09_Lamda_2;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator(){

            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        Calculator cal2 = (a, b)-> a + b;

        add((a, b) -> a + b);
    }
    public static void add(Calculator cal){
        System.out.println(cal.add(10,20));
    }
}
