
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

## 매개변수와 반환값의 자료형이 같은 경우
## 매개변수가 1개
* UnaryOperator<T> T apply(T t)
## 매개변수가 2개
* BinaryOperator<T> T apply(T t1, T t2);
* 참고) 기본형을 처리하기 함수형 인터피이스