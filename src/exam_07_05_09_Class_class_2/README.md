## 다시한번 Class 클래스
* 클래스의 정보가 담겨있는 객체
* 자동생성되는 객체
* 모든 클래스의 정적변수 class
* Obeject::getClass()

## Class 클래스를 선언하고 클래스 정보를 가져오는법

## Class 클래스를 활용해 클래스정보를 알아보기

## Class.for.Name()을 사용해 동적로딩하기
* (forname 더 많이 쓰임)
* 실행중 클래스 파일을 -> 데이터 영역, 반환값 Class

## 유용한 클래스
* java.lang.Math 클래스 (문서 참고)
* - 수학관련 유용한 함수 모음...
* - abs(...) : 절대값(음수 - 양수)
* - round(...) : 반올림
* - ceil(...) : 올림 
* - sign(...) : 부호(1 - 양수 -1- 음수,0)
* - pow(a,b) : a의 b승
* - sqrt
* - random() : 0 ~ 1 사이의 double 범위 난수
* 

## java.util.Objects 클래스
* 배열의 편의기능

## java.util.Collection 
* 컬렉션의 편의기능모음..

## java.util.stream.Collector : 데이터 수집용 편의 메서드 모음

* deepEquals(Object a, Object b)
* equals(Object a, object b)
* hash(object)
* ( 많이 쓰이는것들)

## java.util.Scanner 클래스 
* - 콘솔에서 입력, 파일 데이터 간단하게 입력

## String 클래스 메서드 
* static String format(String format, Object...args)

## 참고) 
* 형식화 패턴
* %s : 문자열 
* %c : 문자
* %d : 정수
* %f : 실수 (%2f - 소수점 2자리)

## indexOf 
* 위치 찾는 함수
* 좌에서 우로

## lastindexOf
* 우에서 좌로

## substring(시작위치) : 시작위치부터 끝까지
## subsrting(시작위치, 종료위치) : 시작위치 <= s < 종료위치