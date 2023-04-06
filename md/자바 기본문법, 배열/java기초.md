# 자바

프로그램

컴퓨터에서 실행될 때 특정 작업을 수행하는 일련의 명령어들의 모음

운영체제(Operation System, OS)

시스템 하드웨어를 관리할 뿐 아니라 응용 소프트웨어를 실행하기 위하여 하드웨어 추상화 플랫폼과 공통 시스템 서비스를 제공하는 시스템 소프트웨어

자바에서 음수를 표현할 때는 

2의 보수법을 사용

2진수 

1 0 0 0 1 0 0 1  

맨 앞이 1이면 음수를 표현  0과 1을 뒤집는다

 0 1 1 1 0 1 1 0

그후 1을 더해준다

0 1 1 1 0 1 1 1

0 64 32 16 0 4 2 1  다 더하면 119

이므로 

10001001 = -119 이다

자바 가상 머신이란

자바 바이트코드를 실행할 수 있는 주체

자바 바이트코드는 플랫폼에 독립적이며 모든 jvm은 자바 가상 머신 규격에 정의된 대로 자바 바이트코드를 실행

zulu JDK download

# main method
실행 명령인 java를 실행 시 가장 먼저 호출 되는 부분
만약, Application 에서 main() 메소드가 없다면 절대로 실행 될 수 없음
Application의 시작 -> 특정 클래스의 main() 실행
형태 (고정된 형태)

public static void main(Strin [] args){}

# 주석
//내용 : 그줄 끝까지 주석처리
/* 내용 */  해당 범위 주석처리
/** 내용 */ Documentation API를 위한 주석처리

 # 출력문
 print   문자열 그대로
 println  문자열 + /n  한줄 띄우기
 printf  형식 지정자
    %d : 정수
    %f : 실수
    %c : 문자
    %s : 문자열

    package day0331;

public class Test03_Print {
	public static void main(String[] args) {
		
	System.out.print("Hello SSAFY\n");
	System.out.print("Hello Great\n");
	
	System.out.println("\\");
	System.out.println("\"");
	
	System.out.printf("%d\n", 10);
	System.out.printf("%4d\n", 10);
	System.out.printf("%-4d\n", 10);
	System.out.printf("%04d\n", 10);
	
	System.out.printf("%f\n", 10.1);
	System.out.printf("%f\n", 10.12345678);
	System.out.printf("%.2f\n", 10.12345678);
	
	
	}
}


