package exam_07_05_11_Enums_1;

public class Ex03 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;
        String str = trans.name(); // trans.toString();
        // 디비등에 저장할경우 문자열로 해야하기에 문자열로 변환
        System.out.println(str);

        int pos = trans.ordinal();
        System.out.println(pos);

        Transportation bus = Enum.valueOf(Transportation.class,"BUS");
        System.out.println(bus);
    }
}
