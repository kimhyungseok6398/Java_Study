# 열거형

* * * 

## 열거형이란?
* 정적 상수만을 위해 용도가 정해진 클래스의 일종
* 1. extends java.lang.Enum
* 2. 상수 -> 정적 상수 객체
* 3. 모든 생성자 : private 접근 제어자
* - 외부에서 객체를 생성 할 수 있으면 상수로써 의미 X
* 4. 추상 클래스

          enum 클래스명 {
                 상수,
          }

## Enum 클래스에 정의된 메서드
* String name(), string toString() : Enum 상수 이름 문자열 
* int ordinal() : Enum 상수의 위치 번호 (0부터 시작)


# 다시한번 정리

* * *

## Enum 클래스
* 정적 상수만을 정의하기 위한 용도가 제한된 클래스의 일종
* java.lang.Enum 클래스의 하위 클래스
* class Transportation extend java.lang.Enum{}

## 상수는 열거 하듯이 정의
            * eunm Transportation {
            * BUS,
            * TAXI,
            * SUBWAY

## == 
* 추상클래스