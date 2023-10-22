# 조건문 개념 복습

* * * 

## 조건문이란?
* 참 거짓을 판별하는 식이 포함 (조건식 - 비교 ,논리 연산자 많이 사용)

## if 조건식 
* 조건식이 참일때 실행되는 코드 

        int num = 12;
        if(num == 10){
         // 조건식이 참일경우 출력   
        System.out.println("10입니다.");
        }else {
        // 조건식이 참이 아닐경우 출력
        System.out.println("10이 아닙니다");
        }
       }
      }



        int age = 20;
        if(age < 8){
            System.out.println("유치원!");
        } else if (age < 14) { // age >= 8 && age < 14
            System.out.println("초등학생!");
        } else if (age < 17) { // age >= 14 && age < 17
            System.out.println("중학생!");
        } else if (age < 20) { // age >= 17 && age < 20
            System.out.println("고등학교!");
        } else {
            System.out.println("성인!");
        }
      }
      }


## 선택문 
* 조건문에서 == 비교연산은 구조적으로 간단하게 만드는 선택문 

## switch - case
* 키워드 = 값 : 실행시점 -> break를 만날때까지 실행
    
    
        int  키워드 == rank = 1;
        switch(키워드) {
         case 값1 :
          // 값1이 키워드와 동일 -> 수행되는 코드
         case 값2 : 
          // 값2이 키워드와 동일 -> 수행되는 코드 
        }

* case에 사용되는 값 : 정수만 가능 
  * 문자열은 사용가능 (JDK7)
    
        String medal = "금메달";
          switch (medal) {
              case "금메달" :
                  System.out.println("1등");
                  break;
              case "은메달" :
                  System.out.println("2등");
                  break;
              case  "동메달" :
                  System.out.println("3등");
                  break;
              default:
                  System.out.println("입상");
          }
         }
        }