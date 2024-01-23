package m_Chapter12;

//! java.lang
// : 자바 프로그램의 가장 기본적인 클래스들을 퐇람
// : 다른 모든 자바 애플리케이션에서 기본적으로 사용 가능
// : 별도의 import 문 없이 사용 가능

//? Object 클래스
// : 자바의 모든 클래스의 최상위 클래스
// : 모든 클래스는 Object 클래스로 부터 상속 받음, 기본적으로 생략 가능

// - toString() 메서드
// : 객체의 문자열 표현을 반환

// - equals() 메서드
// : 두 객체가 동등한지 비교

//? Math 클래스
// : 수학적 연산 및 함수를 제공하는 유틸리티 클래스
// : 모든 메서드와 변수가 static >> 객체 생성 없이 사용 가능
// abs(데이터): 절대값 반환
// max(데이터1, 데이터2), min(데이터1, 데이터2): 최대값과 최소값을 반환
// sprt(데이터): 제곱근 계산
// random(): 0.0과 1.0사이의 난수를 생성
// pow(데이터1, 데이터2): 거듭제곱 계산

//? String 클래스
// : 문자열의 내용 작성에 유용한 유틸리티를 담은 클래스
// - length(): 문자열의 길이를 반환
// - equals(데이터1, 데이터2): 두 문자열을 비교
// - substring(int 시작 인덱스, int 끝인덱스): 부분 문자열을 반환

// - indexOf(String str): 특정 문자열의 위치를 찾음
// - charAt(int index): 특정 위치의 문자를 반환

class MyClass {
	private int id;
	private String name;
	
	public MyClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MyClass{" + id + name + "}";
	}
	
}

public class E_Java_Lang {
	public static void main(String[] args) {
		MyClass myClass = new MyClass(123, "이승아");
		System.out.println(myClass.toString());
		
		System.out.println("Object 클래스");
		String name = "이승아";
		System.out.println(name);
		String nickname = name;
		String nickname2 = "이승아";
		System.out.println(nickname);
		System.out.println(name.equals(nickname)); // true
		System.out.println(name.equals(nickname2)); // true
		
		System.out.println(name == nickname); // true
		
		System.out.println("Math 클래스");
		double result1 = Math.abs(-3.5);
		System.out.println(result1);
		System.out.println(Math.max(1234512412, 123421414));
		System.out.println(Math.random());
		System.out.println(Math.pow(2, 4));
		
		System.out.println("String 클래스");
		String hello = "Hello, World!";
		
		// 길이 : 13
		// >> 문자열의 길이에는 문자 뿐만 아니라 기호와 띄어쓰기도 포함
		int length = hello.length();
		System.out.println(length);
		
		// equals 메서드는 boolean 값을 반환
		
		boolean isEqual = hello.equals("hello, World!");
		System.out.println(isEqual);
		
		// substring(시작번호, 끝번호);
		// 시작 번호는 포함(이상)
		// 끝 번호는 포함하지 않은(미만)
		String sub = hello.substring(7,12); // "World"
		System.out.println(sub);
		
		
	}
}
