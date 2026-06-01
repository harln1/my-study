# 2026/5/27(수)
## 자바
```java
public class HellowWorld{
    public static void main(String[] args){
        System.out.println("Hellow World");
    }
}
```
- 변수
    - 
- 값(data)을 저장할 수 있는 메모리 공간
- 값이 변할 수 있는 수 
- 변수 선언 :`타입(int..)` + `변수이름`

- 상수
    -
- 상수는 한번 저장한 데이터 값 변경불가
- 상수선언 : 앞에 `final` 붙이기
```java
final int J;
  J = 10;
  
  //J = 5; 안됌
```

# 5/27(목)
- 기본 데이터 타입
    -
- 정수
    - int : 4byte
    - long : 8byte / long big = 3456789`L`;
- 실수
    - float : 4byte / float f = 32.5`f`
    - double : 8byte
- 문자형
    - char : 2byte / char c =1`'`f`'`;
- 논리형
    - boolean : 1byte / true or false 

- 기본형 타입변환
    -
- 묵시적 형변환
    ```java
    int x = 50000;
    long y = x;
    ```
    -이를 `암묵적 형변환`이라고도 한다.

- 명시적 형변환
    ```java
    long x = 50000;
    //int y = x; (이렇게 묵시적으로 수행하면 컴파일러는 오류를 발생 시킨다.)
    int y = (int) x; (반드시 (타입) 으로 명시적으로 형을 바꾸어 주어야 한다.)
    ```
    - 이를 `강제 형변환` 이라고도 한다.


- 논리 연산자
    -
- && 논리곱
    - 모두 참 
- || 논리합
- 하나만 참이여도 참
- !A 논리부정
    - 참은 거짓 거짓은 참
- A^B 배타적 논리합 
    - 같으면 거짓 다르면 참

- 삼항연산자
    -
- 조건식 ? 피연산자1 : 피연산자 2
```java
  int b1 = (5>4) ? 50 : 40;
  // 조건식이 true = 피연산자 1 ,false = 피연산자 2
```

- switch문
    - 
```java
// 정수
    int value = 1;

    switch(value){
        case 1: 
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3 :
            System.out.println("3");
            break;
        default :
            System.out.println("그 외의 숫자");
    }

// 문자
    String str = "A";

    switch(str){
        case "A": 
            System.out.println("A");
            break;
        case "B":
            System.out.println("B");
            break;
        case "C" :
            System.out.println("C");
            break;
        default :
            System.out.println("그 외의 문자");
    }

//  + 최신버전의 switch
String str = "A";

switch (str) {
    case "A" -> System.out.println("A");
    case "B" -> System.out.println("B");
    case "C" -> System.out.println("C");
    default  -> System.out.println("그 외의 문자");
}

String str = "A";

switch (str) {
    case "A", "B", "C" -> System.out.println("A,B,C 중 하나입니다.");
    case "D", "E"      -> System.out.println("D,F 중 하나입니다.");
    default            -> System.out.println("그 외의 글자");
}

```

- 반복문
    -

- while 문 
```java
// 1부터 100까지의 합을 while문을 이용하여 구현해 보도록 하겠습니다.
  int total = 0;
  int i = 1;
  while(i<= 100) {
   total = total + i; //total=0+1-> total=1+1 -> total=2+1
   i++; 
  }
  
  System.out.println(total);
 }
 ```
- do while문
```java
    import java.util.Scanner;

    public class DoWhileExam {

        public static void main(String[] args) {
            int value = 0;

            // Scanner는 java.util 패키지에 있는 클래스로써 키보드로 부터 값을 입력받는다던지 할 때 유용하게 사용할 수 있는 클래스입니다.
            Scanner scan = new Scanner(System.in);
            //위 처럼 작성하시면 키보드로부터 값을 입력받을 수 있는 Scanner객체가 생성됩니다. 

            do{
                value = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
                System.out.println("입력받은 수 : " + value);  
            }while(value != 10);  // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.

            System.out.println("반복문 종료");
        }
    }
```
- for문
```java
for문을 이용하여 1부터 100까지의 짝수의 합을 구하는 프로그램
    public class ForExam {

        public static void main(String[] args) {
            int total = 0;
            for(int i = 1; i <= 100; i++){
                if(i % 2 != 0){  // 2로 나눈 나머지가 0이 아니라는것은 홀수를 의미한다.  
                    continue; // 홀수일 경우 total = total + i; 문장이 실행되지 않으므로, 결과적으로 짝수만 더해준다. 
                }
                total = total + i;
            }
            System.out.println(total);
        }

    }
```

# 6/1(월)
- 배열 
    -
- 1차원 배열





















