package exam09_object_private_3;

public class Schedule {
   private int year;

   private int month;

    private int day;

    public void setYear(int _year){
        year = _year;
    }
    public int getYear(){
        return year;
        // 멤버변수의 값을 확인 하기 위해
    }
    public void setMonth(int _month){
        month = _month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int _day) {
        if (month == 2 && _day > 28) {
            _day = 28;

        }
        day = _day;
    }
    public int getDay(){
        return day;
    }
    void ShowInfo(){
        System.out.println("Year = " + year + ", month = " + month + ", day = " + day);
    } // tostring 메서드를 이용하는것이 더 바람직
}
