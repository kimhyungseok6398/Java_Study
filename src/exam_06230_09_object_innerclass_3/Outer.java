package exam_06230_09_object_innerclass_3;

import exam13_object_extends_2.C;

public class Outer {
    public Calculator cal = new Calculator() {
    public int add(int num1, int num2){
        return num1 + num2;
    }
    };
    public void method(){  // 지역내부 클래스
        class Inner {
        void method(){
            System.out.println("지역 내부 클래스!");
        }
        }
        Inner in = new Inner();
        in.method(); // 메서드 안에서도 정의가 가능
                     // 지역 내부에 객체를생성한다는 개념이 중요
    }
    /**
    //public void method2(){ //  반환값 변경
    public Calculator method2(){
          Calculator cal = new Calculator(){
             public int add(int num1, int num2){
                return num1 + num2;
             }
         };
          return cal;
          // 외부에서 사용가능한것이 더욱 효율적
         //int result = cal.add(10,20);
         //System.out.println(result);
    }
        */
    public Calculator method2() { //  반환값 변경

        return new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
    }
    public Calculator method3(int num3){
        return new Calculator() {
           public int add(int num1, int num2){
               return num1 + num2 + num3;
           }
        };
    }
}
