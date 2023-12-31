# 람다식 

* * * 

## 람다식이란
* 메서드를 하나의 식으로 표현
* 함수형 프로그래밍
* 함수란? 하나의 기능(단일기능)
* 함수는 값으로 사용
* -매개변수
* -반환값

## 자바는 함수는 값으로 사용불가
* 인터페이스의 객체가 되는 조건을 이용
* 형식을 단순화 

* 람다식은 메서드를 간략하면서도 명확한 식으로 표현할 수 있게 해준다.
* 메서드를 람다식으로 표현하면서도 메서드의 이름과 반환값이 없어지므로 람다식을 '익명함수' 라고도 한다 

## 람다식 문법 사용
* 1.접근제어자,반환값 함수명을 생략
* 2.매개변수 정의 부분과 함수 구현 부분({}) 사이에 -> 추가
* 3.매개변수의 자료형도 생략가능
* 4.구현 코드가 한줄일때는 {...}생략가능 , 리턴 예약어도 생략해야 한다.
* 5.최대한 짧게 쓰는 방향(변수명도 한글자로 하는것이 권장)
* 6.매개변수가 1개이면 (...)로 생략가능
* 6.매개변수가 없으면 (...)는 생략불가

## 람다식 사용하기
* 함수형 인터페이스
* @FunctionalInterface
* 단일기능만 정의 형식 체크 

## 함수형 인터페이스 타입의 매개변수와 반환 타입 
* java.util.function.패키지

* 함수형 인터페이스를 정의해 놓은 편의 패키지
* 1) 매개변수 X , 반환값만 있는 형태
* Supplier<T> T get()

* 2) 매개변수 O (1), 반환값이 X 
* Consumer<T> void accept(T t)

* 3) 매개변수 O(1), 반환값 O
* Function<T,R> R apply(T t)

* 4) 매개변수 O(1), 반환값 boolean
* predicate<T> boolean test(T t)

## 만약 매개변수가 2개일때 접두어 Bi
* BiConsumer<T, U> void accept(T t ,U u);
* BiFunction<T,U,R> R apply(T t, U u);
* BiPredicate<T, U> boolean test(T t, U u);
* 