# 반복문 개념 

* * * 

# while 
        while(조건식){
         // 조건식이 참일때 반복수행되는 코드
        }
    
    
        int total = 0 , num = 1;
            while (num <= 100){
                total += num;
                num++;
            }
            System.out.println(total);
    
        }}
    
    
# do while


            int total = 0 , num = 1;
    
            do {
                total += num;
            }while (num <= 100);
            System.out.println(total);
        }}


# for 문 
* 주로 횟수가 정해진 반복을 할때 특화된 구문


            for(초기화식;조건식;증감식){
            // 조건식이 참일때 수행되는 코드 
            }


            int total = 0;
        for (int num = 1;num <= 100; num++){
            total += num;
         }
        System.out.println(total);
         }}

## 변수명 관례
* i = 변수명 
* 중첩 for문에서는 변수명 j,k,l,m 
* break - 반복중단

# 반복 건너뛰기 
* Continue : 현재 반복중단 , 다음 반복을 시작 