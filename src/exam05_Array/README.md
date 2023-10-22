# 배열 개념 

* * * 

## 배열이란?
* 자료를 순차적으로 관리하는 구조

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