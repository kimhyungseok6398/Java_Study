package exam_07_11_09_Lamda_2;

import exam_07_10_12_Lamda_1.Calculator;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {

            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = cal.add(10,20);
        System.out.println(result);

        Calculator cal2 = (a,b) -> a + b;
        int result2 = cal2.add(10,20);
        System.out.println(result2);

        };
    }
    /**
     * 1.객체부분 제거(중가로까지)
     * 2.접근제어자, 반환값, 함수명 제거
     * 3.매개변수 옆에 -> 설정
     * 4.매개변수 자료형 제거
     * 5.구현코드가 한줄이면 중가로, 리턴 예약어, 그옆에 있는 세미클론 제거
     * 6.변수명 최소화(한글자 a,b)
     *
     *
     *
     */

