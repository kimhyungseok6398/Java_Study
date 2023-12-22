# 컬렉션 프레임 워크

* * *

* 컬렉션 : 데이터 군 : 
* 프레임 워크 :  표준화된 설계 

* 데이터 군을 다루는데 필요한 클래스를 표준화된 설계



## List :  순차 자료구조
* 순서가 유지되는 자료 - 예) 배열 
* 값에 중복 허용 

* 추가 
* add(E e)
* add(int index, E e)
* addAll(...)

* 조회 
* E get(int index)
* boolean contains(E e) : 요쇼의 포함여부
* int indexOf(E e) : 요소의 위치값을 반환(우 -> 좌), 없을때 -1
* int lastIndexOf(E e) : 요소의 위치값을 반환 (우->좌), 없을때 -1

* 변경 
* set(int index, E e);

* 제거
* E remove(int index) : 순서번호로 요소 삭제
* void remove(E e) 
 
* retainAll(Collection ...) 매개변수의 콜렉션 객체의 자료만 유지하고 삭제 (교집합)

* 기타 
* size () : 요소의 갯수

* 구현 클래스
* ArrayList : 배열을 구현한 클래스, 기본값은 10개공간 배열생성
* 같은 자료형 + 물리적으로 붙어있는 순차구조
* 조회속도가 빠르다
* 배열의 공간이 부족하면 -> 새로운 배열을 생성 (2배씩 큰 용량으로 생성 )

* 단점 : 물리적 배열은 변경이 X -> 새로생성
* 잦은 순서변경,(추가 삭제) : 성능저하

## LinkedList
* 요소간의 연결관계 순서가 결정
* 추가, 삭제시 빠르게 진행
* 조회시 ArrayList보다는 불리


## Vector
## Stack 

## Set : 집합 자료구조 
* 중복을 허용하지 않는 자료
* 순서는 유지 X 
* 추가 : E add(E e);
* void addAll(Collection...)
* 조회 : boolean contains(Collection...)
* 제거 : void remove(E e)
* 기타 : size() : 요소의 갯수
* 구현된 클래스
* HashSet
* TreSet : HashSet과 동일한 역할 (중복 X) + 정렬(Sort)

## Map : 사전 자료구조 
* 키, 값의 쌍의 구조
* 키 -> 값을 찾기위한 용도
* 중복 허용 X (Set)
* 값 -> 값은 중복을 허용

## Stack과 Queue
* Stack 클래스 
* pop() : 마지막 요소를 제거
* push(E item) : 끝에 추가

## Queue 인터페이스
* offer(E e) : 끝에 추가
* E poll() : 앞에서 요소를 꺼내온다.


# 다시 복습 

* * * 

## List 인터페이스
* 순차 자료구조
* 순서 O
* 중복 O
* ArrayList : 배열을 구현한 클래스
* 조회속도가 빠르다 
* 순서가 변경될 수 있는 추가 삭제 -> 새로운 배열 생성 -> 성능저하 
* 스택 구현시 유리

* LinkedList : 연결관계로 순서를 정하는 클래스
* 순서가 변경되는 추가, 삭제시 성능에 유리
* 조회 속도는 ArrayList보다는 불리
* Queue의 구현 클래스 

## Set 집합 자료구조
* 집합 자료구조
* 중복 X 
* 순서유지 X
* 구현 클래스
* HashSet ( 중요 ) 
* TreeSet : + 정렬기능 
* 참고) Tuple : 집합

## Map 인터페이스
* 사전 자료구조
* 키, 값 쌍 구조 
* 키 : 값을 찾기 위한 용도 중복 X (Set)
* 값 : 값은 중복을 허용 중복 허용 ( Collection ... )

## 추가
* V put(K k, V v)
* void putAll(Map<..>)

## 조회
* V get(Object key)
* boolean containsKey (Object Key)
* boolean containValue(Object value);

* Set<K> keySet() : 키 값만 Set형태로 반환 
* Collection<V> value() : 값만 Collection 형태로 반환 
* boolean is Empty() : 빈 Map

## 삭제 
* void remove(Object Key)
* void clear() 전체삭제

* 기타 int size() : 요소의 갯수

## Map 의 구현 클래스
* HashMap
* TreeMap + 키값의 정렬

* 참고) Map은 iterator가 정의 X (Collection에만 설계가 추가)
* put -> k,v 값이 들어가면 -> Map.Entry 객체가 한개 생성 (키와 값이 한쌍 ) -> Map.Entry[]table
* Map.Entry -> 키, 값의 순서쌍 객체
* V getValue
* K getKey
* void setKey(K k)
* void setValue(V v)

## Comparator와  Comparable 
* java.lang.Comparable : 기본 정렬 기준 
* int compareTo(T o) : 
* 음수 : 오름차순 현재 객체의 정수값 - 비교 대상의 객체의 정수값
* 양수 : 내림차순 비교 대상의 객체의 정수값 - 현재 객체의 정수 값

## Arrays
* java.util.Arrays : 배열의 편의기능 클래스 

## Collections
* java.util.Colletion : 컬렉션(List, Set, Map)의 편의 클래스
* List<T> asList(T... items)

## equals(...) : 1차원 배열
* deepEquals(...) : 다차원 배열 비교

## toString(...) : 1차원 배열의 값 출력
* deepToString(...) : 다차원 배열의 값 출력


