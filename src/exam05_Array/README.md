# 배열 개념 

* * * 

## 배열이란?
* 자료를 순차적으로 관리하는 구조
* 같은 자료형 

## 배열의 선언과 초기화 
* 자료형 [] 배열명 = new 자료형 [공간의 갯수]
* 자료형 배열명[] = new 자료형 

## 선언과 동시에 초기화 
* 자료형[] 배열명 = new int[]{값1 ,값2 , 값3..}
* 자료형[] 배열명 = {값1 ,값2 ,값3}

        int [] nums = new int[]{10,20,30,40};

        for (int i = 0;i <= 3;i++){
            System.out.println(nums[i]);
        }}}

## 배열 사용하기 
* 인덱스 연산자 []
* [] 배열의 위치를 계산해주는 연산자
* 0부터 순서시작 

## 기본 자료형 : 초기값
* 정수형 자료형 ( byte , short , long) -> 0
* 실수형 자료형 ( float , double) -> 0,0

## 참조 자료형 
* String - 초기값 null

##  전체 배열 길이와 유효한 값
* 모든 배열 
* length : 공간의 갯수

      int [] nums = {10,20,30,40};
      // new int [] 제거함
      System.out.println(nums.length);
      //
      for (int i = 0;i < nums.length;i++){
      System.out.println(nums[i]);
      }}}

## 향상된 for문
* 반복되는 부분을 짧게 쓰기 위한 방식

          for(요소:배열(컬렉션)){} 
          int [] nums = {10,20,30,40,50,60};
          for (int num : nums){
            System.out.println(num);
            // 향상된 포문
          }}}


## java.util 패키지
* 편의 기능을 제공
* Arrays : 배열의 편의 기능
* toString(...)
* 1차원 배열에만 주로 쓰임


## 다차원 배열 
* 1차원 배열 : 직선
* 2차원 배열 : 평면 
* (보통 2차원까지 구현)
* 3차원 배열 : 입체
* deepToString(...)

## 2차원 배열 
* 자료형[][] 배열명 = new 자료형[행][열]


## 주로 선언과 동시에 초기화를 함
* 선언과 동시에 초기화
* 자료형[][] 배열명 = new 자료형[][]{값,값,값},{값,값,값}
* (new 자료형[][] 생략가능)



