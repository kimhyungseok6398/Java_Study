# 예외처리

* * * 

# 오류와 예외
* 오류 (에러) : 시스템의 오류, JVM 오류 -> 통제불가
* 예외 (Exception) : 코드 상의 오류 : 통제 가능한 오류 -> 버그

## 예외 클래스 종류 
* Throwable 상위 클래스 
* String getMessage() : 오류 메세지 확인
* void printStackTrace() : 
* Error
* Exception 

## 많이 쓰이는것 주로 외우기
* String getMessage()
* -> Throwable(String message) : 매개변수로 넣었던 이값을 확인 해보는것
* void printStackTrace()
* ()

## 예외처리하기 
* 1. try ~ catch문

         try {
         // 예외가 발생할 가능성이 있는 코드
         FileInputStream fis = new FileInputStream("a.txt");
         }catch // 에외 발생시 처리할 코드 
            (FileNotFoundException e){
            System.out.println("예외처리");
               }

## 참고) 예외발생 
* throw 예외객체;

## 예외, 오류처리는 원인을 확인하는 것이 중요하다!
* 예외 클래스 주요 메서드 : 정보확인 

## Exception (많이는 안쓰인다고함!)
* Exception을 바로 상속받은 예외 클래스
* 예) IOException

* java.io.FileNotFoundException 
* 예외있던 없던 처리가 안되어 있으면 컴파일이 안됨! 
* 예외의 체크는 컴파일시 체크, 예외가 있으면 컴파일 X
* 엄격한 예외, 형식을 매우 중요시


* RuntimeException을 중간에 상속받은 예외클래스
* - Exception보다 많이 쓰임

* ArithmethicExcetion : 0으로 나눌때 발생

* 예외가 발생하더라도 컴파일 O. class 파일 생성됨
* 예외의 체크는 실행 중 체크, 실행이 되려면 class 파일 필요(컴파일은 된다..)
* Rumtime : 실행 
* 형식은 중요하지 않음
* Exception을 상속 받은경우 (RuntimeException이 없는경우)

* 예외가 발생하면 프로그램 중단! -> 프로그램 중단을 막기위한 조치 
* - 예외처리의 목적 : 예외가 발생시 적절한 조치

## 예외처리 미루기
* 예외처리를 미루는 throws 사용하기
* 다중 예외 처리

## NullPointerException (가장 많이 발생하는 오류)
* catch 구간을 여러개 할 수 있음
* }catch (알테메틱익셉션 e ) {
* }catch (널 포인트 익셉션 e) {

## try-catch-finally문
* 자원을 소비하는 객체 : FileInputStream,FileOutPutStream,Connetion,Preparestament
* 자원해제 -> 자원해제를 하지 않으면 메모리 부족 현상 발생 
* 자원해제를 적절하게 해야한다.
* catch말고 finally만을 사용가능 
* -> 예외가 발생하든 안하든 항상 발생하는 코드

## try-with-resources문
* 자바 7에서 추가
  * 자원 해제를 자동
          
            try(해제할 자원 객체;
            해제할 자원객체{
          //예외가 발생할 가능성이 있는 코드
            }catch(예외객체..)
            }
## 자원자동 해제의 기준
* 자바 문서 참고 FileInputStream 
* 참고) AutoCloseable 인터페이스 구현 클래스
* - close() 메서드를 자동호출

## 사용자 정의 예외
* JDK 기본 정의 예외 
* 로그인 기능 
* 아이디 비번, 아이디가 일치하지 않으면 -> 예외 발생
* 비밀번호가 일치 하지 않으면 -> 예외 발생
 
## 예외 클래스 작성 - Exception, RuntimeException 상속, 생성자만 정의 

## 예외 처리 미루기 
* 예외처리를 미루는 throws 사용하기
* 메서드를 호출 하는쪽에서 예외 처리 전가
* 전가 시키는 예외에 대해서 명시
* -> 메서드 매개변수 뒤쪽에 throws 전가할 예외...
* Exception을 상속받은 경우 (RuntimeException이 없는 경우)