# 다시 한번 복습
 
* * * 

## 예외처리하는 이유
* 서버의 중단을 방지하기 위해 

## java.lang 패키지
* 기본적으로 많이 사용하는 클래스들이 포함 
* 예) java.lang.String

* - 컴파일러가 패키지명 바로 아래쪽 import java.lang.*;
* - lang 패키지의 모든 클래스는 그냥 사용가능

## Object 클래스에 정의된 메서드
* 모든클래스의 상위 클래스
* toString() 메서드
* equals() 메서드
* hashCode() 메서드

## 컴파일러가 자동 추가하는 부분
* 기본 생성자 
* 모든 생성자 첫번째 줄 super();
* 객체의 참조변수 출력 -> 변수 .toString()
* 인터페이스 메서드 앞에 public abstract
* 인터페이스 변수 앞에 public static final;
* 지역 내부 클래스, 지역변수의 상수화 : final 
* import java.lang.*;
* extends java.lang.Object