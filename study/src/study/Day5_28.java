package study;

import java.util.Scanner;

public class Day5_28 {
	public static void main(String[] args) {
		// final 상수
		//		int i ;
		//		i = 10;
		//		i = 5;

		final int J;
		J = 10;

		//J = 5; //안됌

		//원의 넓이 구하기 반지름 = 3
		double circleArea ;
		final double PI = 3.14159;
		//circleArea = 3 * 3 * 3.14159;
		circleArea = 3 * 3 * PI;

		System.out.println(circleArea);

		// 기본데이터 타입
		// 논리형
		boolean isFun = true;
		System.out.println(isFun);

		char c = 'f' ;

		int x = 59;

		// 기본형 타입변환
		// 묵시적 형변환
		int x1 = 50000;
		long y = x1;

		// 강제(명시적)형 변환
		long x2 = 5;
		int y2 = (int)x2;

		// if 문
		int a = 50;
		int o = 60;
		//		if(a < o) {
		//			System.out.println(" a는 o 보다 작습니다 ");
		//			System.out.println("test");
		//		}

		if (a == o) {
			System.out.println("a는 o과 같습니다");
		}else if(a < o){
			System.out.println("a는 o 보다 작습니다");
		}else {
			System.out.println("a는 o과 다릅니다");
		}


		//논리 연산자
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;


		int score = 68;
		if(score <= 100 && score >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

		// 베타적 논리합
		System.out.println(b1^b3);
		System.out.println(b1^b2);

		// 삼항연산자
		int b4 = (5>4)? 50: 40;// 5 가 4 보다 커? 맞으면 50 :(아니면) 40
		System.out.println(b4);

		int b5 = 0;
		if(5>4) {
			b5 = 50;
		}else {
			b5 = 40;
		}

		System.out.println(b5);

		// switch 문
		// switch , case , default , break

		int value = 2;
		switch(value) {
		case 1: 
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default :
			System.out.println("그 외 다른 숫자");


		}
		String str = "B";
		switch(str) {
		case "A" -> System.out.println("A");
		case "B" -> System.out.println("B");
		case "C" -> System.out.println("C");
		default -> System.out.println("그 외의 문자");
		}


		// 반복문

		//while

		//		int i1 = 0;
		//		
		//		while(i1 < 10 ) {
		//			System.out.println(i1);
		//			i1++; // i1` = i1+1;
		//		}
		// 1부터 100까지의 합을 while문을 이용하여 구현해 보도록 하겠습니다.
		int total = 0;
		int i = 1;
		while(i<= 100) {
			total = total + i;
			i++;	
		}

		System.out.println(total);


		int i2 = 1;
		while(i2 < 11){
			// if 문을 추가해, i가 짝수일때만 i를 출력하는 코드를 짜보세요.
			if(2%i2 == 0){
				System.out.println(i2);
			}

			i2++; 
		}
		
		//do while
//		int value1 = 0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			// 반복할 문장들
//			value1 = sc.nextInt();
//			System.out.println("입력받은 값 :"+ value1);
//		}while(value1 != 10);
//		
//		System.out.println("반복문 종료! ");
//		
//		
		
		// for
//		int totall = 0;
//		for(int in = 1 ; in <= 100; in++ ) {
//			totall = totall + in;
//		}
//		
//		System.out.println(totall);
//		
		//1 에서 100 까지의 짝수의 합
		int totall = 0;
		for(int in = 1 ; in <= 100; in++ ) {
			if(in % 2 != 0) {// 2로 나눈 나머지가 0이 아니라는것은 홀수를 의미한다.  
				continue;//continue : 아랫쪽 것들을 아예 실행시키지 않는다
			}
			totall = totall + in;
		}
		
		System.out.println(totall);
		
		//배열
		//- 배열생성
		int[] array1 = new int[4]; // 정수4개를 저장할 수 있는 배열

		//- 배열에 값 저장
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;  
		array1[3] = 4;
		//자바에서 배열의 인덱스는 0번 부터 사용한다. 4개짜리 배열은 0 ~ 3 까지

		//- 배열에 저장된 값 꺼내기
		int value2 = array1[2];
		System.out.println(value2);
		
		
	}

}

