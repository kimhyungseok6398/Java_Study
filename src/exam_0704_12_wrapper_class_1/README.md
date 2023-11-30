## Wrapper 클래스
* 기본 자료형을 위한 클래스 (감싸는 형태)
    * 기본 자료형의 기능 부여하기 위한 클래스

                class Integer {
                ...
                private int value;
                ... 
                  }  // 기본값을 감싼다 // 기능을 구현하기 위해


## 정수형
* byte -> Byte
* short -> Short
* int -> integer
* long -> Long

## 실수형
* float -> Float
* double -> Double

## 논리형
* boolean -> Character
## byte[] values : 버퍼(기본값 16비트)


## 오토박싱과 언박싱
* 오토박싱
* - 기본형 -> 레퍼클래스의 객체
* Int num2 = num1; // integer num2 = integer.valueOf(num1);

## 언박싱
* - 레퍼클래스의 객체 -> 기본형
* int num3 = num1 + num2; 
* // int num3 = num1 + num2.intValue();

* 참고) new Integer(...) : Deprecated / 권장사항 integer.valueOf(...);

            int  intValue();
            long longValue();
            double doubleValue();
            ...

            Integer
            static int parselnt(String s); : 문자열 -> 정수(int)

            Double 
            static double parseDouble(String s); :문자열 -> 실수(double)

* java.lang.Number
* 숫자와 관련된 클래스에 상위 클래스

## 다시한번 Class 클래스
* 클래스의 정보가 담겨있는 객체
* 자동생성되는 객체
* 모든 클래스의 정적변수 class
* Obeject::getClass()