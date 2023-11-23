## Object 클래스에 정의된 메서드
* 모든클래스의 상위 클래스
  * toString() 메서드
  * 객체의 참조변수를 출력할때 자동 호출

        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        
        참고)  Object
        class getclass()
        class 객체 : 클래스 로더에 의해서 생성 : 클래스 정보가 담겨있는 객체
        모든 클래스의 정적 변수로 class가 존재
        Object : getclass() : 인스턴스 메서드 : 객체 생성후 class 객체 조회
        - 클래스 내부에서 클래스 정보를 조회 
  
* getClass() getName() : 패키지명을 포함한 클래스명
* - toString()보다 이 메서드가 더 많이 쓰임 

* equals() 메서드

      public boolean equals(Object obj) {
        return (this == obj);
        // 비교 
* 동일성 비교 : 동일한 주소
* - 다른 객체이지만 가치는 동일한것이 동일성
* 물리적 동일성 / 주소값의 비교 
* - ( == ) - 주소의 비교 
* 두개의 100원 동전 

* 동등성 비교 : 동등한 가치를 가지고 있는지 
* equals(...) : 재정의를 통해서 동등성 비교
* hashCode() 메서드
* - 객체의 논리적 주소값

## 컴파일러가 자동 추가하는 부분
* 기본 생성자
* 모든 생성자 첫번째 줄 super();
* 객체의 참조변수 출력 -> 변수 .toString()
* 인터페이스 메서드 앞에 public abstract
* 인터페이스 변수 앞에 public static final;
* 지역 내부 클래스, 지역변수의 상수화 : final
* import java.lang.*;
* extends java.lang.Object

## 컬렉션 프레임워크(준비중)
* Set(집합) : 중복 X 
* java.util 패키지 : 편의기능이 모여져 있는 패키지
* Objects : 객체의 편의기능
* Arrays : 배열의 편의기능 
* Colletions : 컬렉션의 편의기능
* 일반적으로 비교는 equals and hashCode;

## java